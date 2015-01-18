package ykim.euls.models.protobuf;

/**
 * Player - Represents DT_DOTAPlayer
 */
public class Player extends Entity {

    public Player(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getPlayerId() {
        return getProperty(Integer.class, "m_iPlayerID");
    }

    public Integer getHeroHandle() {
        return getProperty(Integer.class, "m_hAssignedHero");
    }
}
