package services;

import model.Enemy;
import model.Player;

public interface LevelSystem {

    void addNextLevel(Player player);

    void enemyLevel(Enemy enemy, Player player);

    void addExpPoints(Player player);
}
