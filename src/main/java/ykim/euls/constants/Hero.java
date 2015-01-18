package ykim.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum Hero {
    ANTIMAGE(1, "Anti-Mage", "DT_DOTA_Unit_Hero_AntiMage"),
    AXE(2, "Axe", "DT_DOTA_Unit_Hero_Axe"),
    BANE(3, "Bane", "DT_DOTA_Unit_Hero_Bane"),
    BLOODSEEKER(4, "Bloodseeker", "DT_DOTA_Unit_Hero_Bloodseeker"),
    CRYSTALMAIDEN(5, "Crystal Maiden", "DT_DOTA_Unit_Hero_CrystalMaiden"),
    DROWRANGER(6, "Drow Ranger", "DT_DOTA_Unit_Hero_DrowRanger"),
    EARTHSHAKER(7, "Earthshaker", "DT_DOTA_Unit_Hero_Earthshaker"),
    JUGGERNAUT(8, "Juggernaut", "DT_DOTA_Unit_Hero_Juggernaut"),
    MIRANA(9, "Mirana", "DT_DOTA_Unit_Hero_Mirana"),
    MORPHLING(10, "Morphling", "DT_DOTA_Unit_Hero_Morphling"),
    SHADOWFIEND(11, "Shadow Fiend", "DT_DOTA_Unit_Hero_Nevermore"),
    PHANTOMLANCER(12, "Phantom Lancer", "DT_DOTA_Unit_Hero_PhantomLancer"),
    PUCK(13, "Puck", "DT_DOTA_Unit_Hero_Puck"),
    PUDGE(14, "Pudge", "DT_DOTA_Unit_Hero_Pudge"),
    RAZOR(15, "Razor", "DT_DOTA_Unit_Hero_Razor"),
    SANDKING(16, "Sand King", "DT_DOTA_Unit_Hero_SandKing"),
    STORMSPIRIT(17, "Storm Spirit", "DT_DOTA_Unit_Hero_StormSpirit"),
    SVEN(18, "Sven", "DT_DOTA_Unit_Hero_Sven"),
    TINY(19, "Tiny", "DT_DOTA_Unit_Hero_Tiny"),
    VENGEFULSPIRIT(20, "Vengeful Spirit", "DT_DOTA_Unit_Hero_VengefulSpirit"),
    WINDRANGER(21, "Windranger", "DT_DOTA_Unit_Hero_Windrunner"),
    ZEUS(22, "Zeus", "DT_DOTA_Unit_Hero_Zuus"),
    KUNKKA(23, "Kunkka", "DT_DOTA_Unit_Hero_Kunkka"),
    LINA(25, "Lina", "DT_DOTA_Unit_Hero_Lina"),
    LION(26, "Lion", "DT_DOTA_Unit_Hero_Lion"),
    SHADOWSHAMAN(27, "Shadow Shaman", "DT_DOTA_Unit_Hero_ShadowShaman"),
    SLARDAR(28, "Slardar", "DT_DOTA_Unit_Hero_Slardar"),
    TIDEHUNTER(29, "Tidehunter", "DT_DOTA_Unit_Hero_Tidehunter"),
    WITCHDOCTOR(30, "Witch Doctor", "DT_DOTA_Unit_Hero_WitchDoctor"),
    LICH(31, "Lich", "DT_DOTA_Unit_Hero_Lich"),
    RIKI(32, "Riki", "DT_DOTA_Unit_Hero_Riki"),
    ENIGMA(33, "Enigma", "DT_DOTA_Unit_Hero_Enigma"),
    TINKER(34, "Tinker", "DT_DOTA_Unit_Hero_Tinker"),
    SNIPER(35, "Sniper", "DT_DOTA_Unit_Hero_Sniper"),
    NECROPHOS(36, "Necrophos", "DT_DOTA_Unit_Hero_Necrolyte"),
    WARLOCK(37, "Warlock", "DT_DOTA_Unit_Hero_Warlock"),
    BEASTMASTER(38, "Beastmaster", "DT_DOTA_Unit_Hero_Beastmaster"),
    QUEENOFPAIN(39, "Queen of Pain", "DT_DOTA_Unit_Hero_QueenOfPain"),
    VENOMANCER(40, "Venomancer", "DT_DOTA_Unit_Hero_Venomancer"),
    FACELESSVOID(41, "Faceless Void", "DT_DOTA_Unit_Hero_FacelessVoid"),
    WRAITHKING(42, "Wraith King", "DT_DOTA_Unit_Hero_SkeletonKing"),
    DEATHPROPHET(43, "Death Prophet", "DT_DOTA_Unit_Hero_DeathProphet"),
    PHANTOMASSASSIN(44, "Phantom Assassin", "DT_DOTA_Unit_Hero_PhantomAssassin"),
    PUGNA(45, "Pugna", "DT_DOTA_Unit_Hero_Pugna"),
    TEMPLARASSASSIN(46, "Templar Assassin", "DT_DOTA_Unit_Hero_TemplarAssassin"),
    VIPER(47, "Viper", "DT_DOTA_Unit_Hero_Viper"),
    LUNA(48, "Luna", "DT_DOTA_Unit_Hero_Luna"),
    DRAGONKNIGHT(49, "Dragon Knight", "DT_DOTA_Unit_Hero_DragonKnight"),
    DAZZLE(50, "Dazzle", "DT_DOTA_Unit_Hero_Dazzle"),
    CLOCKWERK(51, "Clockwerk", "DT_DOTA_Unit_Hero_Rattletrap"),
    LESHRAC(52, "Leshrac", "DT_DOTA_Unit_Hero_Leshrac"),
    NATURESPROPHET(53, "Nature's Prophet", "DT_DOTA_Unit_Hero_Furion"),
    LIFESTEALER(54, "Life Stealer", "DT_DOTA_Unit_Hero_Life_Stealer"),
    DARKSEER(55, "Dark Seer", "DT_DOTA_Unit_Hero_DarkSeer"),
    CLINKZ(56, "Clinkz", "DT_DOTA_Unit_Hero_Clinkz"),
    OMNIKNIGHT(57, "Omniknight", "DT_DOTA_Unit_Hero_Omniknight"),
    ENCHANTRESS(58, "Enchantress", "DT_DOTA_Unit_Hero_Enchantress"),
    HUSKAR(59, "Huskar", "DT_DOTA_Unit_Hero_Huskar"),
    NIGHTSTALKER(60, "Night Stalker", "DT_DOTA_Unit_Hero_NightStalker"),
    BROODMOTHER(61, "Broodmother", "DT_DOTA_Unit_Hero_Broodmother"),
    BOUNTYHUNTER(62, "Bounty Hunter", "DT_DOTA_Unit_Hero_BountyHunter"),
    WEAVER(63, "Weaver", "DT_DOTA_Unit_Hero_Weaver"),
    JAKIRO(64, "Jakiro", "DT_DOTA_Unit_Hero_Jakiro"),
    BATRIDER(65, "Batrider", "DT_DOTA_Unit_Hero_Batrider"),
    CHEN(66, "Chen", "DT_DOTA_Unit_Hero_Chen"),
    SPECTRE(67, "Spectre", "DT_DOTA_Unit_Hero_Spectre"),
    ANCIENTAPPARITION(68, "Ancient Apparition", "DT_DOTA_Unit_Hero_AncientApparition"),
    DOOMBRINGER(69, "Doom Bringer", "DT_DOTA_Unit_Hero_DoomBringer"),
    URSA(70, "Ursa", "DT_DOTA_Unit_Hero_Ursa"),
    SPIRITBREAKER(71, "Spirit Breaker", "DT_DOTA_Unit_Hero_SpiritBreaker"),
    GYROCOPTER(72, "Gyrocopter", "DT_DOTA_Unit_Hero_Gyrocopter"),
    ALCHEMIST(73, "Alchemist", "DT_DOTA_Unit_Hero_Alchemist"),
    INVOKER(74, "Invoker", "DT_DOTA_Unit_Hero_Invoker"),
    SILENCER(75, "Silencer", "DT_DOTA_Unit_Hero_Silencer"),
    OUTWORLDDEVOURER(76, "Outworld Devourer", "DT_DOTA_Unit_Hero_Obsidian_Destroyer"),
    LYCAN(77, "Lycan", "DT_DOTA_Unit_Hero_Lycan"),
    BREWMASTER(78, "Brewmaster", "DT_DOTA_Unit_Hero_Brewmaster"),
    SHADOWDEMON(79, "Shadow Demon", "DT_DOTA_Unit_Hero_Shadow_Demon"),
    LONEDRUID(80, "Lone Druid", "DT_DOTA_Unit_Hero_LoneDruid"),
    CHAOSKNIGHT(81, "Chaos Knight", "DT_DOTA_Unit_Hero_ChaosKnight"),
    MEEPO(82, "Meepo", "DT_DOTA_Unit_Hero_Meepo"),
    TREANTPROTECTOR(83, "Treant Protector", "DT_DOTA_Unit_Hero_Treant"),
    OGREMAGI(84, "Ogre Magi", "DT_DOTA_Unit_Hero_Ogre_Magi"),
    UNDYING(85, "Undying", "DT_DOTA_Unit_Hero_Undying"),
    RUBICK(86, "Rubick", "DT_DOTA_Unit_Hero_Rubick"),
    DISRUPTOR(87, "Disruptor", "DT_DOTA_Unit_Hero_Disruptor"),
    NYXASSASSIN(88, "Nyx Assassin", "DT_DOTA_Unit_Hero_Nyx_Assassin"),
    NAGASIREN(89, "Naga Siren", "DT_DOTA_Unit_Hero_Naga_Siren"),
    KEEPEROFTHELIGHT(90, "Keeper of the Light", "DT_DOTA_Unit_Hero_KeeperOfTheLight"),
    IO(91, "Io", "DT_DOTA_Unit_Hero_Wisp"),
    VISAGE(92, "Visage", "DT_DOTA_Unit_Hero_Visage"),
    SLARK(93, "Slark", "DT_DOTA_Unit_Hero_Slark"),
    MEDUSA(94, "Medusa", "DT_DOTA_Unit_Hero_Medusa"),
    TROLLWARLORD(95, "Troll Warlord", "DT_DOTA_Unit_Hero_TrollWarlord"),
    CENTAURWARRUNNER(96, "Centaur Warrunner", "DT_DOTA_Unit_Hero_Centaur"),
    MAGNUS(97, "Magnus", "DT_DOTA_Unit_Hero_Magnataur"),
    TIMBERSAW(98, "Timbersaw", "DT_DOTA_Unit_Hero_Shredder"),
    BRISTLEBACK(99, "Bristleback", "DT_DOTA_Unit_Hero_Bristleback"),
    TUSK(100, "Tusk", "DT_DOTA_Unit_Hero_Tusk"),
    SKYWRATHMAGE(101, "Skywrath Mage", "DT_DOTA_Unit_Hero_Skywrath_Mage"),
    ABADDON(102, "Abaddon", "DT_DOTA_Unit_Hero_Abaddon"),
    ELDERTITAN(103, "Elder Titan", "DT_DOTA_Unit_Hero_Elder_Titan"),
    LEGIONCOMMANDER(104, "Legion Commander", "DT_DOTA_Unit_Hero_Legion_Commander"),
    EMBERSPIRIT(106, "Ember Spirit", "DT_DOTA_Unit_Hero_EmberSpirit"),
    EARTHSPIRIT(107, "Earth Spirit", "DT_DOTA_Unit_Hero_EarthSpirit"),
    ABYSSALUNDERLORD(108, "Abyssal Underlord", "DT_DOTA_Unit_Hero_AbyssalUnderlord"),
    TERRORBLADE(109, "Terrorblade", "DT_DOTA_Unit_Hero_Terrorblade"),
    PHOENIX(110, "Phoenix", "DT_DOTA_Unit_Hero_Phoenix");

    private final Integer id;
    private final String publicName;
    private final String internalName;

    private Hero(Integer id, String publicName, String internalName) {
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

    private static final ImmutableMap<Integer, Hero> reverseMap;

    static {
        ImmutableMap.Builder<Integer, Hero> builder = ImmutableMap.builder();
        for (Hero value : EnumSet.allOf(Hero.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    private static final ImmutableMap<String, Hero> reverseInternalMap;

    static {
        ImmutableMap.Builder<String, Hero> builder = ImmutableMap.builder();
        for (Hero value : EnumSet.allOf(Hero.class)) {
            builder.put(value.internalName, value);
        }
        reverseInternalMap = builder.build();
    }

    public static Optional<Hero> fromId(Integer id) {
        Hero value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<Hero> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        Hero value = reverseMap.get(id.get());
        return Optional.of(value);
    }

    public static Optional<Hero> fromInternalName(String internalName) {
        Hero value = reverseInternalMap.get(internalName);
        return Optional.fromNullable(value);
    }
}
