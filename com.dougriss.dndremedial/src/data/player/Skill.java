package src.data.player;

/**
 * Created by dougriss on 4/9/15.
 * Abilities are the basic skills available to characters in the game.
 * Examples would be climb, use rope, or disarm trap.
 */
public class Skill {
    private String name;
    private String description;
    private Ability governingStat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ability getGoverningStat() {
        return governingStat;
    }

    public void setGoverningStat(Ability governingStat) {
        this.governingStat = governingStat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
