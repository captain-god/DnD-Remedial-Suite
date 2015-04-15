package src.data.item;

/**
 * Created by dougriss on 4/9/15.
 * Structure of an item
 * structure of Armor and Weapons, too.
 */
public class Item {
    private String name;
    private String description;
    private int weightInPounds;
    private int costInCopper;

    public int getCostInCopper() {
        return costInCopper;
    }

    public void setCostInCopper(int costInCopper) {
        this.costInCopper = costInCopper;
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

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
