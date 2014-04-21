package gg.cloud9.euls.models;

import gg.cloud9.euls.Utils;
import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.protobuf.NonSpectator;
import gg.cloud9.euls.models.protobuf.PlayerResource;
import skadistats.clarity.match.Match;
import skadistats.clarity.model.Entity;

import java.util.ArrayList;
import java.util.List;

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
            this.playerResource = new PlayerResource(playerResource);
        }
        Entity direData = this.match.getEntities().getByDtName("DT_DOTA_DataDire");
        if (direData != null) {
            this.direData = new NonSpectator(direData);
        }
        Entity radiantData = this.match.getEntities().getByDtName("DT_DOTA_DataRadiant");
        if (radiantData != null) {
            this.radiantData = new NonSpectator(radiantData);
        }
    }

    public Long getSteamId() {
        if (playerResource != null) {
            List<Long> steamIds = playerResource.getSteamIds();
            if (steamIds != null && steamIds.size() > playerIndex) {
                return steamIds.get(playerIndex);
            }
        }
        return null;
    }

    public Team getTeam() {
        if (playerResource != null) {
            List<Team> teams = playerResource.getTeams();
            if (teams != null && teams.size() > playerIndex) {
                return teams.get(playerIndex);
            }
        }
        return null;
    }

    public DotaHero getHero() {
        Hero heroConstant = getHeroHelper();
        if (heroConstant != null) {
            String internalName = heroConstant.getInternalName();
            return new DotaHero(this.match.getEntities().getByDtName(internalName));
        }
        return null;
    }

    private Hero getHeroHelper() {
        if (playerResource != null) {
            List<Hero> heros = playerResource.getSelectedHero();
            if (heros != null && heros.size() > playerIndex) {
                return heros.get(playerIndex);
            }
        }
        return null;
    }

    public List<DotaItem> getItems() {
        ArrayList<DotaItem> items = new ArrayList<DotaItem>();

        DotaHero hero = getHero();

        if (hero != null) {
            List<Integer> itemHandles = hero.getCurrentItemHandles();
            List<Entity> itemEntities = Utils.getEntityFromHandles(itemHandles, this.match.getEntities());

            for (Entity itemEntity : itemEntities) {
                if (itemEntity != null) {
                    items.add(new DotaItem(itemEntity));
                } else {
                    items.add(null);
                }
            }
        }

        return items;
    }

    public Integer getCurrentTotalAssists() {
        if (playerResource != null) {
            List<Integer> currentTotalAssists = playerResource.getCurrentTotalAssists();
            if (currentTotalAssists != null && currentTotalAssists.size() > playerIndex) {
                return currentTotalAssists.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentTotalDeaths() {
        if (playerResource != null) {
            List<Integer> currentTotalDeaths = playerResource.getCurrentTotalDeaths();
            if (currentTotalDeaths != null && currentTotalDeaths.size() > playerIndex) {
                return currentTotalDeaths.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentDenies() {
        if (playerResource != null) {
            List<Integer> currentDenies = playerResource.getCurrentDenies();
            if (currentDenies != null && currentDenies.size() > playerIndex) {
                return currentDenies.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentTotalKills() {
        if (playerResource != null) {
            List<Integer> currentKills = playerResource.getCurrentTotalKills();
            if (currentKills != null && currentKills.size() > playerIndex) {
                return currentKills.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentLastHits() {
        if (playerResource != null) {
            List<Integer> currentLastHits = playerResource.getCurrentLastHits();
            if (currentLastHits != null && currentLastHits.size() > playerIndex) {
                return currentLastHits.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentLevel() {
        if (playerResource != null) {
            List<Integer> currentLevels = playerResource.getCurrentLevels();
            if (currentLevels != null && currentLevels.size() > playerIndex) {
                return currentLevels.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentReliableGold() {
        Team team = getTeam();
        if (team != null && radiantData != null && direData != null) {
            List<Integer> gold = null;
            if (team == team.RADIANT) {
                gold = radiantData.getCurrentReliableGold();
            }
            if (team == team.DIRE) {
                gold = direData.getCurrentReliableGold();
            }
            if (gold != null && gold.size() > playerIndex) {
                return gold.get(playerIndex);
            }
        }
        return null;
    }

    public Integer getCurrentUnreliableGold() {
        Team team = getTeam();
        if (team != null && radiantData != null && direData != null) {
            List<Integer> gold = null;
            if (team == team.RADIANT) {
                gold = radiantData.getCurrentUnreliableGold();
            }
            if (team == team.DIRE) {
                gold = direData.getCurrentUnreliableGold();
            }
            if (gold != null && gold.size() > playerIndex) {
                return gold.get(playerIndex);
            }
        }
        return null;
    }
}
