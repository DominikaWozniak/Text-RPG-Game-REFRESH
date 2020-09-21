package services.impl;

import model.*;
import services.ArmorService;
import services.BackpackService;
import services.PlayerService;
import services.WeaponService;
import types.*;

import java.util.*;

public class PlayerServiceImpl implements PlayerService {

    private Scanner scanner;
    private Integer additionalVar;
    private ArmorService armorService;
    private WeaponService weaponService;
    private Map<AttackType, Integer> attackTypeMap;
    private AttackType[] attackArray;
    private Map<AttackType, Integer> focusPointsMap;


    public PlayerServiceImpl() {
        scanner = new Scanner(System.in);
        armorService = new ArmorServiceImpl();
        weaponService = new WeaponServiceImpl();
        attackTypeMap = new HashMap<>();
        attackArray = new AttackType[6];
        focusPointsMap = new HashMap<>();

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

        additionalVar = scanner.nextInt();

        switch (additionalVar) {
            case 1:
                player.setCharacterType(CharacterType.WARRIOR);
                break;
            case 2:
                player.setCharacterType(CharacterType.NECROMANCER);
                break;
            case 3:
                player.setCharacterType(CharacterType.ELF);
                break;
            default:
                System.out.println("Nieznana komenda. Zacznij raz jeszcze. \n");
                createNewPlayer(player);
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
    public void setAttacksAndDamageToMap(Player player) {

        switch (player.getCharacterType()) {
            case WARRIOR:
                attackTypeMap.put(AttackType.SHOCKWAVE, 1);
                attackTypeMap.put(AttackType.SKULL_CRUSH, 2);
                attackTypeMap.put(AttackType.STRONG_ATTACK, 3);
                attackTypeMap.put(AttackType.EPIC_CUT_BY_SWORD, 4);
                attackTypeMap.put(AttackType.HAMMER_TIME, 5);
                break;

            case NECROMANCER:
                attackTypeMap.put(AttackType.GRIM_SCYTHE, 1);
                attackTypeMap.put(AttackType.DRAINING_THE_SOUL, 2);
                attackTypeMap.put(AttackType.BLOOD_SPIKES_SPELL, 3);
                attackTypeMap.put(AttackType.ZOMBIE_ATTACK, 4);
                attackTypeMap.put(AttackType.EXPLODING_ZOMBIES, 5);
                break;

            case ELF:
                attackTypeMap.put(AttackType.LIGHT_BOW_ATTACK, 1);
                attackTypeMap.put(AttackType.THROW_KNIVES, 2);
                attackTypeMap.put(AttackType.SERIES_FROM_THE_BOW, 3);
                attackTypeMap.put(AttackType.SWORD_ATTACK, 4);
                attackTypeMap.put(AttackType.ATTACK_FROM_BEHIND, 5);
                break;
        }
    }

    @Override
    public void addAttacksToArray(Player player) {

        switch (player.getCharacterType()) {
            case WARRIOR:
                attackArray[0] = null;
                attackArray[1] = AttackType.SHOCKWAVE;
                attackArray[2] = AttackType.SKULL_CRUSH;
                attackArray[3] = AttackType.STRONG_ATTACK;
                attackArray[4] = AttackType.EPIC_CUT_BY_SWORD;
                attackArray[5] = AttackType.HAMMER_TIME;
                break;

            case NECROMANCER:
                attackArray[0] = null;
                attackArray[1] = AttackType.GRIM_SCYTHE;
                attackArray[2] = AttackType.DRAINING_THE_SOUL;
                attackArray[3] = AttackType.BLOOD_SPIKES_SPELL;
                attackArray[4] = AttackType.ZOMBIE_ATTACK;
                attackArray[5] = AttackType.EXPLODING_ZOMBIES;
                break;

            case ELF:
                attackArray[0] = null;
                attackArray[1] = AttackType.LIGHT_BOW_ATTACK;
                attackArray[2] = AttackType.THROW_KNIVES;
                attackArray[3] = AttackType.SERIES_FROM_THE_BOW;
                attackArray[4] = AttackType.SWORD_ATTACK;
                attackArray[5] = AttackType.ATTACK_FROM_BEHIND;
                break;
        }
    }

    @Override
    public void addFocusPointsToMap(Player player) {

        switch (player.getCharacterType()) {
            case WARRIOR:
                focusPointsMap.put(AttackType.SHOCKWAVE, 10);
                focusPointsMap.put(AttackType.SKULL_CRUSH, 15);
                focusPointsMap.put(AttackType.STRONG_ATTACK, 20);
                focusPointsMap.put(AttackType.EPIC_CUT_BY_SWORD, 25);
                focusPointsMap.put(AttackType.HAMMER_TIME, 30);
                break;

            case NECROMANCER:
                focusPointsMap.put(AttackType.GRIM_SCYTHE, 10);
                focusPointsMap.put(AttackType.DRAINING_THE_SOUL, 15);
                focusPointsMap.put(AttackType.BLOOD_SPIKES_SPELL, 20);
                focusPointsMap.put(AttackType.ZOMBIE_ATTACK, 25);
                focusPointsMap.put(AttackType.EXPLODING_ZOMBIES, 30);
                break;

            case ELF:
                focusPointsMap.put(AttackType.LIGHT_BOW_ATTACK, 10);
                focusPointsMap.put(AttackType.THROW_KNIVES, 15);
                focusPointsMap.put(AttackType.SERIES_FROM_THE_BOW, 20);
                focusPointsMap.put(AttackType.SWORD_ATTACK, 25);
                focusPointsMap.put(AttackType.ATTACK_FROM_BEHIND, 30);

        }
    }

    @Override
    public void chooseAttack(Player player) {
        System.out.println("Twoje punkty skupienia: " + player.getFocusPoints() + "\n" +
                "Wybierz typ ataku z dostępnych dla twojej postaci wpisując jej nazwę w konsoli: \n");

        int z = 0;

        for (int i = 1; i < attackArray.length; i++) {
            z++;
            System.out.println(z + ") " + attackArray[i] + "   Punkty ataku: "
                    + attackTypeMap.get(attackArray[i]));

        }

        additionalVar = scanner.nextInt();


        System.out.println("Twój atak: " + attackArray[additionalVar]);
        if (player.getFocusPoints() >= focusPointsMap.get(attackArray[additionalVar])) {
            player.setFocusPoints(player.getFocusPoints() - focusPointsMap.get(attackArray[additionalVar]));
            System.out.println("Twoje punkty skupienia po ataku: " + player.getFocusPoints());
        } else {
            System.out.println("Masz za mało punktów skupienia. Odczekaj turę. \n");
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
    public void transferStatsPoints(Player player, ArmorType armorKey) {
        Stats playerStats = player.getStats();

        Armor armor = player.getArmor().get(armorKey);

        player.setArmorPoints(player.getArmorPoints() + armor.getArmorPoints());

        playerStats.setAgility(playerStats.getAgility() + armor.getAgility());
        playerStats.setCharisma(playerStats.getCharisma() + armor.getCharisma());
        playerStats.setStrength(playerStats.getStrength() + armor.getStrength());
        playerStats.setMagicEnergy(playerStats.getMagicEnergy() + armor.getMagicEnergy());
    }
}
