package services.impl;

import model.Armor;
import model.Backpack;
import model.Weapon;
import services.ArmorService;
import services.BackpackService;
import services.WeaponService;
import types.ArmorType;
import types.WeaponType;

import java.util.Map;

public class BackpackServiceImpl implements BackpackService {

    private ArmorService armorService;
    private WeaponService weaponService;

    public BackpackServiceImpl(){
        armorService = new ArmorServiceImpl();
        weaponService = new WeaponServiceImpl();
    }


    @Override
    public void addItemArmor(Armor armor, Backpack backpack) {
        Map<ArmorType, Armor> armorMap = backpack.getArmorSlots();
        armorMap.put(armor.getArmorType(), armor);
    }

    @Override
    public void addItemWeapon(Weapon weapon, Backpack backpack) {
        Map<WeaponType, Weapon> weaponMap = backpack.getWeaponsSlots();
        weaponMap.put(weapon.getWeaponType(), weapon);
    }

    @Override
    public void removeItemWeapon(Backpack backpack, WeaponType key) {
       Map<WeaponType, Weapon> weaponMap = backpack.getWeaponsSlots();
       weaponMap.remove(key);
    }

    @Override
    public void removeItemArmor(Backpack backpack, ArmorType key) {
        Map<ArmorType, Armor> armorMap = backpack.getArmorSlots();
        armorMap.remove(key);
    }

    @Override
    public void sellItemArmor(Backpack backpack, ArmorType key, Integer money) {
        removeItemArmor(backpack, key);
        backpack.setMoney(money);
    }

    @Override
    public void sellItemWeapon(Backpack backpack, WeaponType key, Integer money) {
        removeItemWeapon(backpack, key);
        backpack.setMoney(money);
    }
}
