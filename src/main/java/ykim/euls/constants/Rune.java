package ykim.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum Rune {
    DOUBLE_DAMAGE(0, "Double Damage"),
    HASTE(1, "Haste"),
    ILLUSION(2, "Illusion"),
    INVISIBILITY(3, "Invisibility"),
    REGENERATION(4, "Regeneration"),
    BOUNTY(5, "Bounty");

    private final Integer id;
    private final String name;

    private Rune(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static final ImmutableMap<Integer, Rune> reverseMap;

    static {
        ImmutableMap.Builder<Integer, Rune> builder = ImmutableMap.builder();
        for (Rune value : EnumSet.allOf(Rune.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<Rune> fromId(Integer id) {
        Rune value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<Rune> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        Rune value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}
