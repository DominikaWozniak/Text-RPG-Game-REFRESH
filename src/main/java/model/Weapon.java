package model;

import types.WeaponType;

public class Weapon extends Stats{

    private WeaponType weaponType;
    private Integer damage;

    public Weapon(){}

    public Weapon(WeaponType weaponType, Integer charisma, Integer strength, Integer agility, Integer magicEnergy, Integer damage) {
        super(charisma, strength, agility, magicEnergy);
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
