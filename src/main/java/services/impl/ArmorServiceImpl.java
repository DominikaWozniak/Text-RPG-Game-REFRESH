package services.impl;

import model.Armor;
import services.ArmorService;

public class ArmorServiceImpl implements ArmorService {

    @Override
    public void screenArmorItems(Armor armor) {
        System.out.println("Typ zbroi: " + armor.getArmorType()+"\n" +
                "Punkty do zbroi: " + armor.getArmorPoints() + "\n" +
                "Charyzma: " + armor.getCharisma() + "\n" +
                "Siła: " + armor.getStrength() + "\n" +
                "Zwinność: " + armor.getAgility() + "\n" +
                "Punkty many: " + armor.getMagicEnergy() + "\n");
    }
}
