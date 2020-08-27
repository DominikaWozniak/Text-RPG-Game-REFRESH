package services;

import model.Armor;
import model.Weapon;

import java.util.List;

public interface BackpackService {

    void showItems(List<Armor> armor, List<Weapon> weapon);

    void removeItem(Armor armor, Weapon weapon);

    void addItems(Armor armor, Weapon weapon);
}
