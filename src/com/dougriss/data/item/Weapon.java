package com.dougriss.data.item;

/**
 * Created by dougriss on 4/11/15.
 */
public class Weapon extends Item{
    private DamageType damageType;
    private WeaponType weaponType;

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}