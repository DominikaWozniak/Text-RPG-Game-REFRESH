package services;

import model.*;
import types.ArmorType;
import types.StatsEnum;

import java.util.Map;

public interface PlayerService {

    void createNewPlayer(Player player);

    void showBackpack(Backpack backpack);

    void wearArmor(Player player);

    void setWeaponToHands(Player player);

    void chooseAttack(Player player);

    void makeDamagePoints(Player player);

    void attack(Player player, Enemy enemy);

    void setAttacksAndDamageToMap(Player player);

    void transferStatsPoints(Player player, ArmorType armorKey);

    void addAttacksToArray(Player player);

    void addFocusPointsToMap(Player player);
}
