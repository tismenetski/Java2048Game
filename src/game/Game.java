package game;

import gui.GuiScreen;
import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements KeyListener, MouseListener, MouseMotionListener,Runnable {

    private static final Long serialVersionUID=1L;
    public static final int WIDTH=500;
    public static final int Height=600;
    //public static final Font main=new Font("Bebas Neue Regular",Font.getDefault(),28);
    private Thread game;
    private boolean running;
    private BufferedImage image=new BufferedImage(WIDTH,Height,BufferedImage.TYPE_INT_RGB);
    private GameBoard board;
    private GuiScreen screen;

}
