package src.data.player;

/**
 * Created by dougriss on 4/9/15.
 * Attributes are the governing stats that make up a character
 * Examples would be Strength, Constitution, Wisdom etc.
 */
public class Ability {
    private String name;
    private String description;

    public Ability(String name, String description){
        this.name = name;
        this.description = description;
    }

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
}
