package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;
import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.transformers.HeroToEnum;
import gg.cloud9.euls.models.transformers.TeamToEnum;

import java.util.ArrayList;

/**
 * PlayerResource - Represents DT_DOTA_PlayerResource
 */
public interface PlayerResource {
    @DotAArrayProperty(type = Long.class, propertyName = "m_iPlayerSteamIDs")
    public ArrayList<Long> getSteamIds();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iPlayerTeams", transformer = TeamToEnum.class)
    public ArrayList<Team> getTeams();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iReliableGoldDire")
    public ArrayList<Integer> getDireCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iUnreliableGoldDire")
    public ArrayList<Integer> getDireCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iReliableGoldRadiant")
    public ArrayList<Integer> getRadiantCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iUnreliableGoldRadiant")
    public ArrayList<Integer> getRadiantCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_nSelectedHeroID", transformer = HeroToEnum.class)
    public ArrayList<Hero> getSelectedHero();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iAssists")
    public ArrayList<Integer> getCurrentTotalAssists();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDeaths")
    public ArrayList<Integer> getCurrentTotalDeaths();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDenyCount")
    public ArrayList<Integer> getCurrentDenies();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iKills")
    public ArrayList<Integer> getCurrentTotalKills();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLastHitCount")
    public ArrayList<Integer> getCurrentLastHits();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLevel")
    public ArrayList<Integer> getCurrentLevels();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iStreak")
    public ArrayList<Integer> getCurrentKillStreak();


}
