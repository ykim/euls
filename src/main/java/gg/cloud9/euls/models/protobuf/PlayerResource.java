package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.protobuf.base.EntityBase;
import gg.cloud9.euls.models.transformers.HeroToEnum;
import gg.cloud9.euls.models.transformers.TeamToEnum;

import java.util.List;

/**
 * PlayerResource - Represents DT_DOTA_PlayerResource
 */
public class PlayerResource extends EntityBase {

    public PlayerResource(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public List<Long> getSteamIds() {
        return getListProperty(Long.class, "m_iPlayerSteamIDs");
    }

    public List<Team> getTeams() {
        TeamToEnum transformer = new TeamToEnum();
        return transformer.transformArray(getListProperty(Integer.class, "m_iPlayerTeams"));
    }

    public List<Integer> getDireCurrentReliableGold() {
        return getListProperty(Integer.class, "DireOnlyData.m_iReliableGoldDire");
    }

    public List<Integer> getDireCurrentUnreliableGold() {
        return getListProperty(Integer.class, "DireOnlyData.m_iUnreliableGoldDire");
    }

    public List<Integer> getRadiantCurrentReliableGold() {
        return getListProperty(Integer.class, "RadiantOnlyData.m_iReliableGoldRadiant");
    }

    public List<Integer> getRadiantCurrentUnreliableGold() {
        return getListProperty(Integer.class, "RadiantOnlyData.m_iUnreliableGoldRadiant");
    }

    public List<Hero> getSelectedHero() {
        HeroToEnum transformer = new HeroToEnum();
        return transformer.transformArray(getListProperty(Integer.class, "m_nSelectedHeroID"));
    }

    public List<Integer> getCurrentTotalAssists() {
        return getListProperty(Integer.class, "m_iAssists");
    }

    public List<Integer> getCurrentTotalDeaths() {
        return getListProperty(Integer.class, "m_iDeaths");
    }

    public List<Integer> getCurrentDenies() {
        return getListProperty(Integer.class, "m_iDenyCount");
    }

    public List<Integer> getCurrentTotalKills() {
        return getListProperty(Integer.class, "m_iKills");
    }

    public List<Integer> getCurrentLastHits() {
        return getListProperty(Integer.class, "m_iLastHitCount");
    }

    public List<Integer> getCurrentLevels() {
        return getListProperty(Integer.class, "m_iLevel");
    }

    public List<Integer> getCurrentKillStreak() {
        return getListProperty(Integer.class, "m_iStreak");
    }


}
