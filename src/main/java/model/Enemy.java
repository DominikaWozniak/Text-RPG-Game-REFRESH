package model;

import java.util.List;

public class Enemy extends BaseCharacter {

    private List<Loot> lootBox;

    public Enemy(){}

    public Enemy(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public List<Loot> getLootBox() {
        return lootBox;
    }

    public void setLootBox(List<Loot> lootBox) {
        this.lootBox = lootBox;
    }
}
