package gg.cloud9.euls.models;

import gg.cloud9.euls.Utils;
import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.protobuf.NonSpectator;
import gg.cloud9.euls.models.protobuf.PlayerResource;
import skadistats.clarity.match.Match;
import skadistats.clarity.model.Entity;

/**
 * DotaPlayer - Model to access objects for a Player
 */
public class DotaPlayer {
    private Match match;
    private Integer playerIndex;

    // Internal cache
    private PlayerResource playerResource;
    private NonSpectator direData;
    private NonSpectator radiantData;

    public DotaPlayer(Match match, Integer index) {
        this.match = match;
        this.playerIndex = index;
    }

    // Do not use this unless you know what you are doing
    public void tick() {
        Entity playerResource = this.match.getPlayerResource();
        if (playerResource != null) {
            this.playerResource = ModelProxyFactory.getProxy(PlayerResource.class, playerResource);
        }
        Entity direData = this.match.getEntities().getByDtName("DT_DOTA_DataDire");
        if (direData != null) {
            this.direData = ModelProxyFactory.getProxy(NonSpectator.class, direData);
        }
        Entity radiantData = this.match.getEntities().getByDtName("DT_DOTA_DataRadiant");
        if (radiantData != null) {
            this.radiantData = ModelProxyFactory.getProxy(NonSpectator.class, radiantData);
        }
    }

    public Long getSteamId() {
        if (playerResource != null) {
            Long[] steamIds = playerResource.getSteamIds();
            if (steamIds != null) {
                return steamIds[playerIndex];
            }
        }
        return null;
    }

    public Team getTeam() {
        if (playerResource != null) {
            Team[] teams = playerResource.getTeams();
            if (teams != null) {
                return teams[playerIndex];
            }
        }
        return null;
    }

    public Hero getHero() {
        if (playerResource != null) {
            Hero[] heros = playerResource.getSelectedHero();
            if (heros != null) {
                return heros[playerIndex];
            }
        }
        return null;
    }

    public DotaHero getHeroProperty() {
        Hero heroConstant = getHero();
        if (heroConstant != null) {
            String internalName = heroConstant.getInternalName();
            return ModelProxyFactory.getProxy(DotaHero.class, this.match.getEntities().getByDtName(internalName));
        }
        return null;
    }

    // TODO: Return Item constants

    public DotaItem[] getItemProperty() {
        DotaHero hero = getHeroProperty();
        if (hero != null) {
            Integer[] itemHandles = hero.getCurrentItemHandles();

            if (itemHandles != null) {
                Entity[] itemEntities = Utils.getEntityFromHandles(itemHandles, this.match.getEntities());
                DotaItem[] items = new DotaItem[itemEntities.length];

                for (int i = 0; i < itemEntities.length; i++) {
                    if (itemEntities[i] != null) {
                        items[i] = ModelProxyFactory.getProxy(DotaItem.class, itemEntities[i]);
                    } else {
                        items[i] = null;
                    }
                }

                return items;
            }
        }
        return null;
    }

    public Integer getCurrentTotalAssists() {
        if (playerResource != null) {
            Integer[] currentTotalAssists = playerResource.getCurrentTotalAssists();
            if (currentTotalAssists != null) {
                return currentTotalAssists[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentTotalDeaths() {
        if (playerResource != null) {
            Integer[] currentTotalDeaths = playerResource.getCurrentTotalDeaths();
            if (currentTotalDeaths != null) {
                return currentTotalDeaths[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentDenies() {
        if (playerResource != null) {
            Integer[] currentDenies = playerResource.getCurrentDenies();
            if (currentDenies != null) {
                return currentDenies[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentTotalKills() {
        if (playerResource != null) {
            Integer[] currentKills = playerResource.getCurrentTotalKills();
            if (currentKills != null) {
                return currentKills[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentLastHits() {
        if (playerResource != null) {
            Integer[] currentLastHits = playerResource.getCurrentLastHits();
            if (currentLastHits != null) {
                return currentLastHits[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentLevel() {
        if (playerResource != null) {
            Integer[] currentLevels = playerResource.getCurrentLevels();
            if (currentLevels != null) {
                return currentLevels[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentReliableGold() {
        Team team = getTeam();
        if (team != null && radiantData != null && direData != null) {
            Integer[] gold = null;
            if (team == team.RADIANT) {
                gold = radiantData.getCurrentReliableGold();
            }
            if (team == team.DIRE) {
                gold = direData.getCurrentReliableGold();
            }
            if (gold != null && gold.length > playerIndex) {
                return gold[playerIndex];
            }
        }
        return null;
    }

    public Integer getCurrentUnreliableGold() {
        Team team = getTeam();
        if (team != null && radiantData != null && direData != null) {
            Integer[] gold = null;
            if (team == team.RADIANT) {
                gold = radiantData.getCurrentUnreliableGold();
            }
            if (team == team.DIRE) {
                gold = direData.getCurrentUnreliableGold();
            }
            if (gold != null && gold.length > playerIndex) {
                return gold[playerIndex];
            }
        }
        return null;
    }
}
