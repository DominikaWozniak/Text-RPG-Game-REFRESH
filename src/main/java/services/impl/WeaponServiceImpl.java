package services.impl;

import model.Weapon;
import services.WeaponService;

public class WeaponServiceImpl implements WeaponService {

    @Override
    public void screenWeaponItems(Weapon weapon) {
        System.out.println("Typ broni: " + weapon.getWeaponType() +"\n" +
                "Punkty obrażeń: " + weapon.getDamage()+ "\n" +
                "Charyzma: " + weapon.getCharisma() + "\n" +
                "Siła: " + weapon.getStrength() + "\n" +
                "Zwinność: " + weapon.getAgility() + "\n" +
                "Punkty many: " + weapon.getMagicEnergy());
    }
}
