package services;

import model.Armor;
import model.Weapon;
import types.ArmorType;
import types.WeaponType;

import java.util.List;
import java.util.Map;

public interface BackpackService {

    void showItems(List<Armor> armor, List<Weapon> weapon);

    void removeItem(Map<ArmorType, Armor> armors, Map<WeaponType, Weapon> weapons, String key);

    void addItems(Armor armor, Weapon weapon);

    void sellItem(Map<ArmorType, Armor> armors, Map<WeaponType, Weapon> weapons, String key);
}
