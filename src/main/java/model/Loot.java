package model;

import types.ArmorType;
import types.WeaponType;

import java.util.Map;

public class Loot {

    private Map<ArmorType, Armor> armors;
    private Map<WeaponType, Weapon> weapons;

    public Map<ArmorType, Armor> getArmors() {
        return armors;
    }

    public void setArmors(Map<ArmorType, Armor> armors) {
        this.armors = armors;
    }

    public Map<WeaponType, Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Map<WeaponType, Weapon> weapons) {
        this.weapons = weapons;
    }
}
