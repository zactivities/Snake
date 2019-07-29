package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private final int BOARD_WIDTH = 400;
    private final int BOARD_HEIGHT = 400;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 140;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int [ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean leftMove = false;
    private boolean rightMove = true;
    private boolean upMove = false;
    private boolean downMove = false;
    private boolean liveGame = true;

    private Timer timer;
    private Image body;
    private Image head;
    private Image food;

    public Board(){

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        drawGame(g);
    }

    private void drawGame(Graphics g){

    }

    private void createBoard(){

    }

    private void loadImages(){

    }

    private void initGame(){

    }



}
