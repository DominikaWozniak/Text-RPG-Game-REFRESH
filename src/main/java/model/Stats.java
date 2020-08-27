package model;

public class Stats {

    private int charisma;
    private int strength;
    private int agility;
    private int magicEnergy;

    public Stats(){}

    public Stats(int charisma, int strength, int agility, int magicEnergy) {
        this.charisma = charisma;
        this.strength = strength;
        this.agility = agility;
        this.magicEnergy = magicEnergy;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(int magicEnergy) {
        this.magicEnergy = magicEnergy;
    }
}
