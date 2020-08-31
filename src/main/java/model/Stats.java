package model;

public class Stats {

    private Integer charisma;
    private Integer strength;
    private Integer agility;
    private Integer magicEnergy;

    public Stats(){}

    public Stats(Integer charisma, Integer strength, Integer agility, Integer magicEnergy) {
        this.charisma = charisma;
        this.strength = strength;
        this.agility = agility;
        this.magicEnergy = magicEnergy;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }
}
