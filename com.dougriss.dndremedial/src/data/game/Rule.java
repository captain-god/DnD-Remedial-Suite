package src.data.game;

/**
 * Created by dougriss on 4/11/15.
 * it'd be kinda cool to allow the creation of custom rules, I thought..
 */
public class Rule {
    private String name;
    private String description;

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
