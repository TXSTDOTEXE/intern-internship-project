package gameObjects;

public class fighter {
    int health;
    int attackStat;
    int defenseStat;
    int cooldown;

    public int attack(int otherFighterHealth, int otherFighterDefenseStat) {
        otherFighterHealth = otherFighterHealth + otherFighterDefenseStat - attackStat;
        if (otherFighterHealth < 0) {
            otherFighterHealth = 0;
        }
        return otherFighterHealth;
    }
}
