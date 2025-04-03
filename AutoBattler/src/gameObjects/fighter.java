package gameObjects;

public class Fighter {
    int health;
    int attackStat;
    int defenseStat;
    int maxCooldown;
    int cooldown;

    public Fighter(int health, int attackStat, int defenseStat, int maxCooldown) {
        this.health = health;
        this.attackStat = attackStat;
        this.defenseStat = defenseStat;
        this.maxCooldown = maxCooldown;
        this.cooldown = maxCooldown
    }

    public int tryAttack(int otherFighterHealth, int otherFighterDefenseStat) {
        if (cooldown <= 0) {
            otherFighterHealth = otherFighterHealth + otherFighterDefenseStat - attackStat;
            if (otherFighterHealth < 0) {
                otherFighterHealth = 0;
            }
            cooldown = maxCooldown; // Reset cooldown after attack
        } 
        else {
            cooldown--;
        }
        return otherFighterHealth;
    }
}
