package services;

import model.Backpack;
import model.Enemy;
import model.Player;

public interface PlayerService {

    void createNewPlayer(Player player);

    void showBackpack(Backpack backpack);

    void wearArmor(Player player);

    void setWeaponToHands(Player player);

    void chooseAttack(Player player);

    void makeDamagePoints(Player player);

    void attack(Player player, Enemy enemy);

    void setAttacksToArray(Player player);
}
