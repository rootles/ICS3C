/**
 * ICS3C/U: Munchkin Lite
 * Most of the work happens here
 * Kick down the Door; Fight Monster or get Cursed; Get Treasure
 * Will not have time to implement Look For Trouble
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.imageio.ImageIO; 

import javax.swing.*;
import javax.swing.border.*;
import javax.accessibility.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.io.File;
import java.io.IOException;


public class UI extends JPanel{

    private Image background;
    private Color[] layerColors = { Color.white, Color.black ,Color.gray,Color.darkGray, Color.lightGray,};
    // eventually use images instead of colours
    private JLayeredPane layeredPane;
    JLabel[] cards = new JLabel[10];

    Character[] players = new Character[2];
    Monster[] monsters = new Monster[25];
    Treasure[] treasures = new Treasure[25];

    class CardMouseListener extends MouseAdapter {
        private int labelNum;
        public CardMouseListener(int labelNum) {
            this.labelNum = labelNum;
        }
        

        private void adjustPlayerStats(){

        }

        private void drawTreasure(){

        }

        private void fight(){
            // if win, draw a treasure
            // either way, adjust stats
        }

        private void checkWin(){
            // print out winner to gui
            // disable all clicking
        }

        private void lootRoom(){

        }

        // corresponds to Kick Down the Door
        @Override
        public void mouseClicked(MouseEvent e) {

            // from previous Board.java file
            // will delete
            System.out.println(cards[labelNum] + "clicked");
            cards[labelNum].setBorder(BorderFactory.createLineBorder(Color.WHITE));
            cards[labelNum].setBackground(Color.red);

            // check card type
            // if monster, fight!
            // check winner
            // if not monster, call loot room?
        }
   }
  
    private void loadImage() {
        ImageIcon bg = new ImageIcon("dead_finks_don__t_talk_by_darkwood67800.jpg");
        background = bg.getImage();        
    }

    // Create and set up a label to represent a card on screen
    // Change colour parameter to card images
    // rename method to something more appropriate
    // reuse code from lab/assignment
    private JLabel createColoredLabel(Color color, Point origin) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(color);
        label.setForeground(Color.black);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setBounds(origin.x, origin.y, 120, 200);
        return label;
    }   
 
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    private void initUI() { 
        loadImage();

        int w = background.getWidth(this);
        int h =  background.getHeight(this);
        setPreferredSize(new Dimension(800, 800));  
        
        // from LayeredPaneDemo
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 800));

        Point origin = new Point(10, 20);
        int offset = 50;
        
        // player 1 labels to represent cards
        int j =0;
        for (j = 0; j < 2; j++) {
            
            cards[j] = createColoredLabel(layerColors[j], origin);
            cards[j].setName("card" +j);
            cards[j].addMouseListener(new CardMouseListener(j));
            layeredPane.add(cards[j], new Integer(j));
            System.out.println(j);
            origin.y += offset;     
        }

        add(layeredPane);    
    }

    // Create players
    // For this version, two players only
    private Character[] readyPlayerOne(Character[] players){
        players[0] = new Character("Bob", 1, classType.none, raceType.human);
        players[1] = new Character("Legolas", 2, classType.cleric, raceType.elf);
        return players;

    }

    private void buildMonsterDeck(){
        // monsters and curses 
        // maybe class/race change cards
    }

    private void buildTreasureDeck(){
        //treasures and potions
    }


    // does it even make sense to click player cards?
    // only center pile (kick door) is clickable
    // card flips over, fight
    // if win, trasure draw automatically, no click needed
    // move treasure to player hand
    // next player
    // if curse, remove card (just delete from gui and player deck?) reduce player level? 


    public UI() {
        players = readyPlayerOne(players);
        buildMonsterDeck();
        buildTreasureDeck();
        initUI();
    }
}
