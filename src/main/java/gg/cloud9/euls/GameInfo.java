package gg.cloud9.euls;

import gg.cloud9.euls.constants.DotaGameConstants;
import gg.cloud9.euls.constants.DotaGameInfoConstants;
import skadistats.clarity.match.Match;

import java.util.Arrays;

public class GameInfo {
    private Match match;

    public GameInfo(Match match) {
        this.match = match;
    }

    // Returns Match ID of Game
    public float getMatchId() {
        Integer matchId = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_unMatchID");
        return matchId != null ? (int) matchId : 0;
    }

    // Returns game mode
    public String getGameMode() {
        Integer gameMode = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_iGameMode");
        if (gameMode != null && DotaGameInfoConstants.GAME_MODE.containsKey(gameMode)) {
            return DotaGameInfoConstants.GAME_MODE.get(gameMode);
        }
        return "";
    }

    // Returns game winner
    public String getGameWinner() {
        Integer winner = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_nGameWinner");
        if (winner != null && DotaGameInfoConstants.GAME_WINNER.containsKey(winner)) {
            return DotaGameInfoConstants.GAME_WINNER.get(winner);
        }
        return "";
    }

    // Returns array of Captain Index
    public Integer[] getCaptainIndex() {
        return Utils.getArrayPropertyFromEntity(this.match.getGameRulesProxy(), Integer.class, "dota_gamerules_data.m_iCaptainPlayerIDs");
    }

    // Returns team that picked first
    public String getStartingTeamForDraft() {
        Integer startingTeam = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_iStartingTeam");
        if (startingTeam != null && DotaGameConstants.TEAM.containsKey(startingTeam)) {
            return DotaGameConstants.TEAM.get(startingTeam);
        }
        return "";
    }

    // Returns current state of game
    public String getCurrentGameState() {
        Integer gameState = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_nGameState");
        if (gameState != null && DotaGameInfoConstants.GAME_STATE.containsKey(gameState)) {
            return DotaGameInfoConstants.GAME_STATE.get(gameState);
        }
        return "";
    }

    // Returns current time of the Game
    public float getCurrentGameTime() {
        return this.match.getGameTime();
    }

    // Returns current pausing team
    public String getCurrentPausingTeam() {
        Integer pausingTeam = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_iPauseTeam");
        if (pausingTeam != null && DotaGameConstants.TEAM.containsKey(pausingTeam)) {
            return DotaGameConstants.TEAM.get(pausingTeam);
        }
        return "";
    }

    public boolean isPaused() {
        String pausingTeam = getCurrentPausingTeam();
        return DotaGameConstants.TEAM_REVERSE.containsKey(pausingTeam);
    }

    // Returns team currently banning or picking
    public String getCurrentActiveTeam() {
        Integer activeTeam = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_iActiveTeam");
        if (activeTeam != null && DotaGameConstants.TEAM.containsKey(activeTeam)) {
            return DotaGameConstants.TEAM.get(activeTeam);
        }
        return "";
    }

    // Returns extra time for Radiant
    public float getCurrentRadiantExtraTime() {
        Float[] extraTime = getCurrentExtraTime();
        return extraTime != null ? extraTime[0] : 0.0f;
    }

    // Returns extra time for Dire
    public float getCurrentDireExtraTime() {
        Float[] extraTime = getCurrentExtraTime();
        return extraTime != null ? extraTime[1] : 0.0f;
    }

    // Returns extra time for both teams
    public Float[] getCurrentExtraTime() {
        return Utils.getArrayPropertyFromEntity(this.match.getGameRulesProxy(), Float.class, "dota_gamerules_data.m_fExtraTimeRemaining");
    }

    // Returns current bans for Radiant
    public String[] getCurrentRadiantBans() {
        String[] currentBans = getCurrentBans();
        return currentBans != null ? Arrays.copyOfRange(currentBans, 0, 5) : null;
    }

    // Returns current bans for Dire
    public String[] getCurrentDireBans() {
        String[] currentBans = getCurrentBans();
        return currentBans != null ? Arrays.copyOfRange(currentBans, 5, 10) : null;
    }

    // Returns bans for both teams
    public String[] getCurrentBans() {
        Integer[] currentBansId = Utils.getArrayPropertyFromEntity(this.match.getGameRulesProxy(), Integer.class, "dota_gamerules_data.m_BannedHeroes");
        if (currentBansId != null) {
            String[] currentBans = new String[currentBansId.length];
            for (int i = 0; i < currentBansId.length; i++) {
                currentBans[i] = DotaGameConstants.HEROES.get(currentBansId[i]);
            }
            return currentBans;
        }
        return null;
    }

    // Returns current picks for Radiant
    public String[] getCurrentRadiantPicks() {
        String[] currentPicks = getCurrentPicks();
        return currentPicks != null ? Arrays.copyOfRange(currentPicks, 0, 5) : null;
    }

    // Returns current picks for Dire
    public String[] getCurrentDirePicks() {
        String[] currentPicks = getCurrentPicks();
        return currentPicks != null ? Arrays.copyOfRange(currentPicks, 5, 10) : null;
    }

    // Returns picks for both teams
    public String[] getCurrentPicks() {
        Integer[] currentPicksId = Utils.getArrayPropertyFromEntity(this.match.getGameRulesProxy(), Integer.class, "dota_gamerules_data.m_SelectedHeroes");
        if (currentPicksId != null) {
            String[] currentPicks = new String[currentPicksId.length];
            for (int i = 0; i < currentPicksId.length; i++) {
                currentPicks[i] = DotaGameConstants.HEROES.get(currentPicksId[i]);
            }
            return currentPicks;
        }
        return null;
    }

    // TODO : This is not useable yet
    public int getPickState() {
        // Might want to look into dota_gamerules_data.m_iCDModePickBanOrder
        Integer pickState = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_iHeroPickState");
        return pickState != null ? pickState : 0;
    }

    // Returns time when game changed to loading
    public float getLoadTime() {
        Float loadTime = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_flGameLoadTime");
        return loadTime != null ? (float) loadTime : 0.0f;
    }

    // Returns time when draft started
    public float getDraftStartTime() {
        Float draftStartTime = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_flHeroPickStateTransitionTime");
        return draftStartTime != null ? (float) draftStartTime : 0.0f;
    }

    // Returns time when pregame started
    public float getPreGameStartTime() {
        Float preGameStartTime = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_flPreGameStartTime");
        return preGameStartTime != null ? (float) preGameStartTime : 0.0f;
    }

    // Returns time when game started
    public float getGameStartTime() {
        Float gameStartTime = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_flGameStartTime");
        return gameStartTime != null ? (float) gameStartTime : 0.0f;
    }

    // Returns time when game ended
    public float getGameEndTime() {
        Float gameEndTime = Utils.getPropertyFromEntity(this.match.getGameRulesProxy(), "dota_gamerules_data.m_flGameEndTime");
        return gameEndTime != null ? (float) gameEndTime : 0.0f;
    }

}
