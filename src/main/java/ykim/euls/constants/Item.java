package ykim.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum Item {
    BLINK(1, "Blink Dagger", "item_blink"),
    BLADES_OF_ATTACK(2, "Blades of Attack", "item_blades_of_attack"),
    BROADSWORD(3, "Broadsword", "item_broadsword"),
    CHAINMAIL(4, "Chainmail", "item_chainmail"),
    CLAYMORE(5, "Claymore", "item_claymore"),
    HELM_OF_IRON_WILL(6, "Helm of Iron Will", "item_helm_of_iron_will"),
    JAVELIN(7, "Javelin", "item_javelin"),
    MITHRIL_HAMMER(8, "Mithril Hammer", "item_mithril_hammer"),
    PLATEMAIL(9, "Platemail", "item_platemail"),
    QUARTERSTAFF(10, "Quarterstaff", "item_quarterstaff"),
    QUELLING_BLADE(11, "Quelling Blade", "item_quelling_blade"),
    RING_OF_PROTECTION(12, "Ring of Protection", "item_ring_of_protection"),
    GAUNTLETS(13, "Gauntlets of Strength", "item_gauntlets"),
    SLIPPERS(14, "Slippers of Agility", "item_slippers"),
    MANTLE(15, "Mantle of Intelligence", "item_mantle"),
    BRANCHES(16, "Iron Branch", "item_branches"),
    BELT_OF_STRENGTH(17, "Belt of Strength", "item_belt_of_strength"),
    BOOTS_OF_ELVES(18, "Band of Elvenskin", "item_boots_of_elves"),
    ROBE(19, "Robe of the Magi", "item_robe"),
    CIRCLET(20, "Circlet", "item_circlet"),
    OGRE_AXE(21, "Ogre Club", "item_ogre_axe"),
    BLADE_OF_ALACRITY(22, "Blade of Alacrity", "item_blade_of_alacrity"),
    STAFF_OF_WIZARDRY(23, "Staff of Wizardry", "item_staff_of_wizardry"),
    ULTIMATE_ORB(24, "Ultimate Orb", "item_ultimate_orb"),
    GLOVES(25, "Gloves of Haste", "item_gloves"),
    LIFESTEAL(26, "Morbid Mask", "item_lifesteal"),
    RING_OF_REGEN(27, "Ring of Regen", "item_ring_of_regen"),
    SOBI_MASK(28, "Sage's Mask", "item_sobi_mask"),
    BOOTS(29, "Boots of Speed", "item_boots"),
    GEM(30, "Gem of True Sight", "item_gem"),
    CLOAK(31, "Cloak", "item_cloak"),
    TALISMAN_OF_EVASION(32, "Talisman of Evasion", "item_talisman_of_evasion"),
    CHEESE(33, "Cheese", "item_cheese"),
    MAGIC_STICK(34, "Magic Stick", "item_magic_stick"),
    ITEM_RECIPE_MAGIC_WAND(35, "Magic Wand Recipe", "item_recipe_magic_wand"),
    MAGIC_WAND(36, "Magic Wand", "item_magic_wand"),
    GHOST(37, "Ghost Scepter", "item_ghost"),
    CLARITY(38, "Clarity", "item_clarity"),
    FLASK(39, "Healing Salve", "item_flask"),
    DUST(40, "Dust of Appearance", "item_dust"),
    BOTTLE(41, "Bottle", "item_bottle"),
    WARD_OBSERVER(42, "Observer Ward", "item_ward_observer"),
    WARD_SENTRY(43, "Sentry Ward", "item_ward_sentry"),
    TANGO(44, "Tango", "item_tango"),
    COURIER(45, "Courier", "item_courier"),
    TPSCROLL(46, "Town Portal Scroll", "item_tpscroll"),
    ITEM_RECIPE_TRAVEL_BOOTS(47, "Boots of Travel Recipe", "item_recipe_travel_boots"),
    TRAVEL_BOOTS(48, "Boots of Travel", "item_travel_boots"),
    ITEM_RECIPE_PHASE_BOOTS(49, "Phase Boots Recipe", "item_recipe_phase_boots"),
    PHASE_BOOTS(50, "Phase Boots", "item_phase_boots"),
    DEMON_EDGE(51, "Demon Edge", "item_demon_edge"),
    EAGLE(52, "Eaglesong", "item_eagle"),
    REAVER(53, "Reaver", "item_reaver"),
    RELIC(54, "Sacred Relic", "item_relic"),
    HYPERSTONE(55, "Hyperstone", "item_hyperstone"),
    RING_OF_HEALTH(56, "Ring of Health", "item_ring_of_health"),
    VOID_STONE(57, "Void Stone", "item_void_stone"),
    MYSTIC_STAFF(58, "Mystic Staff", "item_mystic_staff"),
    ENERGY_BOOSTER(59, "Energy Booster", "item_energy_booster"),
    POINT_BOOSTER(60, "Point Booster", "item_point_booster"),
    VITALITY_BOOSTER(61, "Vitality Booster", "item_vitality_booster"),
    ITEM_RECIPE_POWER_TREADS(62, "Power Treads Recipe", "item_recipe_power_treads"),
    POWER_TREADS(63, "Power Treads", "item_power_treads"),
    ITEM_RECIPE_HAND_OF_MIDAS(64, "Hand of Midas Recipe", "item_recipe_hand_of_midas"),
    HAND_OF_MIDAS(65, "Hand of Midas", "item_hand_of_midas"),
    ITEM_RECIPE_OBLIVION_STAFF(66, "Oblivion Staff Recipe", "item_recipe_oblivion_staff"),
    OBLIVION_STAFF(67, "Oblivion Staff", "item_oblivion_staff"),
    ITEM_RECIPE_PERS(68, "Perseverance Recipe", "item_recipe_pers"),
    PERS(69, "Perseverance", "item_pers"),
    ITEM_RECIPE_POOR_MANS_SHIELD(70, "Poor Man's Shield Recipe", "item_recipe_poor_mans_shield"),
    POOR_MANS_SHIELD(71, "Poor Man's Shield", "item_poor_mans_shield"),
    ITEM_RECIPE_BRACER(72, "Bracer Recipe", "item_recipe_bracer"),
    BRACER(73, "Bracer", "item_bracer"),
    ITEM_RECIPE_WRAITH_BAND(74, "Wraith Band Recipe", "item_recipe_wraith_band"),
    WRAITH_BAND(75, "Wraith Band", "item_wraith_band"),
    ITEM_RECIPE_NULL_TALISMAN(76, "Null Talisman Recipe", "item_recipe_null_talisman"),
    NULL_TALISMAN(77, "Null Talisman", "item_null_talisman"),
    ITEM_RECIPE_MEKANSM(78, "Mekansm Recipe", "item_recipe_mekansm"),
    MEKANSM(79, "Mekansm", "item_mekansm"),
    ITEM_RECIPE_VLADMIR(80, "Vladimir's Offering Recipe", "item_recipe_vladmir"),
    VLADMIR(81, "Vladmir's Offering", "item_vladmir"),
    FLYING_COURIER(84, "Flying Courier", "item_flying_courier"),
    ITEM_RECIPE_BUCKLER(85, "Buckler Recipe", "item_recipe_buckler"),
    BUCKLER(86, "Buckler", "item_buckler"),
    ITEM_RECIPE_RING_OF_BASILIUS(87, "Ring of Basilius Recipe", "item_recipe_ring_of_basilius"),
    RING_OF_BASILIUS(88, "Ring of Basilius", "item_ring_of_basilius"),
    ITEM_RECIPE_PIPE(89, "Pipe of Insight Recipe", "item_recipe_pipe"),
    PIPE(90, "Pipe of Insight", "item_pipe"),
    ITEM_RECIPE_URN_OF_SHADOWS(91, "Urn of Shadows Recipe", "item_recipe_urn_of_shadows"),
    URN_OF_SHADOWS(92, "Urn of Shadows", "item_urn_of_shadows"),
    ITEM_RECIPE_HEADDRESS(93, "Headdress Recipe", "item_recipe_headdress"),
    HEADDRESS(94, "Headdress", "item_headdress"),
    ITEM_RECIPE_SHEEPSTICK(95, "Scythe of Vyse Recipe", "item_recipe_sheepstick"),
    SHEEPSTICK(96, "Scythe of Vyse", "item_sheepstick"),
    ITEM_RECIPE_ORCHID(97, "Orchid Malevolence Recipe", "item_recipe_orchid"),
    ORCHID(98, "Orchid Malevolence", "item_orchid"),
    ITEM_RECIPE_CYCLONE(99, "Eul's Scepter of Divinity Recipe", "item_recipe_cyclone"),
    CYCLONE(100, "Eul's Scepter of Divinity", "item_cyclone"),
    ITEM_RECIPE_FORCE_STAFF(101, "Force Staff Recipe", "item_recipe_force_staff"),
    FORCE_STAFF(102, "Force Staff", "item_force_staff"),
    ITEM_RECIPE_DAGON(103, "Dagon Recipe", "item_recipe_dagon"),
    DAGON(104, "Dagon", "item_dagon"),
    ITEM_RECIPE_NECRONOMICON(105, "Necronomicon Recipe", "item_recipe_necronomicon"),
    NECRONOMICON(106, "Necronomicon", "item_necronomicon"),
    ITEM_RECIPE_ULTIMATE_SCEPTER(107, "Aghanim's Scepter Recipe", "item_recipe_ultimate_scepter"),
    ULTIMATE_SCEPTER(108, "Aghanim's Scepter", "item_ultimate_scepter"),
    ITEM_RECIPE_REFRESHER(109, "Refresher Orb Recipe", "item_recipe_refresher"),
    REFRESHER(110, "Refresher Orb", "item_refresher"),
    ITEM_RECIPE_ASSAULT(111, "Assault Cuirass Recipe", "item_recipe_assault"),
    ASSAULT(112, "Assault Cuirass", "item_assault"),
    ITEM_RECIPE_HEART(113, "Heart of Tarrasque Recipe", "item_recipe_heart"),
    HEART(114, "Heart of Tarrasque", "item_heart"),
    ITEM_RECIPE_BLACK_KING_BAR(115, "Black King Bar Recipe", "item_recipe_black_king_bar"),
    BLACK_KING_BAR(116, "Black King Bar", "item_black_king_bar"),
    AEGIS(117, "Aegis of the Immortal", "item_aegis"),
    ITEM_RECIPE_SHIVAS_GUARD(118, "Shiva's Guard Recipe", "item_recipe_shivas_guard"),
    SHIVAS_GUARD(119, "Shiva's Guard", "item_shivas_guard"),
    ITEM_RECIPE_BLOODSTONE(120, "Bloodstone Recipe", "item_recipe_bloodstone"),
    BLOODSTONE(121, "Bloodstone", "item_bloodstone"),
    ITEM_RECIPE_SPHERE(122, "Linken's Sphere Recipe", "item_recipe_sphere"),
    SPHERE(123, "Linken's Sphere", "item_sphere"),
    ITEM_RECIPE_VANGUARD(124, "Vanguard Recipe", "item_recipe_vanguard"),
    VANGUARD(125, "Vanguard", "item_vanguard"),
    ITEM_RECIPE_BLADE_MAIL(126, "Blade Mail Recipe", "item_recipe_blade_mail"),
    BLADE_MAIL(127, "Blade Mail", "item_blade_mail"),
    ITEM_RECIPE_SOUL_BOOSTER(128, "Soul Booster Recipe", "item_recipe_soul_booster"),
    SOUL_BOOSTER(129, "Soul Booster", "item_soul_booster"),
    ITEM_RECIPE_HOOD_OF_DEFIANCE(130, "Hood of Defiance Recipe", "item_recipe_hood_of_defiance"),
    HOOD_OF_DEFIANCE(131, "Hood of Defiance", "item_hood_of_defiance"),
    ITEM_RECIPE_RAPIER(132, "Divine Rapier Recipe", "item_recipe_rapier"),
    RAPIER(133, "Divine Rapier", "item_rapier"),
    ITEM_RECIPE_MONKEY_KING_BAR(134, "Monkey King Bar Recipe", "item_recipe_monkey_king_bar"),
    MONKEY_KING_BAR(135, "Monkey King Bar", "item_monkey_king_bar"),
    ITEM_RECIPE_RADIANCE(136, "Radiance Recipe", "item_recipe_radiance"),
    RADIANCE(137, "Radiance", "item_radiance"),
    ITEM_RECIPE_BUTTERFLY(138, "Butterfly Recipe", "item_recipe_butterfly"),
    BUTTERFLY(139, "Butterfly", "item_butterfly"),
    ITEM_RECIPE_GREATER_CRIT(140, "Daedalus Recipe", "item_recipe_greater_crit"),
    GREATER_CRIT(141, "Daedalus", "item_greater_crit"),
    ITEM_RECIPE_BASHER(142, "Skull Basher Recipe", "item_recipe_basher"),
    BASHER(143, "Skull Basher", "item_basher"),
    ITEM_RECIPE_BFURY(144, "Battle Fury Recipe", "item_recipe_bfury"),
    BFURY(145, "Battle Fury", "item_bfury"),
    ITEM_RECIPE_MANTA(146, "Manta Style Recipe", "item_recipe_manta"),
    MANTA(147, "Manta Style", "item_manta"),
    ITEM_RECIPE_LESSER_CRIT(148, "Crystalys Recipe", "item_recipe_lesser_crit"),
    LESSER_CRIT(149, "Crystalys", "item_lesser_crit"),
    ITEM_RECIPE_ARMLET(150, "Armlet of Mordiggian Recipe", "item_recipe_armlet"),
    ARMLET(151, "Armlet of Mordiggian", "item_armlet"),
    INVIS_SWORD(152, "Shadow Blade", "item_invis_sword"),
    ITEM_RECIPE_SANGE_AND_YASHA(153, "Sange and Yasha Recipe", "item_recipe_sange_and_yasha"),
    SANGE_AND_YASHA(154, "Sange and Yasha", "item_sange_and_yasha"),
    ITEM_RECIPE_SATANIC(155, "Satanic Recipe", "item_recipe_satanic"),
    SATANIC(156, "Satanic", "item_satanic"),
    ITEM_RECIPE_MJOLLNIR(157, "Mjollnir Recipe", "item_recipe_mjollnir"),
    MJOLLNIR(158, "Mjollnir", "item_mjollnir"),
    ITEM_RECIPE_SKADI(159, "Eye of Skadi Recipe", "item_recipe_skadi"),
    SKADI(160, "Eye of Skadi", "item_skadi"),
    ITEM_RECIPE_SANGE(161, "Sange Recipe", "item_recipe_sange"),
    SANGE(162, "Sange", "item_sange"),
    ITEM_RECIPE_HELM_OF_THE_DOMINATOR(163, "Helm of the Dominator Recipe", "item_recipe_helm_of_the_dominator"),
    HELM_OF_THE_DOMINATOR(164, "Helm of the Dominator", "item_helm_of_the_dominator"),
    ITEM_RECIPE_MAELSTROM(165, "Maelstrom Recipe", "item_recipe_maelstrom"),
    MAELSTROM(166, "Maelstrom", "item_maelstrom"),
    ITEM_RECIPE_DESOLATOR(167, "Desolator Recipe", "item_recipe_desolator"),
    DESOLATOR(168, "Desolator", "item_desolator"),
    ITEM_RECIPE_YASHA(169, "Yasha Recipe", "item_recipe_yasha"),
    YASHA(170, "Yasha", "item_yasha"),
    ITEM_RECIPE_MASK_OF_MADNESS(171, "Mask of Madness Recipe", "item_recipe_mask_of_madness"),
    MASK_OF_MADNESS(172, "Mask of Madness", "item_mask_of_madness"),
    ITEM_RECIPE_DIFFUSAL_BLADE(173, "Diffusal Blade Recipe", "item_recipe_diffusal_blade"),
    DIFFUSAL_BLADE(174, "Diffusal Blade", "item_diffusal_blade"),
    ITEM_RECIPE_ETHEREAL_BLADE(175, "Ethereal Blade Recipe", "item_recipe_ethereal_blade"),
    ETHEREAL_BLADE(176, "Ethereal Blade", "item_ethereal_blade"),
    ITEM_RECIPE_SOUL_RING(177, "Soul Ring Recipe", "item_recipe_soul_ring"),
    SOUL_RING(178, "Soul Ring", "item_soul_ring"),
    ITEM_RECIPE_ARCANE_BOOTS(179, "Arcane Boots Recipe", "item_recipe_arcane_boots"),
    ARCANE_BOOTS(180, "Arcane Boots", "item_arcane_boots"),
    ORB_OF_VENOM(181, "Orb of Venom", "item_orb_of_venom"),
    STOUT_SHIELD(182, "Stout Shield", "item_stout_shield"),
    ITEM_RECIPE_INVIS_SWORD(183, "Shadow Blade Recipe", "item_recipe_invis_sword"),
    ITEM_RECIPE_ANCIENT_JANGGO(184, "Drum of Endurance Recipe", "item_recipe_ancient_janggo"),
    ANCIENT_JANGGO(185, "Drum of Endurance", "item_ancient_janggo"),
    ITEM_RECIPE_MEDALLION_OF_COURAGE(186, "Medallion of Courage Recipe", "item_recipe_medallion_of_courage"),
    MEDALLION_OF_COURAGE(187, "Medallion of Courage", "item_medallion_of_courage"),
    SMOKE_OF_DECEIT(188, "Smoke of Deceit", "item_smoke_of_deceit"),
    ITEM_RECIPE_VEIL_OF_DISCORD(189, "Veil of Discord Recipe", "item_recipe_veil_of_discord"),
    VEIL_OF_DISCORD(190, "Veil of Discord", "item_veil_of_discord"),
    ITEM_RECIPE_NECRONOMICON_2(191, "Necronomicon 2 Recipe", "item_recipe_necronomicon_2"),
    ITEM_RECIPE_NECRONOMICON_3(192, "Necronomicon 3 Recipe", "item_recipe_necronomicon_3"),
    NECRONOMICON_2(193, "Necronomicon 2", "item_necronomicon_2"),
    NECRONOMICON_3(194, "Necronomicon 3", "item_necronomicon_3"),
    ITEM_RECIPE_DIFFUSAL_BLADE_2(195, "Diffusl Blade 2 Recipe", "item_recipe_diffusal_blade_2"),
    DIFFUSAL_BLADE_2(196, "Diffusal Blade 2", "item_diffusal_blade_2"),
    ITEM_RECIPE_DAGON_2(197, "Dagon 2 Recipe", "item_recipe_dagon_2"),
    ITEM_RECIPE_DAGON_3(198, "Dagon 3 Recipe", "item_recipe_dagon_3"),
    ITEM_RECIPE_DAGON_4(199, "Dagon 4 Recipe", "item_recipe_dagon_4"),
    ITEM_RECIPE_DAGON_5(200, "Dagon 5 Recipe", "item_recipe_dagon_5"),
    DAGON_2(201, "Dagon 2", "item_dagon_2"),
    DAGON_3(202, "Dagon 3", "item_dagon_3"),
    DAGON_4(203, "Dagon 4", "item_dagon_4"),
    DAGON_5(204, "Dagon 5", "item_dagon_5"),
    ITEM_RECIPE_ROD_OF_ATOS(205, "Rod of Atos Recipe", "item_recipe_rod_of_atos"),
    ROD_OF_ATOS(206, "Rod of Atos", "item_rod_of_atos"),
    ITEM_RECIPE_ABYSSAL_BLADE(207, "Abyssal Blade Recipe", "item_recipe_abyssal_blade"),
    ABYSSAL_BLADE(208, "Abyssal Blade", "item_abyssal_blade"),
    ITEM_RECIPE_HEAVENS_HALBERD(209, "Heaven's Halberd Recipe", "item_recipe_heavens_halberd"),
    HEAVENS_HALBERD(210, "Heaven's Halberd", "item_heavens_halberd"),
    ITEM_RECIPE_RING_OF_AQUILA(211, "Ring of Aquila Recipe", "item_recipe_ring_of_aquila"),
    RING_OF_AQUILA(212, "Ring of Aquila", "item_ring_of_aquila"),
    ITEM_RECIPE_TRANQUIL_BOOTS(213, "Tranquil Boots Recipe", "item_recipe_tranquil_boots"),
    TRANQUIL_BOOTS(214, "Tranquil Boots", "item_tranquil_boots"),
    SHADOW_AMULET(215, "Shadow Amulet", "item_shadow_amulet"),
    HALLOWEEN_CANDY_CORN(216, "Caramel de Greevil", "item_halloween_candy_corn"),
    MYSTERY_HOOK(217, "Mysterious Spell Scroll #1", "item_mystery_hook"),
    MYSTERY_ARROW(218, "Mysterious Spell Scroll #2", "item_mystery_arrow"),
    MYSTERY_MISSILE(219, "Mysterious Spell Scroll #3", "item_mystery_missile"),
    MYSTERY_TOSS(220, "Mysterious Spell Scroll #4", "item_mystery_toss"),
    MYSTERY_VACUUM(221, "Mysterious Spell Scroll #5", "item_mystery_vacuum"),
    HALLOWEEN_RAPIER(226, "Cursed Rapier", "item_halloween_rapier"),
    PRESENT(227, "DOTA_Tooltip_Ability_item_present", "item_present"),
    GREEVIL_WHISTLE(228, "DOTA_Tooltip_Ability_item_greevil_whistle", "item_greevil_whistle"),
    WINTER_STOCKING(229, "DOTA_Tooltip_Ability_item_winter_stocking", "item_winter_stocking"),
    WINTER_SKATES(230, "DOTA_Tooltip_Ability_item_winter_skates", "item_winter_skates"),
    WINTER_CAKE(231, "DOTA_Tooltip_Ability_item_winter_cake", "item_winter_cake"),
    WINTER_COOKIE(232, "DOTA_Tooltip_Ability_item_winter_cookie", "item_winter_cookie"),
    WINTER_COCO(233, "DOTA_Tooltip_Ability_item_winter_coco", "item_winter_coco"),
    WINTER_HAM(234, "DOTA_Tooltip_Ability_item_winter_ham", "item_winter_ham"),
    GREEVIL_WHISTLE_TOGGLE(235, "DOTA_Tooltip_Ability_item_greevil_whistle_toggle", "item_greevil_whistle_toggle"),
    WINTER_KRINGLE(236, "DOTA_Tooltip_Ability_item_winter_kringle", "item_winter_kringle"),
    WINTER_MUSHROOM(237, "DOTA_Tooltip_Ability_item_winter_mushroom", "item_winter_mushroom"),
    WINTER_GREEVIL_TREAT(238, "DOTA_Tooltip_Ability_item_winter_greevil_treat", "item_winter_greevil_treat"),
    WINTER_GREEVIL_GARBAGE(239, "DOTA_Tooltip_Ability_item_winter_greevil_garbage", "item_winter_greevil_garbage"),
    WINTER_GREEVIL_CHEWY(240, "DOTA_Tooltip_Ability_item_winter_greevil_chewy", "item_winter_greevil_chewy"),
    TANGO_SINGLE(241, "Tango (Single)", "item_tango_single");

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

    private static final ImmutableMap<String, Item> reverseInternalMap;

    static {
        ImmutableMap.Builder<String, Item> builder = ImmutableMap.builder();
        for (Item value : EnumSet.allOf(Item.class)) {
            builder.put(value.internalName, value);
        }
        reverseInternalMap = builder.build();
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

    public static Optional<Item> fromInternalName(String internalName) {
        Item value = reverseInternalMap.get(internalName);
        return Optional.fromNullable(value);
    }
}
