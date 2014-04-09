package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;
import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.constants.gamerule.GameMode;
import gg.cloud9.euls.constants.gamerule.GameState;
import gg.cloud9.euls.constants.gamerule.GameWinner;
import gg.cloud9.euls.models.transformers.TeamToEnum;
import gg.cloud9.euls.models.transformers.gamerule.GameModeToEnum;
import gg.cloud9.euls.models.transformers.gamerule.GameStateToEnum;
import gg.cloud9.euls.models.transformers.gamerule.GameWinnerToEnum;

/**
 * GameRules - Represents DT_DOTAGamerulesProxy
 */
public interface GameRules {

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_unMatchID")
    public Integer getMatchId();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_iGameMode", transformer = GameModeToEnum.class)
    public GameMode getGameMode();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_nGameWinner", transformer = GameWinnerToEnum.class)
    public GameWinner getGameWinner();

    @DotAArrayProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_iCaptainPlayerIDs")
    public Integer[] getCaptainIndex();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_iStartingTeam", transformer = TeamToEnum.class)
    public Team getStartingTeamForDraft();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_nGameState", transformer = GameStateToEnum.class)
    public GameState getCurrentGameState();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_iPauseTeam", transformer = TeamToEnum.class)
    public Team getCurrentPausingTeam();

    @DotAProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_iActiveTeam", transformer = TeamToEnum.class)
    public Team getCurrentActiveTeam();

    @DotAArrayProperty(type = Float.class, propertyName = "dota_gamerules_data.m_fExtraTimeRemaining")
    public Float[] getCurrentExtraTime();

    @DotAArrayProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_BannedHeroes")
    public Integer[] getCurrentBansByHeroId();

    @DotAArrayProperty(type = Integer.class, propertyName = "dota_gamerules_data.m_SelectedHeroes")
    public Integer[] getCurrentPicksByHeroId();

    // TODO: Add in who is picking right now for what (i.e. picks and bans)
    // Look at dota_gamerules_data.m_nHeroPickState or m_iCDModePickBanOrder

    @DotAProperty(type = Float.class, propertyName = "dota_gamerules_data.m_flGameLoadTime")
    public Float getLoadTime();

    @DotAProperty(type = Float.class, propertyName = "dota_gamerules_data.m_flHeroPickStateTransitionTime")
    public Float getDraftStartTime();

    @DotAProperty(type = Float.class, propertyName = "dota_gamerules_data.m_flPreGameStartTime")
    public Float getPreGameStartTime();

    @DotAProperty(type = Float.class, propertyName = "dota_gamerules_data.m_flGameStartTime")
    public Float getGameStartTime();

    @DotAProperty(type = Float.class, propertyName = "dota_gamerules_data.m_flGameEndTime")
    public Float getGameEndTime();

}
