package services.impl;

import model.*;
import services.BackpackService;
import services.PlayerService;
import types.CharacterType;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlayerServiceImpl implements PlayerService {

    private Scanner scanner;
    private String additionalVar;
    private BackpackService backpackService;
    private List<Armor> armorSlots;
    private List<Weapon> weaponSlots;


    public PlayerServiceImpl(){
        scanner = new Scanner(System.in);
        backpackService = new BackpackServiceImpl();
        armorSlots = new LinkedList<>();
        weaponSlots = new LinkedList<>();
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
        switch (additionalVar){
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
        armorSlots.add(backpack.getFirstSlotArmor());
        armorSlots.add(backpack.getSecondSlotArmor());
        armorSlots.add(backpack.getThirdSlotArmor());
        armorSlots.add(backpack.getFourthSlotArmor());

        weaponSlots.add(backpack.getFirstSlotWeapon());
        weaponSlots.add(backpack.getSecondSlotWeapon());
        weaponSlots.add(backpack.getThirdSlotWeapon());
        weaponSlots.add(backpack.getFourthSlotWeapon());

        backpackService.showItems(armorSlots, weaponSlots);
    }

    @Override
    public void wearArmor(Player player) {

    }

    @Override
    public void setWeaponToHands(Player player) {

    }

    @Override
    public void chooseAttack(Player player) {

    }

    @Override
    public void makeDamagePoints(Player player) {

    }

    @Override
    public void attack(Player player, Enemy enemy) {

    }
}
