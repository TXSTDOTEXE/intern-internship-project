import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            GameWindow gameWindow = new GameWindow();
            GameTimer gameTimer = new GameTimer();

            Fighter ally = new Fighter(100, 100, "AutoBattler/src/assets/fighter.png");
            Fighter enemy = new Fighter(600, 100, "AutoBattler/src/assets/fighter.png");

            gameWindow.AddFighter(ally);
            gameWindow.AddFighter(enemy);

            gameTimer.start(() -> {
                // This is where the game logic will be updated
                System.out.println("Game tick");
            });
        });

    }
}
