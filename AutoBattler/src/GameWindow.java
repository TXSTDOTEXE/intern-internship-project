import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class GameWindow extends JFrame {
    private BufferedImage background;
    private ArrayList<Fighter> fighters;  // List to keep track of the fighters
    
    public GameWindow() {
        setTitle("ThE GamE");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        try {
            String imagePath = "AutoBattler/src/assets/background.png";
            background = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        fighters = new ArrayList<>(); // Initialize the list of fighters
        
        add(new GameCanvas());
        setVisible(true);
    }
    
    // Method to add a fighter to the game
    public void AddFighter(Fighter fighter) {
        fighters.add(fighter);
        repaint(); // Redraw the canvas to display the new fighter
    }
    
    private class GameCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (background != null) {
                g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
            }
            
            // Draw each fighter
            for (Fighter fighter : fighters) {
                fighter.draw(g);
            }
        }
    }
    
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        
        // Example of adding fighters to the game
        gameWindow.AddFighter(new Fighter(100, 100, "AutoBattler/src/assets/fighter.png"));
        gameWindow.AddFighter(new Fighter(200, 200, "AutoBattler/src/assets/fighter.png"));
    }
}

// Fighter class to represent each fighter in the game
class Fighter {
    private int x, y;  // Position of the fighter
    private BufferedImage image;  // Image representing the fighter
    
    public Fighter(int x, int y, String imagePath) {
        this.x = x;
        this.y = y;
        try {
            this.image = ImageIO.read(new File(imagePath)); // Load the fighter image
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to draw the fighter on the canvas
    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image, x, y, null);
        }
    }
}