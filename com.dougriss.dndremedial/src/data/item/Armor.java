package src.data.item;

/**
 * Created by dougriss on 4/11/15.
 */
public class Armor extends Item{
    private int armorClass;
    private ArmorType armorType;
    private int dexModifier;
    private int spellFail;

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public int getDexModifier() {
        return dexModifier;
    }

    public void setDexModifier(int dexModifier) {
        this.dexModifier = dexModifier;
    }

    public int getSpellFail() {
        return spellFail;
    }

    public void setSpellFail(int spellFail) {
        this.spellFail = spellFail;
    }
}