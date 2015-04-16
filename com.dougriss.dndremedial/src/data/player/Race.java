package src.data.player;

import java.util.AbstractMap;
import java.util.ArrayList;

/**
 * Created by dougriss on 4/9/15.
 * structure of a race in the game
 */
public class Race {
    private String name;
    private String description;
    private PlayerClass favoredClass;
    private ArrayList<AbilityMods> abilityModifiers;
    private int middleAge;
    private int oldAge;
    private int venerableAge;
    private int maxAge;

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

    public PlayerClass getFavoredClass() {
        return favoredClass;
    }

    public void setFavoredClass(PlayerClass favoredClass) {
        this.favoredClass = favoredClass;
    }

    public int getMiddleAge() {
        return middleAge;
    }

    public void setMiddleAge(int middleAge) {
        this.middleAge = middleAge;
    }

    public int getOldAge() {
        return oldAge;
    }

    public void setOldAge(int oldAge) {
        this.oldAge = oldAge;
    }

    public int getVenerableAge() {
        return venerableAge;
    }

    public void setVenerableAge(int venerableAge) {
        this.venerableAge = venerableAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public ArrayList<AbilityMods> getAbilityModifiers() {
        return abilityModifiers;
    }

    public void setAbilityModifiers(ArrayList<AbilityMods> abilityModifiers) {
        this.abilityModifiers = abilityModifiers;
    }

    public class AbilityMods{
        int mod;
        Ability ability;

        public AbilityMods(int i, Ability ability){
            setAbility(ability);
            setMod(i);
        }

        public void setAbility(Ability ability) {
            this.ability = ability;
        }

        public void setMod(int mod) {
            this.mod = mod;
        }

        public Ability getAbility() {
            return ability;
        }

        public int getMod() {
            return mod;
        }
    }
}
