package gg.cloud9.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum Item {
    BLINK(1, "Blink Dagger", "DT_DOTA_Item_BlinkDagger"),
    BLADES_OF_ATTACK(2, "Blades of Attack", ""),
    BROADSWORD(3, "Broadsword", ""),
    CHAINMAIL(4, "Chainmail", ""),
    CLAYMORE(5, "Claymore", ""),
    HELM_OF_IRON_WILL(6, "Helm of Iron Will", ""),
    JAVELIN(7, "Javelin", ""),
    MITHRIL_HAMMER(8, "Mithril Hammer", ""),
    PLATEMAIL(9, "Platemail", ""),
    QUARTERSTAFF(10, "Quarterstaff", ""),
    QUELLING_BLADE(11, "Quelling Blade", "DT_DOTA_Item_QuellingBlade"),
    RING_OF_PROTECTION(12, "Ring of Protection", ""),
    GAUNTLETS(13, "Gauntlets of Strength", ""),
    SLIPPERS(14, "Slippers of Agility", ""),
    MANTLE(15, "Mantle of Intelligence", ""),
    BRANCHES(16, "Iron Branch", ""),
    BELT_OF_STRENGTH(17, "Belt of Strength", ""),
    BOOTS_OF_ELVES(18, "Band of Elvenskin", ""),
    ROBE(19, "Robe of the Magi", ""),
    CIRCLET(20, "Circlet", ""),
    OGRE_AXE(21, "Ogre Club", ""),
    BLADE_OF_ALACRITY(22, "Blade of Alacrity", ""),
    STAFF_OF_WIZARDRY(23, "Staff of Wizardry", ""),
    ULTIMATE_ORB(24, "Ultimate Orb", ""),
    GLOVES(25, "Gloves of Haste", ""),
    LIFESTEAL(26, "Morbid Mask", ""),
    RING_OF_REGEN(27, "Ring of Regen", ""),
    SOBI_MASK(28, "Sage's Mask", ""),
    BOOTS(29, "Boots of Speed", ""),
    GEM(30, "Gem of True Sight", ""),
    CLOAK(31, "Cloak", ""),
    TALISMAN_OF_EVASION(32, "Talisman of Evasion", ""),
    CHEESE(33, "Cheese", ""),
    MAGIC_STICK(34, "Magic Stick", ""),
    MAGIC_WAND(36, "Magic Wand", ""),
    GHOST(37, "Ghost Scepter", ""),
    CLARITY(38, "Clarity", ""),
    FLASK(39, "Healing Salve", ""),
    DUST(40, "Dust of Appearance", ""),
    BOTTLE(41, "Bottle", "DT_DOTA_Item_EmptyBottle"),
    WARD_OBSERVER(42, "Observer Ward", "DT_DOTA_Item_ObserverWard"),
    WARD_SENTRY(43, "Sentry Ward", "DT_DOTA_Item_SentryWard"),
    TANGO(44, "Tango", "DT_DOTA_Item_Tango"),
    COURIER(45, "Courier", ""),
    TPSCROLL(46, "Town Portal Scroll", "DT_DOTA_Item_TeleportScroll"),
    TRAVEL_BOOTS(48, "Boots of Travel", "DT_DOTA_Item_BootsOfTravel"),
    PHASE_BOOTS(50, "Phase Boots", ""),
    DEMON_EDGE(51, "Demon Edge", ""),
    EAGLE(52, "Eaglesong", ""),
    REAVER(53, "Reaver", ""),
    RELIC(54, "Sacred Relic", ""),
    HYPERSTONE(55, "Hyperstone", ""),
    RING_OF_HEALTH(56, "Ring of Health", ""),
    VOID_STONE(57, "Void Stone", ""),
    MYSTIC_STAFF(58, "Mystic Staff", ""),
    ENERGY_BOOSTER(59, "Energy Booster", ""),
    POINT_BOOSTER(60, "Point Booster", ""),
    VITALITY_BOOSTER(61, "Vitality Booster", ""),
    POWER_TREADS(63, "Power Treads", "DT_DOTA_Item_PowerTreads"),
    HAND_OF_MIDAS(65, "Hand of Midas", ""),
    OBLIVION_STAFF(67, "Oblivion Staff", ""),
    PERS(69, "Perseverance", ""),
    POOR_MANS_SHIELD(71, "Poor Man's Shield", ""),
    BRACER(73, "Bracer", ""),
    WRAITH_BAND(75, "Wraith Band", ""),
    NULL_TALISMAN(77, "Null Talisman", ""),
    MEKANSM(79, "Mekansm", ""),
    VLADMIR(81, "Vladmir's Offering", ""),
    FLYING_COURIER(84, "Coursier volant", ""),
    BUCKLER(86, "Buckler", ""),
    RING_OF_BASILIUS(88, "Ring of Basilius", "DT_DOTA_Item_Ring_Of_Basilius"),
    PIPE(90, "Pipe of Insight", ""),
    URN_OF_SHADOWS(92, "Urn of Shadows", "DT_DOTA_Item_Urn_Of_Shadows"),
    HEADDRESS(94, "Headdress", ""),
    SHEEPSTICK(96, "Scythe of Vyse", ""),
    ORCHID(98, "Orchid Malevolence", ""),
    CYCLONE(100, "Eul's Scepter of Divinity", "DT_DOTA_Item_Cyclone"),
    FORCE_STAFF(102, "Force Staff", ""),
    DAGON(104, "Dagon", ""),
    NECRONOMICON(106, "Necronomicon", "DT_DOTA_Item_Necronomicon"),
    ULTIMATE_SCEPTER(108, "Aghanim's Scepter", ""),
    REFRESHER(110, "Refresher Orb", ""),
    ASSAULT(112, "Assault Cuirass", ""),
    HEART(114, "Heart of Tarrasque", ""),
    BLACK_KING_BAR(116, "Black King Bar", ""),
    AEGIS(117, "Aegis of the Immortal", ""),
    SHIVAS_GUARD(119, "Shiva's Guard", ""),
    BLOODSTONE(121, "Bloodstone", "DT_DOTA_Item_Bloodstone"),
    SPHERE(123, "Linken's Sphere", ""),
    VANGUARD(125, "Vanguard", ""),
    BLADE_MAIL(127, "Blade Mail", ""),
    SOUL_BOOSTER(129, "Soul Booster", ""),
    HOOD_OF_DEFIANCE(131, "Hood of Defiance", ""),
    RAPIER(133, "Divine Rapier", ""),
    MONKEY_KING_BAR(135, "Monkey King Bar", ""),
    RADIANCE(137, "Radiance", "DT_DOTA_Item_Radiance"),
    BUTTERFLY(139, "Butterfly", ""),
    GREATER_CRIT(141, "Daedalus", ""),
    BASHER(143, "Skull Basher", ""),
    BFURY(145, "Battle Fury", ""),
    MANTA(147, "Manta Style", "DT_DOTA_Item_MantaStyle"),
    LESSER_CRIT(149, "Crystalys", ""),
    ARMLET(151, "Armlet of Mordiggian", "DT_DOTA_Item_Armlet"),
    INVIS_SWORD(152, "Shadow Blade", ""),
    SANGE_AND_YASHA(154, "Sange and Yasha", ""),
    SATANIC(156, "Satanic", ""),
    MJOLLNIR(158, "Mjollnir", ""),
    SKADI(160, "Eye of Skadi", ""),
    SANGE(162, "Sange", ""),
    HELM_OF_THE_DOMINATOR(164, "Helm of the Dominator", ""),
    MAELSTROM(166, "Maelstrom", ""),
    DESOLATOR(168, "Desolator", ""),
    YASHA(170, "Yasha", ""),
    MASK_OF_MADNESS(172, "Mask of Madness", ""),
    DIFFUSAL_BLADE(174, "Diffusal Blade", "DT_DOTA_Item_Diffusal_Blade"),
    ETHEREAL_BLADE(176, "Ethereal Blade", "DT_DOTA_Item_Ethereal_Blade"),
    SOUL_RING(178, "Soul Ring", ""),
    ARCANE_BOOTS(180, "Arcane Boots", ""),
    ORB_OF_VENOM(181, "Orb of Venom", ""),
    STOUT_SHIELD(182, "Stout Shield", ""),
    ANCIENT_JANGGO(185, "Drum of Endurance", "DT_DOTA_Item_Ancient_Janggo"),
    MEDALLION_OF_COURAGE(187, "Medallion of Courage", ""),
    SMOKE_OF_DECEIT(188, "Smoke of Deceit", ""),
    VEIL_OF_DISCORD(190, "Veil of Discord", "DT_DOTA_Item_Veil_Of_Discord"),
    NECRONOMICON_2(193, "Necronomicon", "DT_DOTA_Item_Necronomicon_Level2"),
    NECRONOMICON_3(194, "Necronomicon", "DT_DOTA_Item_Necronomicon_Level3"),
    DIFFUSAL_BLADE_2(196, "Diffusal Blade", "DT_DOTA_Item_Diffusal_Blade_Level2"),
    DAGON_2(201, "Dagon", ""),
    DAGON_3(202, "Dagon", ""),
    DAGON_4(203, "Dagon", ""),
    DAGON_5(204, "Dagon", ""),
    ROD_OF_ATOS(206, "Rod of Atos", ""),
    ABYSSAL_BLADE(208, "Abyssal Blade", ""),
    HEAVENS_HALBERD(210, "Heaven's Halberd", ""),
    RING_OF_AQUILA(212, "Ring of Aquila", "DT_DOTA_Item_RingOfAquila"),
    TRANQUIL_BOOTS(214, "Tranquil Boots", "DT_DOTA_Item_TranquilBoots"),
    SHADOW_AMULET(215, "Shadow Amulet", ""),
    HALLOWEEN_CANDY_CORN(216, "Caramel de Greevil", ""),
    MYSTERY_HOOK(217, "Mysterious Spell Scroll #1", ""),
    MYSTERY_ARROW(218, "Mysterious Spell Scroll #2", ""),
    MYSTERY_MISSILE(219, "Mysterious Spell Scroll #3", ""),
    MYSTERY_TOSS(220, "Mysterious Spell Scroll #4", ""),
    MYSTERY_VACUUM(221, "Mysterious Spell Scroll #5", ""),
    HALLOWEEN_RAPIER(226, "Cursed Rapier", ""),
    PRESENT(227, "Present", ""),
    GREEVIL_WHISTLE(228, "Greevil Whistle", "DT_DOTA_Item_Greevil_Whistle"),
    WINTER_STOCKING(229, "Winter Stocking", ""),
    WINTER_SKATES(230, "Winter Skates", ""),
    WINTER_CAKE(231, "Winter Cake", ""),
    WINTER_COOKIE(232, "Winter Cookie", ""),
    WINTER_COCO(233, "Winter Coco", ""),
    WINTER_HAM(234, "Winter Hame", ""),
    GREEVIL_WHISTLE_TOGGLE(235, "Greevil Whistle (Toggled)", "DT_DOTA_Item_Greevil_WhistleToggle"),
    WINTER_KRINGLE(236, "Winter Kringle", ""),
    WINTER_MUSHROOM(237, "Winter Mushroom", ""),
    WINTER_GREEVIL_TREAT(238, "Winter Greevil Treat", ""),
    WINTER_GREEVIL_GARBAGE(239, "Winter Greevil Garbage", ""),
    WINTER_GREEVIL_CHEWY(240, "Winter Greevil Chewy", ""),
    TANGO_SINGLE(241, "Tango (Single)", "");

    private final Integer id;
    private final String publicName;
    private final String internalName;

    private Item(Integer id, String publicName, String internalName) {
        this.id = id;
        this.publicName = publicName;
        this.internalName = internalName;
    }

    public Integer getId() {
        return id;
    }

    public String getPublicName() {
        return publicName;
    }

    public String getInternalName() {
        return internalName;
    }

    private static final ImmutableMap<Integer, Item> reverseMap;

    static {
        ImmutableMap.Builder<Integer, Item> builder = ImmutableMap.builder();
        for (Item value : EnumSet.allOf(Item.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<Item> fromId(Integer id) {
        Item value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<Item> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        Item value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}
