package services.impl;

import model.Armor;
import model.Weapon;
import services.ArmorService;
import services.BackpackService;
import services.WeaponService;

import java.util.List;

public class BackpackServiceImpl implements BackpackService {

    private ArmorService armorService;
    private WeaponService weaponService;

    public BackpackServiceImpl(){
        armorService = new ArmorServiceImpl();
        weaponService = new WeaponServiceImpl();
    }

    @Override
    public void showItems(List<Armor> armor, List<Weapon> weapon) {

        for (Armor items : armor) {
            armorService.screenArmorItems(items);
        }

        for (Weapon items2 : weapon) {
            weaponService.screenWeaponItems(items2);
        }
    }

    @Override
    public void removeItem(Armor armor, Weapon weapon) {

    }

    @Override
    public void addItems(Armor armor, Weapon weapon) {

    }
}
