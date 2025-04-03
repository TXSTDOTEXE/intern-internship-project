import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameWindow extends JFrame {
    private BufferedImage background;
    
    public GameWindow() {
        setTitle("EXE Autobattler");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        try {
            String os = System.getProperty("os.name").toLowerCase();
            // Adjust file path based on the OS
            String imagePath;
            if (os.contains("win")) {
                imagePath = "AutoBattler/src/assests/background.png"; // Windows path
            } else {
                imagePath = "AutoBattler\\src\\assests\\background.png"; // Mac path
            }
            background = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        add(new GameCanvas());
        setVisible(true);
    }
    
    private class GameCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (background != null) {
                g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
            }
        }
    }
}
