package gameObjects;

public class Fighter {
    int health;
    int attackStat;
    int defenseStat;
    int cooldown;

    public Fighter(int health, int attackStat, int defenseStat, int cooldown) {
        this.health = health;
        this.attackStat = attackStat;
        this.defenseStat = defenseStat;
        this.cooldown = cooldown;
    }

    public int tryAttack(int otherFighterHealth, int otherFighterDefenseStat) {
        if(cooldown <= 0){
            otherFighterHealth = otherFighterHealth + otherFighterDefenseStat - attackStat;
            if(otherFighterHealth < 0){
                otherFighterHealth = 0;
            }
            cooldown = 5; // Reset cooldown after attack
        }
        else{
         

        return otherFighterHealth;
    }
}
