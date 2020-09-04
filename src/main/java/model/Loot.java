package model;

import java.util.Map;

public class Loot {

    private Map<String, Armor> armors;
    private Map<String, Weapon> weapons;

    public Map<String, Armor> getArmors() {
        return armors;
    }

    public void setArmors(Map<String, Armor> armors) {
        this.armors = armors;
    }

    public Map<String, Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Map<String, Weapon> weapons) {
        this.weapons = weapons;
    }
}
