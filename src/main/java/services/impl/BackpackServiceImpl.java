package services.impl;

import model.Armor;
import model.Weapon;
import services.ArmorService;
import services.BackpackService;
import services.WeaponService;
import types.ArmorType;
import types.WeaponType;

import java.util.List;
import java.util.Map;

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
    public void addItems(Armor armor, Weapon weapon) {

    }

    @Override
    public void removeItem(Map<ArmorType, Armor> armors, Map<WeaponType, Weapon> weapons, String key) {
        
    }

    @Override
    public void sellItem(Map<ArmorType, Armor> armors, Map<WeaponType, Weapon> weapons, String key) {

    }
}
