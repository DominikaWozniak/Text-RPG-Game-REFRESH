package model;

import types.ArmorType;

public class Armor extends Stats{

    private ArmorType armorType;
    private int additionalArmorPoints;

    public Armor(){}

    public Armor(int charisma, int strength, int agility, int magicEnergy) {
        super(charisma, strength, agility, magicEnergy);
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public int getAdditionalArmorPoints() {
        return additionalArmorPoints;
    }

    public void setAdditionalArmorPoints(int additionalArmorPoints) {
        this.additionalArmorPoints = additionalArmorPoints;
    }

}
