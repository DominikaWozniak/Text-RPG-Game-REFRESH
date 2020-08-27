package model;

public class Backpack {

    private Armor firstSlotArmor;
    private Armor secondSlotArmor;
    private Armor thirdSlotArmor;
    private Armor fourthSlotArmor;

    private Weapon firstSlotWeapon;
    private Weapon secondSlotWeapon;
    private Weapon thirdSlotWeapon;
    private Weapon fourthSlotWeapon;

    public Backpack(){
        firstSlotArmor = new Armor();
        secondSlotArmor = new Armor();
        thirdSlotArmor = new Armor();
        fourthSlotArmor = new Armor();

        firstSlotWeapon = new Weapon();
        secondSlotWeapon = new Weapon();
        thirdSlotWeapon = new Weapon();
        fourthSlotWeapon = new Weapon();
    }

    public Armor getFirstSlotArmor() {
        return firstSlotArmor;
    }

    public void setFirstSlotArmor(Armor firstSlotArmor) {
        this.firstSlotArmor = firstSlotArmor;
    }

    public Armor getSecondSlotArmor() {
        return secondSlotArmor;
    }

    public void setSecondSlotArmor(Armor secondSlotArmor) {
        this.secondSlotArmor = secondSlotArmor;
    }

    public Armor getThirdSlotArmor() {
        return thirdSlotArmor;
    }

    public void setThirdSlotArmor(Armor thirdSlotArmor) {
        this.thirdSlotArmor = thirdSlotArmor;
    }

    public Armor getFourthSlotArmor() {
        return fourthSlotArmor;
    }

    public void setFourthSlotArmor(Armor fourthSlotArmor) {
        this.fourthSlotArmor = fourthSlotArmor;
    }

    public Weapon getFirstSlotWeapon() {
        return firstSlotWeapon;
    }

    public void setFirstSlotWeapon(Weapon firstSlotWeapon) {
        this.firstSlotWeapon = firstSlotWeapon;
    }

    public Weapon getSecondSlotWeapon() {
        return secondSlotWeapon;
    }

    public void setSecondSlotWeapon(Weapon secondSlotWeapon) {
        this.secondSlotWeapon = secondSlotWeapon;
    }

    public Weapon getThirdSlotWeapon() {
        return thirdSlotWeapon;
    }

    public void setThirdSlotWeapon(Weapon thirdSlotWeapon) {
        this.thirdSlotWeapon = thirdSlotWeapon;
    }

    public Weapon getFourthSlotWeapon() {
        return fourthSlotWeapon;
    }

    public void setFourthSlotWeapon(Weapon fourthSlotWeapon) {
        this.fourthSlotWeapon = fourthSlotWeapon;
    }
}
