package src.data.player;

/**
 * Created by dougriss on 4/9/15.
 * Attributes are the governing stats that make up a character
 * Examples would be Strength, Constitution, Wisdom etc.
 */
public class Ability {
    private String name;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
