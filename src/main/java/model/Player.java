package model;

import types.ArmorType;
import types.StatsEnum;

import java.util.Map;

public class Player extends BaseCharacter {

    private Map<ArmorType, Armor> armor;
    private Weapon mainWeapon;
    private int expPoints;
    private Stats stats;
    private Integer armorPoints;
    private int focusPoints;
    private Backpack backpack;

    public Player(){
    }

    public Map<ArmorType, Armor> getArmor() {
        return armor;
    }

    public void setArmor(Map<ArmorType, Armor> armor) {
        this.armor = armor;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Integer getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(Integer armorPoints) {
        this.armorPoints = armorPoints;
    }

    public Weapon getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(Weapon mainWeapon) {
        this.mainWeapon = mainWeapon;
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

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
}
