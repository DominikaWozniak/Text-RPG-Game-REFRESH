package model;

import types.ArmorType;
import types.WeaponType;

import java.util.Map;

public class Backpack {

    private Map<WeaponType, Weapon> weaponsSlots;
    private Map<ArmorType, Armor> armorSlots;
    private Integer money;

    public Backpack(){}

    public Map<WeaponType, Weapon> getWeaponsSlots() {
        return weaponsSlots;
    }

    public void setWeaponsSlots(Map<WeaponType, Weapon> weaponsSlots) {
        this.weaponsSlots = weaponsSlots;
    }

    public Map<ArmorType, Armor> getArmorSlots() {
        return armorSlots;
    }

    public void setArmorSlots(Map<ArmorType, Armor> armorSlots) {
        this.armorSlots = armorSlots;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
