package model;

import types.ArmorType;
import types.StatsEnum;

import java.util.Map;

public class Player extends BaseCharacter {

    private Map<ArmorType, Armor> armor;
    private Weapon mainWeapon;
    private int money;
    private int expPoints;
    private Map<StatsEnum, Integer> stats;
    private int focusPoints;

    public Player(){
    }

    public Map<ArmorType, Armor> getArmor() {
        return armor;
    }

    public void setArmor(Map<ArmorType, Armor> armor) {
        this.armor = armor;
    }

    public Map<StatsEnum, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<StatsEnum, Integer> stats) {
        this.stats = stats;
    }

    public Weapon getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(Weapon mainWeapon) {
        this.mainWeapon = mainWeapon;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }


    public int getFocusPoints() {
        return focusPoints;
    }

    public void setFocusPoints(int focusPoints) {
        this.focusPoints = focusPoints;
    }

}
