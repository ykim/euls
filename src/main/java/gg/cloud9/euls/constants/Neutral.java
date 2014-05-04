package gg.cloud9.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;

import java.util.EnumSet;

public enum Neutral {
    KOBOLD("Kobold", "n_creep_kobold_c.mdl", 1, NeutralType.SMALL),
    KOBOLD_TUNNELER("Kobold Tunneler", "n_creep_kobold_b.mdl", 1, NeutralType.SMALL),
    KOBOLD_FOREMAN("Kobold Foreman", "n_creep_kobold_a.mdl", 2, NeutralType.SMALL),
    HILL_TROLL_BERSERKER("Hill Troll Berserker", "n_creep_forest_troll_berserker.mdl", 2, NeutralType.SMALL),
    HILL_TROLL_PRIEST("Hill Troll Priest", "n_creep_forest_troll_high_priest.mdl", 2, NeutralType.SMALL),
    VHOUL_ASSASSIN("Vhoul Assassin", "n_creep_gnoll.mdl", 2, NeutralType.SMALL),
    FELL_SPIRIT("Fell Spirit", "n_creep_ghost_b.mdl", 2, NeutralType.SMALL),
    GHOST("Ghost", "n_creep_ghost_a.mdl", 3, NeutralType.SMALL),
    HARPY_SCOUT("Harpy Scout", "n_creep_harpy_a.mdl", 2, NeutralType.SMALL),
    HARPY_STORMCRAFTER("Harpy Stormcrafter", "n_creep_harpy_b.mdl", 3, NeutralType.SMALL),
    CENTAUR_COURSER("Centaur Courser", "n_creep_centaur_med.mdl", 2, NeutralType.MEDIUM_OR_LARGE),
    CENTAUR_CONQUERER("Centaur Conquerer", "n_creep_centaur_lrg.mdl", 5, NeutralType.MEDIUM_OR_LARGE),
    GIANT_WOLF("Giant Wolf", "n_creep_worg_small.mdl", 3, NeutralType.MEDIUM),
    ALPHA_WOLF("Alpha Wolf", "n_creep_worg_large.mdl", 4, NeutralType.MEDIUM),
    SATYR_BANISHER("Satyr Banisher", "n_creep_satyr_b.mdl", 2, NeutralType.MEDIUM_OR_LARGE),
    SATYR_MINDSTEALER("Satyr Mindstealer", "n_creep_satyr_c.mdl", 4, NeutralType.MEDIUM_OR_LARGE),
    OGRE_BRUISER("Ogre Bruiser", "n_creep_ogre_med.mdl", 2, NeutralType.MEDIUM),
    OGRE_FROSTMAGE("Ogre Frostmage", "n_creep_ogre_lrg.mdl", 3, NeutralType.MEDIUM),
    MUD_GOLEM("Mud Golem", "n_creep_golem_b.mdl", 5, NeutralType.MEDIUM),
    SATYR_TORMENTER("Satyr Tormenter", "n_creep_satyr_a.mdl", 6, NeutralType.LARGE),
    HELLBEAR("Hellbear", "n_creep_beast.mdl", 4, NeutralType.LARGE),
    HELLBEAR_SMASHER("Hellbear Smasher", "n_creep_furbolg_disrupter.mdl", 5, NeutralType.LARGE),
    WILDWING("Wildwing", "n_creep_vulture_b.mdl", 1, NeutralType.LARGE),
    WILDWING_RIPPER("Wildwing Ripper", "n_creep_vulture_a.mdl", 5, NeutralType.LARGE),
    DARK_TROLL("Dark Troll", "n_creep_troll_dark_a.mdl", 3, NeutralType.LARGE),
    DARK_TROLL_SUMMONER("Dark Troll Summoner", "n_creep_troll_dark_b.mdl", 6, NeutralType.LARGE),
    BLACK_DRAKE("Black Drake", "n_creep_black_drake.mdl", 3, NeutralType.ANCIENT),
    BLACK_DRAGON("Black Dragon", "n_creep_black_dragon.mdl", 6, NeutralType.ANCIENT),
    ROCK_GOLEM("Rock Golem", "neutral_creep_golem_a.mdl", 5, NeutralType.ANCIENT),
    GRANITE_GOLEM("Granite Golem", "neutral_creep_golem_a.mdl", 6, NeutralType.ANCIENT),
    RUMBLEHIDE("Rumblehide", "n_creep_thunder_lizard_small.mdl", 5, NeutralType.ANCIENT),
    THUNDERHIDE("Thunderhide", "n_creep_thunder_lizard_big.mdl", 6, NeutralType.ANCIENT),
    STALKER("Stalker", "n_creep_gargoyle.mdl", 5, NeutralType.ANCIENT),
    PRIMAL_STALKER("Primal Stalker", "n_creep_jungle_stalker.mdl", 6, NeutralType.ANCIENT),
    DRAKKEN_SENTINEL("Drakken Sentinel", "n_creep_dragonspawn_a.mdl", 3, NeutralType.ANCIENT),
    DRAKKEN_ARMORER("Drakken Armorer", "n_creep_dragonspawn_b.mdl", 5, NeutralType.ANCIENT);

    private final String publicName;
    private final String modelName;
    private final Integer level;
    private final NeutralType neutralType;

    private Neutral(String publicName, String modelName, Integer level, NeutralType type) {
        this.publicName = publicName;
        this.modelName = modelName;
        this.level = level;
        this.neutralType = type;
    }

    public String getPublicName() {
        return publicName;
    }

    public String getModelName() {
        return modelName;
    }

    public NeutralType getType() {
        return neutralType;
    }

    private static final ImmutableTable<String, Integer, Neutral> reverseTable;

    static {
        ImmutableTable.Builder<String, Integer, Neutral> builder = ImmutableTable.builder();
        for (Neutral value : EnumSet.allOf(Neutral.class)) {
            builder.put(value.modelName, value.level, value);
        }
        reverseTable = builder.build();
    }

    public static Optional<Neutral> fromModelName(String modelName, Integer level) {
        Neutral value = reverseTable.get(modelName, level);
        return Optional.fromNullable(value);
    }
}
