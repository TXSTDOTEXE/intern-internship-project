import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            GameWindow gameWindow = new GameWindow();
            GameTimer gameTimer = new GameTimer();

            gameTimer.start(() -> {
                // This is where the game logic will be updated
                System.out.println("Game tick");
            });
        });

    }
}
