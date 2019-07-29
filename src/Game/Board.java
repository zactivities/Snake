package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        createBoard();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        drawGame(g);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(liveGame){
            checkFood();
            checkGameOver();
            move();
        }

        repaint();
    }

    private void drawGame(Graphics g){

    }

    private void createBoard(){
        addKeyListener(new Adapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        loadImages();
        initGame();
    }

    private void loadImages(){

    }

    private void initGame(){

    }

    private void gameOver(Graphics g){

    }

    private void checkFood(){

    }

    private void move(){

    }

    private void checkGameOver(){

    }

    private void locateFood(){

    }

    private class Adapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();

            if((key == KeyEvent.VK_LEFT) && (!rightMove)){
                leftMove = true;
                upMove = false;
                downMove = false;
            }

            if((key == KeyEvent.VK_RIGHT) && (!leftMove)){
                rightMove = true;
                upMove = false;
                downMove = false;
            }

            if((key == KeyEvent.VK_UP) && (!downMove)){
                upMove = true;
                leftMove = false;
                rightMove = false;
            }

            if((key == KeyEvent.VK_DOWN) && (!upMove)){
                downMove = true;
                rightMove = false;
                leftMove = false;
            }

        }
    }

}
