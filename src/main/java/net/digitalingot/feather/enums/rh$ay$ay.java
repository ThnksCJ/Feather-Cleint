package net.digitalingot.feather.enums;

enum rh$ay$ay {
    MOUNTAINS("https://assets.feathercdn.net/game/modpreview/background1.webp"),
    OCEAN("https://assets.feathercdn.net/game/modpreview/background2.webp"),
    SKYBLOCK("https://assets.feathercdn.net/game/modpreview/background3.webp"),
    STONE("https://assets.feathercdn.net/game/modpreview/stone.webp");

    private final String url;

    rh$ay$ay(String string2) {
        this.url = string2;
    }

    public String getURL() {
        return this.url;
    }
}
