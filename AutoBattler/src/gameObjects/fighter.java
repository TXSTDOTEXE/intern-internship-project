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
        this.cooldown = maxCooldown;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public int getDefenseStat() {
        return defenseStat;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void tryAttack(Fighter otherFighter) {
        if (cooldown <= 0) {
            otherFighter.takeDamage(attackStat - otherFighter.getDefenseStat());
            cooldown = maxCooldown; // Reset cooldown after attack
        }     cooldown--;
        }
    }
}
