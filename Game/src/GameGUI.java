//import javax.swing.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class GameGUI extends JFrame {
//    private JLabel backgroundLabel;
//    private JLabel characterLabel;
//    private JLabel textLabel;
//    private int charX, charY;
//    public GameGUI(){
//        setTitle("Game Frame");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(800, 600);
//        setLocationRelativeTo(null);
//        setResizable(false);
//
//        setBackgroundImage();
//        addGameCharacter();
//        addKeyboardListener();
//
//        setFocusable(true);
//        requestFocusInWindow();
//        setVisible(true);
//
//    }
//
//    public void setBackgroundImage(){
//        ImageIcon bgImage = new ImageIcon("src/Assets/bg.jpeg.jpg");
//        this.backgroundLabel = new JLabel(bgImage);
//        this.backgroundLabel.setBounds(0,0,800,600);
//        add(this.backgroundLabel);
//    }
//    public void addGameCharacter(){
//        ImageIcon characterIcon = new ImageIcon("src/Assets/char.jpeg.jpg");
//        characterLabel = new JLabel(characterIcon);
//        charX = 350;
//        charY = 300;
//        characterLabel.setBounds(charX, charY, 100, 167);
//        backgroundLabel.add(characterLabel);
//    }
//
//    public void addKeyboardListener(){
//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                int keyCode = e.getKeyCode();
//                switch (keyCode){
//                    case KeyEvent.VK_UP -> {
//                        charY -= 10;
//                        break;
//                    }
//                    case KeyEvent.VK_DOWN -> {
//                        charY += 10;
//                        break;
//                    }
//                    case KeyEvent.VK_RIGHT -> {
//                        charX += 10;
//                        break;
//                    }
//                    case KeyEvent.VK_LEFT -> {
//                        charX -= 10;
//                        break;
//                    }
//                }
//                characterLabel.setLocation(charX, charY);
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });
//    }
//}


//
//import javax.swing.*;
//        import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class GameGUI extends JFrame {
//    private JLabel backgroundLabel;
//    private JLabel characterLabel;
//    private int charX, charY;
//
//    public GameGUI() {
//        setTitle("Game Frame");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(800, 600);
//        setLocationRelativeTo(null);
//        setResizable(false);
//
//        setLayout(null); // Setting layout to null for absolute positioning
//
//        setBackgroundImage();
//        addGameCharacter();
//        addKeyboardListener();
//
//        setFocusable(true);
//        requestFocusInWindow();
//        setVisible(true);
//    }
//
//    private void setBackgroundImage() {
//        ImageIcon bgImage = new ImageIcon("src/Assets/bg.jpeg.jpg");
//        backgroundLabel = new JLabel(bgImage);
//        backgroundLabel.setBounds(0, 0, 800, 600);
//        add(backgroundLabel);
//    }
//
//    private void addGameCharacter() {
//        ImageIcon characterIcon = new ImageIcon("src/Assets/char.jpeg.jpg");
//        characterLabel = new JLabel(characterIcon);
//        charX = 350;
//        charY = 300;
//        characterLabel.setBounds(charX, charY, 100, 167);
//        backgroundLabel.add(characterLabel);
//    }
//
//    private void addKeyboardListener() {
//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                // No implementation needed for keyTyped in this context
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                int keyCode = e.getKeyCode();
//                switch (keyCode) {
//                    case KeyEvent.VK_UP -> charY -= 10;
//                    case KeyEvent.VK_DOWN -> charY += 10;
//                    case KeyEvent.VK_RIGHT -> charX += 10;
//                    case KeyEvent.VK_LEFT -> charX -= 10;
//                }
//                characterLabel.setLocation(charX, charY);
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                // No implementation needed for keyReleased in this context
//            }
//        });
//    }
//}



import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGUI extends JFrame {
    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private int charX, charY;

    public GameGUI() {
        setTitle("Game Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null); // Setting layout to null for absolute positioning

        setBackgroundImage();
        addGameCharacter();
        addKeyboardListener();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }

    private void setBackgroundImage() {
        ImageIcon bgImage = new ImageIcon("src/Assets/bg.jpeg.jpg");
        backgroundLabel = new JLabel(bgImage);
        backgroundLabel.setBounds(0, 0, 800, 600);
        add(backgroundLabel);
    }

    private void addGameCharacter() {
        ImageIcon characterIcon = new ImageIcon("src/Assets/char.jpeg.jpg");
        characterLabel = new JLabel(characterIcon);
        charX = 350;
        charY = 300;
        characterLabel.setBounds(charX, charY, 100, 167);
        backgroundLabel.add(characterLabel);
    }

    private void addKeyboardListener() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // No implementation needed for keyTyped in this context
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP -> charY -= 10;
                    case KeyEvent.VK_DOWN -> charY += 10;
                    case KeyEvent.VK_RIGHT -> charX += 10;
                    case KeyEvent.VK_LEFT -> charX -= 10;
                }
                characterLabel.setLocation(charX, charY);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No implementation needed for keyReleased in this context
            }
        });
    }
}