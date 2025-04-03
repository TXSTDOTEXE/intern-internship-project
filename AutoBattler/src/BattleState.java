
import gameObjects.Fighter;

public class BattleState {
    Fighter player;
    Fighter enemy;
    int round;

    BattleState(){
        player =  new Fighter(100,12,7);
        enemy = new Fighter(100, 11, 8);
        round = 0;
    }

    void oneRound(){
        player.tryAttack(enemy);
        if (enemy.isDead()){
            System.println("Player wins!")
        }
        enemy.tryAttack(player);

        if (player.isDead()){
            System.println("Enemy wins!")
        }

    }


}
