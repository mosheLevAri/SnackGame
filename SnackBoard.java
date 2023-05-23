//package il.co.lird.FS133.Projects.Snack;

public class SnackBoard implements Igraphic {
    private static final int WIDTH = 10;  // Width of the game grid
    private static final int HEIGHT = 10; // Height of the game grid
    static boolean isRunning = true;

    IGame snake = null;
    IFood food = null;

    public SnackBoard(IGame snake, IFood food)
    {
        this.snake = snake;
        this.food = food;
    }

    @Override
    public void printGameBoard() {
        clearBoard();
        // Print the top border
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print("# ");
        }
        System.out.println();

        // Print the game board
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print("# "); // Left border
            for (int j = 0; j < WIDTH; j++) {
                if (snake.containsPosition(j, i)) {
                    System.out.print("\u001B[33m* \u001B[0m"); // Yellow snake
                } else if (food.getPositionX() == j && food.getPositionY() == i) {
                    System.out.print("\u001B[32m$ \u001B[0m"); // Green food
                } else {
                    System.out.print("\u001B[31m  \u001B[0m"); // Red wall
                }
            }
            System.out.print("#"); // Right border
            System.out.println();
        }

        // Print the bottom border
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print("# ");
        }
        System.out.println();
    }

    @Override
    public void clearBoard() {
        try {

            System.out.print("\033[H\033[2J");
            System.out.flush();

        } catch (Exception e) {
            // Ignore clear console error
        }
    }
    @Override
    public String readKeyInput() {
        try {
            if (System.in.available() > 0) {
                byte[] bytes = new byte[System.in.available()];
                System.in.read(bytes);
                return new String(bytes).trim().toLowerCase();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return " ";
    }

}



