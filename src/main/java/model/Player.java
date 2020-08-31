package model;

import java.util.Map;

public class Player extends BaseCharacter {

    private Map<String, Armor> armor;
    private Weapon mainWeapon;
    private int money;
    private int expPoints;
    private Map<String, Integer> stats;
    private int focusPoints;

    public Player(){
    }

    public Map<String, Armor> getArmor() {
        return armor;
    }

    public void setArmor(Map<String, Armor> armor) {
        this.armor = armor;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
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
