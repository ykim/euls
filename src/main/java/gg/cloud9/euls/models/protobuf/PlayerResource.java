package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;
import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.transformers.HeroToEnum;
import gg.cloud9.euls.models.transformers.TeamToEnum;

/**
 * PlayerResource - Represents DT_DOTA_PlayerResource
 */
public interface PlayerResource {
    @DotAArrayProperty(type = Long.class, propertyName = "m_iPlayerSteamIDs")
    public Long[] getSteamIds();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iPlayerTeams", transformer = TeamToEnum.class)
    public Team[] getTeams();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iReliableGoldDire")
    public Integer[] getDireCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "DireOnlyData.m_iUnreliableGoldDire")
    public Integer[] getDireCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iReliableGoldDire")
    public Integer[] getRadiantCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "RadiantOnlyData.m_iUnreliableGoldDire")
    public Integer[] getRadiantCurrentUnreliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_nSelectedHeroID", transformer = HeroToEnum.class)
    public Hero[] getSelectedHero();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iAssists")
    public Integer[] getCurrentTotalAssists();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDeaths")
    public Integer[] getCurrentTotalDeaths();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iDenyCount")
    public Integer[] getCurrentDenies();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iKills")
    public Integer[] getCurrentTotalKills();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLastHitCount")
    public Integer[] getCurrentLastHits();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iLevel")
    public Integer[] getCurrentLevels();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iStreak")
    public Integer[] getCurrentKillStreak();


}
