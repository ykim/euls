package gg.cloud9.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

// TODO: TerrorBlade, Phoenix, Earth Spirit, Ember Spirit, and Abyssal Underlord
public enum Hero {
    ANTIMAGE(1, "Anti-Mage", "AntiMage"),
    AXE(2, "Axe", "Axe"),
    BANE(3, "Bane", "Bane"),
    BLOODSEEKER(4, "Bloodseeker", "Bloodseeker"),
    CRYSTALMAIDEN(5, "Crystal Maiden", "CrystalMaiden"),
    DROWRANGER(6, "Drow Ranger", "DrowRanger"),
    EARTHSHAKER(7, "Earthshaker", "Earthshaker"),
    JUGGERNAUT(8, "Juggernaut", "Juggernaut"),
    MIRANA(9, "Mirana", "Mirana"),
    MORPHLING(10, "Morphling", "Morphling"),
    SHADOWFIEND(11, "Shadow Fiend", "Nevermore"),
    PHANTOMLANCER(12, "Phantom Lancer", "PhantomLancer"),
    PUCK(13, "Puck", "Puck"),
    PUDGE(14, "Pudge", "Pudge"),
    RAZOR(15, "Razor", "Razor"),
    SANDKING(16, "Sand King", "SandKing"),
    STORMSPIRIT(17, "Storm Spirit", "StormSpirit"),
    SVEN(18, "Sven", "Sven"),
    TINY(19, "Tiny", "Tiny"),
    VENGEFULSPIRIT(20, "Vengeful Spirit", "VengefulSpirit"),
    WINDRANGER(21, "Windranger", "Windrunner"),
    ZEUS(22, "Zeus", "Zuus"),
    KUNKKA(23, "Kunkka", "Kunkka"),
    LINA(25, "Lina", "Lina"),
    LION(26, "Lion", "Lion"),
    SHADOWSHAMAN(27, "Shadow Shaman", "ShadowShaman"),
    SLARDAR(28, "Slardar", "Slardar"),
    TIDEHUNTER(29, "Tidehunter", "Tidehunter"),
    WITCHDOCTOR(30, "Witch Doctor", "WitchDoctor"),
    LICH(31, "Lich", "Lich"),
    RIKI(32, "Riki", "Riki"),
    ENIGMA(33, "Enigma", "Enigma"),
    TINKER(34, "Tinker", "Tinker"),
    SNIPER(35, "Sniper", "Sniper"),
    NECROPHOS(36, "Necrophos", "Necrolyte"),
    WARLOCK(37, "Warlock", "Warlock"),
    BEASTMASTER(38, "Beastmaster", "Beastmaster"),
    QUEENOFPAIN(39, "Queen of Pain", "QueenOfPain"),
    VENOMANCER(40, "Venomancer", "Venomancer"),
    FACELESSVOID(41, "Faceless Void", "FacelessVoid"),
    WRAITHKING(42, "Wraith King", "SkeletonKing"),
    DEATHPROPHET(43, "Death Prophet", "DeathProphet"),
    PHANTOMASSASSIN(44, "Phantom Assassin", "PhantomAssassin"),
    PUGNA(45, "Pugna", "Pugna"),
    TEMPLARASSASSIN(46, "Templar Assassin", "TemplarAssassin"),
    VIPER(47, "Viper", "Viper"),
    LUNA(48, "Luna", "Luna"),
    DRAGONKNIGHT(49, "Dragon Knight", "DragonKnight"),
    DAZZLE(50, "Dazzle", "Dazzle"),
    CLOCKWERK(51, "Clockwerk", "Rattletrap"),
    LESHRAC(52, "Leshrac", "Leshrac"),
    NATURESPROPHET(53, "Nature's Prophet", "Furion"),
    LIFESTEALER(54, "Life Stealer", "Life_Stealer"),
    DARKSEER(55, "Dark Seer", "DarkSeer"),
    CLINKZ(56, "Clinkz", "Clinkz"),
    OMNIKNIGHT(57, "Omniknight", "Omniknight"),
    ENCHANTRESS(58, "Enchantress", "Enchantress"),
    HUSKAR(59, "Huskar", "Huskar"),
    NIGHTSTALKER(60, "Night Stalker", "NightStalker"),
    BROODMOTHER(61, "Broodmother", "Broodmother"),
    BOUNTYHUNTER(62, "Bounty Hunter", "BountyHunter"),
    WEAVER(63, "Weaver", "Weaver"),
    JAKIRO(64, "Jakiro", "Jakiro"),
    BATRIDER(65, "Batrider", "Batrider"),
    CHEN(66, "Chen", "Chen"),
    SPECTRE(67, "Spectre", "Spectre"),
    ANCIENTAPPARITION(68, "Ancient Apparition", "AncientApparition"),
    DOOMBRINGER(69, "Doom Bringer", "DoomBringer"),
    URSA(70, "Ursa", "Ursa"),
    SPIRITBREAKER(71, "Spirit Breaker", "SpiritBreaker"),
    GYROCOPTER(72, "Gyrocopter", "Gyrocopter"),
    ALCHEMIST(73, "Alchemist", "Alchemist"),
    INVOKER(74, "Invoker", "Invoker"),
    SILENCER(75, "Silencer", "Silencer"),
    OUTWORLDDEVOURER(76, "Outworld Devourer", "Obsidian_Destroyer"),
    LYCAN(77, "Lycan", "Lycan"),
    BREWMASTER(78, "Brewmaster", "Brewmaster"),
    SHADOWDEMON(79, "Shadow Demon", "Shadow_Demon"),
    LONEDRUID(80, "Lone Druid", "LoneDruid"),
    CHAOSKNIGHT(81, "Chaos Knight", "ChaosKnight"),
    MEEPO(82, "Meepo", "Meepo"),
    TREANTPROTECTOR(83, "Treant Protector", "Treant"),
    OGREMAGI(84, "Ogre Magi", "Ogre_Magi"),
    UNDYING(85, "Undying", "Undying"),
    RUBICK(86, "Rubick", "Rubick"),
    DISRUPTOR(87, "Disruptor", "Disruptor"),
    NYXASSASSIN(88, "Nyx Assassin", "Nyx_Assassin"),
    NAGASIREN(89, "Naga Siren", "Naga_Siren"),
    KEEPEROFTHELIGHT(90, "Keeper of the Light", "KeeperOfTheLight"),
    IO(91, "Io", "Wisp"),
    VISAGE(92, "Visage", "Visage"),
    SLARK(93, "Slark", "Slark"),
    MEDUSA(94, "Medusa", "Medusa"),
    TROLLWARLORD(95, "Troll Warlord", "TrollWarlord"),
    CENTAURWARRUNNER(96, "Centaur Warrunner", "Centaur"),
    MAGNUS(97, "Magnus", "Magnataur"),
    TIMBERSAW(98, "Timbersaw", "Shredder"),
    BRISTLEBACK(99, "Bristleback", "Bristleback"),
    TUSK(100, "Tusk", "Tusk"),
    SKYWRATHMAGE(101, "Skywrath Mage", "Skywrath_Mage"),
    ABADDON(102, "Abaddon", "Abaddon"),
    ELDERTITAN(103, "Elder Titan", "Elder_Titan"),
    LEGIONCOMMANDER(104, "Legion Commander", "Legion_Commander"),
    EMBERSPIRIT(106, "Ember Spirit", "EmberSpirit"),
    EARTHSPIRIT(107, "Earth Spirit", "EarthSpirit"),
    ABYSSALUNDERLORD(108, "Abyssal Underlord", "AbyssalUnderlord");

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
}
