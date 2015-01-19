package ykim.euls.models;

import ykim.euls.constants.Rune;
import ykim.euls.models.protobuf.Entity;

public class DotaRune extends Entity{
    public DotaRune(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getRuneType() {
        return getProperty(Integer.class, "m_iRuneType");
    }

    public Rune getRune() {
        return Rune.fromId(getRuneType()).orNull();
    }
}
