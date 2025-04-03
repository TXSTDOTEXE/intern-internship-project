package gameObjects;

import java.time.Duration;

public class Fighter {
    int health;
    int attackStat;
    int defenseStat;
    time lastAttackTime;
    Duration cooldown;

    fighter(int health, int attackStat, int defenseStat) {
        this.health = health;
        this.attackStat = attackStat;
        this.defenseStat = defenseStat;
        lastAttackTime = time.now();
    }

    public int attack(int otherFighterHealth, int otherFighterDefenseStat) {
        Duration d = Duration.between(lastAttackTime, time.now());
        if (d.compareTo(cooldown) < 0) {
            otherFighterHealth = otherFighterHealth + otherFighterDefenseStat - attackStat;
            if (otherFighterHealth < 0) {
                otherFighterHealth = 0;
            }
            lastAttackTime = time.now();
        }
        
        return otherFighterHealth;
    }
}
