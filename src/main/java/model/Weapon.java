package model;

import types.WeaponType;

public class Weapon extends Stats{

    private WeaponType weaponType;
    private int damage;

    public Weapon(){}

    public Weapon(int charisma, int strength, int agility, int magicEnergy) {
        super(charisma, strength, agility, magicEnergy);
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
