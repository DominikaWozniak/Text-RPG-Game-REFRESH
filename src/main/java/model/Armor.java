package model;

import types.ArmorType;

public class Armor extends Stats{

    private ArmorType armorType;
    private Integer armorPoints;

    public Armor(){}

    public Armor(ArmorType armorType, Integer armorPoints, Integer charisma, Integer strength, Integer agility, Integer magicEnergy) {
        super(charisma, strength, agility, magicEnergy);
        this.armorType = armorType;
        this.armorPoints = armorPoints;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public Integer getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(Integer armorPoints) {
        this.armorPoints = armorPoints;
    }
}

