import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.awt.Graphics;
import java.awt.MouseInfo;

/**
 * Created by Alex on 2/3/2017.
 * Billiard Trainer - Game that simulates a game of Billiards, to help aid players learning the different angles in
 *                      billiards while having fun.
 */
class MainGame extends JFrame implements ActionListener {
    javax.swing.Timer myTimer;
    GamePanel game;     // stores all the necessary components in memory, but most are not visible
    GameMenu menu;
    boolean inGame = false;
    int difficulty = 0;

    public MainGame() {
        super("Billiard-Trainer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,800);

        myTimer = new javax.swing.Timer(10,this);

        menu = new GameMenu(this);
        add(menu);
        game = new GamePanel(this);
        add(game);

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        ;
    }

    public static void main(String[] arguments) {
        System.out.println("hey");
    }
}
class GameMenu extends JPanel implements MouseListener{
    public GameMenu(MainGame m){}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void paintComponent(Graphics g){}
}
class GamePanel extends JPanel implements KeyListener{
    public GamePanel(MainGame m){}
    private boolean []keys;
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }
    public void keyReleased(KeyEvent e) {}
    public void paintComponent(Graphics g){}
}