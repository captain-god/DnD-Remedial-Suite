package com.dougriss.data.player;

/**
 * Created by dougriss on 4/9/15.
 * Feats used to expand upon character builds.
 * +2 to search, add damage to charge etc
 */
public class Feat {
    //this is definitely going to need some reworking...
    private String name;
    private String description;
    private FeatType featType;
    private Ability governingAbility;
    private int minAttrScore;
    private int minLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FeatType getFeatType() {
        return featType;
    }

    public void setFeatType(FeatType featType) {
        this.featType = featType;
    }

    public Ability getGoverningAbility() {
        return governingAbility;
    }

    public void setGoverningAbility(Ability governingAbility) {
        this.governingAbility = governingAbility;
    }

    public int getMinAttrScore() {
        return minAttrScore;
    }

    public void setMinAttrScore(int minAttrScore) {
        this.minAttrScore = minAttrScore;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }
}
