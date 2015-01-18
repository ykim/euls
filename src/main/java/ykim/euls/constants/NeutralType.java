package ykim.euls.constants;

public enum NeutralType {
    ANCIENT("ancient"),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    MEDIUM_OR_LARGE("medium or large");

    private final String publicName;

    private NeutralType(String publicName) {
        this.publicName = publicName;
    }

    public String getPublicName() {
        return publicName;
    }
}
