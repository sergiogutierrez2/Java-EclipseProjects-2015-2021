package CS151;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.concurrent.BlockingQueue;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Game implements KeyListener {
    /**
     * Builds a game, with a Board where the user controls a snake (up, down, left, right),
     * which has the objective of consuming food until it exceeds the size of
     * 40 tiles.
     */

    private static BlockingQueue<Message> queue;
    private static View view; // Direct reference to view
    private static Model model; // Direct reference to model
    private static ActionListener task;
    public static ActionEvent taskTwo;
    public static boolean buttonClicked = false;

    public Game(View view, Model model, BlockingQueue<Message> queue) {
        this.view = view;
        this.model = model;
        this.queue = queue;
    }

    static Controller game;

    public static void main(String[] args) {

        model = new Model();
        view = View.init(queue, model);
        model.attach(view);
        game = new Controller(view, model, queue);
        // KeyEvent e;
        task = (ActionEvent e) -> {
            keyPressed(e, game);
            buttonClicked = false;
            System.out.println("I'm here");
        };

      //  addKeyListener(new TAdapter());
        game.mainLoop();
        view.dispose();
        queue.clear();
        System.out.println("END");
    }

    @Override
    public void keyTyped(KeyEvent key) {
        game.directionInput(key);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        directionInput(e);
        game.directionInput(e);
        model.updateModel();
        System.out.println("I'm here");
    }

    public static void keyPressed(ActionEvent e, Controller controller) {
       // controller.directionInput();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void directionInput(KeyEvent key) {
        int keyCode = key.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (buttonClicked == false) {
                    game.model.snake.goUp();
                    buttonClicked = true;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (!buttonClicked) {
                    game.model.snake.goUp();
                    buttonClicked = true;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (!buttonClicked) {
                    game.model.snake.goLeft();
                    buttonClicked = true;
                    System.out.println("I'm here");
                }
                break;
            case KeyEvent.VK_RIGHT:
                    game.model.snake.goRight();
                    buttonClicked = true;
                System.out.println("I'm here");
                break;

            default:
                game.model.snake.goDown();
        }
    }

}