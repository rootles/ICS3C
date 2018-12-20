/**
 * ICS3C/U: Introduction to Programming
 * Welcome to MunchkinLite!
 * Associated files: UI.java, bonusType.java, classType.java, raceType.java, Character.java, Monster.java, Treasure.java, Curse.java
 */

import java.awt.EventQueue;
import javax.swing.JFrame;



public class MunchkinLite extends JFrame {

    public MunchkinLite() {

        loadUI();
    }

    private void loadUI() {

        add(new UI());

        setSize(800, 800);

        setTitle("Munchkin Lite!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MunchkinLite ml = new MunchkinLite();
            ml.setVisible(true);
        });
    }
}