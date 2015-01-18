package ykim.euls.models.protobuf;

import ykim.euls.constants.Hero;
import ykim.euls.constants.Team;
import ykim.euls.constants.gamerule.GameMode;
import ykim.euls.constants.gamerule.GamePickState;
import ykim.euls.constants.gamerule.GameState;
import ykim.euls.constants.gamerule.GameWinner;
import ykim.euls.models.protobuf.base.EntityBase;
import ykim.euls.models.transformers.HeroToEnum;
import ykim.euls.models.transformers.IntegerToBoolean;
import ykim.euls.models.transformers.TeamToEnum;
import ykim.euls.models.transformers.gamerule.GameModeToEnum;
import ykim.euls.models.transformers.gamerule.GamePickStateToEnum;
import ykim.euls.models.transformers.gamerule.GameStateToEnum;
import ykim.euls.models.transformers.gamerule.GameWinnerToEnum;

import java.util.List;

/**
 * GameRules - Represents DT_DOTAGamerulesProxy
 */
public class GameRules extends EntityBase {

    public GameRules(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getMatchId() {
        return getProperty(Integer.class, "dota_gamerules_data.m_unMatchID");
    }

    public String getGameName() {
        return getProperty(String.class, "dota_gamerules_data.m_lobbyGameName");
    }

    public Integer getLeagueId() {
        return getProperty(Integer.class, "dota_gamerules_data.m_lobbyLeagueID");
    }

    public GameMode getGameMode() {
        GameModeToEnum transformer = new GameModeToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_iGameMode"));
    }

    public Boolean isPaused() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_bGamePaused"));
    }

    public GameWinner getGameWinner() {
        GameWinnerToEnum transformer = new GameWinnerToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_nGameWinner"));
    }

    public List<Integer> getCaptainIndex() {
        return getListProperty(Integer.class, "dota_gamerules_data.m_iCaptainPlayerIDs");
    }

    public Team getStartingTeamForDraft() {
        TeamToEnum transformer = new TeamToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_iStartingTeam"));
    }

    public GameState getCurrentGameState() {
        GameStateToEnum transformer = new GameStateToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_nGameState"));
    }

    public Team getCurrentPausingTeam() {
        TeamToEnum transformer = new TeamToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_iPauseTeam"));
    }

    public Team getCurrentActiveTeam() {
        TeamToEnum transformer = new TeamToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_iActiveTeam"));
    }

    public List<Float> getCurrentExtraTime() {
        return getListProperty(Float.class, "dota_gamerules_data.m_fExtraTimeRemaining");
    }

    public List<Hero> getCurrentBansByHero() {
        HeroToEnum transfomer = new HeroToEnum();
        return transfomer.transformArray(getCurrentBansByHeroId());
    }

    public List<Integer> getCurrentBansByHeroId() {
        return getListProperty(Integer.class, "dota_gamerules_data.m_BannedHeroes");
    }

    public List<Hero> getCurrentPicksByHero() {
        HeroToEnum transfomer = new HeroToEnum();
        return transfomer.transformArray(getCurrentPicksByHeroId());
    }

    public List<Integer> getCurrentPicksByHeroId() {
        return getListProperty(Integer.class, "dota_gamerules_data.m_SelectedHeroes");
    }

    public GamePickState getGamePickState() {
        GamePickStateToEnum transformer = new GamePickStateToEnum();
        return transformer.transform(getProperty(Integer.class, "dota_gamerules_data.m_nHeroPickState"));
    }

    public Float getCurrentGameTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_fGameTime");
    }

    public Float getLoadTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_flGameLoadTime");
    }

    public Float getDraftStartTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_flHeroPickStateTransitionTime");
    }

    public Float getPreGameStartTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_flPreGameStartTime");
    }

    public Float getGameStartTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_flGameStartTime");
    }

    public Float getGameEndTime() {
        return getProperty(Float.class, "dota_gamerules_data.m_flGameEndTime");
    }

}
