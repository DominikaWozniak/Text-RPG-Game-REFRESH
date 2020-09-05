package services;

import model.Armor;
import model.Backpack;
import model.Weapon;
import types.ArmorType;
import types.WeaponType;


public interface BackpackService {

    void removeItemWeapon(Backpack backpack, WeaponType key);

    void removeItemArmor(Backpack backpack, ArmorType key);

    void addItemArmor(Armor armor, Backpack backpack);

    void addItemWeapon(Weapon weapon, Backpack backpack);

    void sellItemArmor(Backpack backpack, ArmorType key, Integer money);

    void sellItemWeapon(Backpack backpack, WeaponType key, Integer money);
}
