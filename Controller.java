//package il.co.lird.FS133.Projects.Snack;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Controller implements Icontroller {

    private static final int WIDTH = 10;  // Width of the game grid
    private static final int HEIGHT = 10; // Height of the game grid

    private IGame snake;
    private IFood food;
    private Igraphic board;
    private int score;
    private int level;
    static boolean isRunning = true;

    public Controller() {
        score = 0;
        level = 1;

        snake = new Snake();
        food = new Food();
        board = new SnackBoard(snake, food);
    }


    @Override
    public void startGame() throws InterruptedException {
        snake.initialize(WIDTH, HEIGHT);
        placeFood();

        while (isRunning) {
            board.printGameBoard();
            System.out.println("\nScore: " + score + " Level: " + level);
            String input = board.readKeyInput();
            sleep(350);
            if (input.equals("q")) {
                System.out.println("Game Over!");
                stopGame();
                System.exit(0);
            }
            if (isValidDirection(input)) {
                snake.setDirection(input);
            }
            snake.move();
            if (snake.collidesWith(food)) {
                snake.eatFood();
                increaseScore(10);
                if (score % 50 == 0) {
                    levelUp();
                }
                placeFood();
            }
        }

    }

    @Override
    public void stopGame() {

    }

    @Override
    public void getInput() {

    }

    @Override
    public void placeFood() {
        Random random = new Random();
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        food.setPosition(x, y);
    }

    private boolean isValidDirection(String direction) {
        return direction.equals("w") || direction.equals("a")
                || direction.equals("s") || direction.equals("d");
    }


    private void increaseScore(int points) {
        score += points;
    }

    private void levelUp() {
        level++;
    }
}
