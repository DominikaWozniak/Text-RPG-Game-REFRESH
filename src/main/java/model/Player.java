package model;

public class Player extends BaseCharacter {

    private Body armor;
    private Weapon mainWeapon;
    private int money;
    private int expPoints;
    private Stats stats;
    private int focusPoints;
    private int armorPoints;

    public Player(){}

    public Body getArmor() {
        return armor;
    }

    public void setArmor(Body armor) {
        this.armor = armor;
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

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public int getFocusPoints() {
        return focusPoints;
    }

    public void setFocusPoints(int focusPoints) {
        this.focusPoints = focusPoints;
    }

    public int getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(int armorPoints) {
        this.armorPoints = armorPoints;
    }
}
