package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;
import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.transformers.HeroToEnum;
import gg.cloud9.euls.models.transformers.TeamToEnum;

import java.util.List;

/**
 * PlayerResource - Represents DT_DOTA_PlayerResource
 */
public interface PlayerResource {
    @DotAArrayProperty(type = Long.class, propertyName = "m_iPlayerSteamIDs")
    public List<Long> getSteamIds();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iPlayerTeams", transformer = TeamToEnum.class)
    public List<Team> getTeams();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iReliableGoldDire")
    public List<Integer> getDireCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iUnreliableGoldDire")
    public List<Integer> getDireCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iReliableGoldRadiant")
    public List<Integer> getRadiantCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iUnreliableGoldRadiant")
    public List<Integer> getRadiantCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_nSelectedHeroID", transformer = HeroToEnum.class)
    public List<Hero> getSelectedHero();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iAssists")
    public List<Integer> getCurrentTotalAssists();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDeaths")
    public List<Integer> getCurrentTotalDeaths();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDenyCount")
    public List<Integer> getCurrentDenies();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iKills")
    public List<Integer> getCurrentTotalKills();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLastHitCount")
    public List<Integer> getCurrentLastHits();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLevel")
    public List<Integer> getCurrentLevels();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iStreak")
    public List<Integer> getCurrentKillStreak();


}
