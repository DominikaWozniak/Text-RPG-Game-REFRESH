package services.impl;

import model.*;
import services.ArmorService;
import services.BackpackService;
import services.PlayerService;
import services.WeaponService;
import types.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlayerServiceImpl implements PlayerService {

    private Scanner scanner;
    private String additionalVar;
    private AttackType[] attacksTypeArray;
    private ArmorService armorService;
    private WeaponService weaponService;


    public PlayerServiceImpl() {
        scanner = new Scanner(System.in);
        attacksTypeArray = new AttackType[3];
        armorService = new ArmorServiceImpl();
        weaponService = new WeaponServiceImpl();
    }

    @Override
    public void createNewPlayer(Player player) {
        System.out.println("Nadaj imię swojej postaci.");
        player.setName(scanner.nextLine());
        System.out.println("Imię Twojej postaci to:" + player.getName());
        System.out.println("Teraz wybierz klasę postaci: \n" +
                "1. Warrior \n" +
                "2. Necromancer \n" +
                "3. Elf");
        additionalVar = scanner.nextLine();
        switch (additionalVar) {
            case "1":
                player.setCharacterType(CharacterType.WARRIOR);
                break;
            case "2":
                player.setCharacterType(CharacterType.NECROMANCER);
                break;
            case "3":
                player.setCharacterType(CharacterType.ELF);
                break;
        }
        System.out.println("Klasa Twojej postaci: " + player.getCharacterType());
    }

    @Override
    public void showBackpack(Backpack backpack) {
        Map<ArmorType, Armor> armorFromBackpack = backpack.getArmorSlots();
        Map<WeaponType, Weapon> weaponInBackpack = backpack.getWeaponsSlots();

        System.out.println("PRZEDMIOTY W PLECAKU" + "\n" +
                "Złoto: " + backpack.getMoney() + "\n");

            armorFromBackpack.forEach((x, y) ->
                armorService.screenArmorItems(armorFromBackpack.get(x))
            );

            weaponInBackpack.forEach((x, y) ->
                weaponService.screenWeaponItems(weaponInBackpack.get(x)));

    }

    @Override
    public void wearArmor(Player player) {

    }

    @Override
    public void setWeaponToHands(Player player) {

    }

    @Override
    public void setAttacksToArray(Player player) {

        if (player.getCharacterType() == CharacterType.WARRIOR) {
            attacksTypeArray[0] = AttackType.STRONG_ATTACK;
            attacksTypeArray[1] = AttackType.SHOCKWAVE;
            attacksTypeArray[2] = AttackType.SKULL_CRUSH;
        } else if (player.getCharacterType() == CharacterType.NECROMANCER) {
            attacksTypeArray[0] = AttackType.ZOMBIE_ATTACK;
            attacksTypeArray[1] = AttackType.SCYTHE_CUTTING;
            attacksTypeArray[2] = AttackType.DRAINING_THE_SOUL;
        } else if (player.getCharacterType() == CharacterType.ELF) {
            attacksTypeArray[0] = AttackType.LIGHT_BOW_ATTACK;
            attacksTypeArray[1] = AttackType.SERIES_FROM_THE_BOW;
            attacksTypeArray[2] = AttackType.THROW_KNIVES;
        }
    }

    @Override
    public void chooseAttack(Player player) {
        System.out.println("Twoje punkty skupienia: " + player.getFocusPoints());
        System.out.println("Wybierz typ ataku dostępny dla Twojej postaci: ");

        int z = 0;

        for (int i = 0; i < attacksTypeArray.length; i++) {
            z++;
            System.out.println(z + ": " + attacksTypeArray[i]);
        }

        additionalVar = scanner.nextLine();

        switch (additionalVar) {
            case "1":
                System.out.println("Twój atak: " + attacksTypeArray[0] + "\n" +
                        "Koszt tego ataku to 10 punktów skupienia.");

                player.setFocusPoints(player.getFocusPoints() - 10);
                System.out.println("Pozostałe punkty skupienia: " + player.getFocusPoints());

                if (player.getFocusPoints() < 0) {

                    player.setFocusPoints(player.getFocusPoints() + 10);
                    System.out.println("Masz za mało punktów skupienia na ten atak. \n" +
                            "Odczekaj turę. \n" +
                            "Punkty skupienia: " + player.getFocusPoints());
                }
                break;

            case "2":
                if (player.getFocusPoints() >= 15) {

                    System.out.println("Twój atak: " + attacksTypeArray[1] + "\n" +
                            "Koszt tego ataku to 15 punktów skupienia.");
                    player.setFocusPoints(player.getFocusPoints() - 15);
                    System.out.println("Pozostałe punkty skupienia: " + player.getFocusPoints());

                } else {
                    System.out.println("Masz za mało punktów skupienia. Odczekaj turę.");
                }
                break;

            case "3":
                if (player.getFocusPoints() >= 20) {

                    System.out.println("Twój atak: " + attacksTypeArray[2] + "\n" +
                            "Koszt tego ataku to 20 punktów skupienia.");
                    player.setFocusPoints(player.getFocusPoints() - 20);
                    System.out.println("Pozostałe punkty skupienia: " + player.getFocusPoints());

                } else {
                    System.out.println("Masz za mało punktów skupienia.");
                }
                break;
        }

    }

    @Override
    public void makeDamagePoints(Player player) {

    }

    @Override
    public void attack(Player player, Enemy enemy) {
        int enemyHealthAfterAttack;
        enemyHealthAfterAttack = enemy.getHealthPoints() - player.getAttackPoints();
        enemy.setHealthPoints(enemyHealthAfterAttack);
    }

    @Override
    public void transferStatsPoints(Player player, ArmorType armorKey, StatsEnum statsKey) {

        Map<StatsEnum, Integer> stats = player.getStats();
        Map<ArmorType, Armor> armorOnPlayerBody = player.getArmor();

        Armor armor = armorOnPlayerBody.get(armorKey);

        stats.put(statsKey, armor.getArmorPoints() + stats.get(statsKey));
        stats.put(statsKey, armor.getAgility() + stats.get(statsKey));
        stats.put(statsKey, armor.getCharisma() + stats.get(statsKey));
        stats.put(statsKey, armor.getMagicEnergy() + stats.get(statsKey));
        stats.put(statsKey, armor.getStrength() + stats.get(statsKey));

    }
}
