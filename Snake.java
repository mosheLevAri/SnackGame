//package il.co.lird.FS133.Projects.Snack;

import java.util.ArrayList;
import java.util.List;

class Snake implements IGame {

    private int width;
    private int height;
    private int length;
    private String direction;
    private String lastDirection;
    private List<BodyPart> body;


    public Snake() {
        length = 1;
        lastDirection = direction = "a";
        body = new ArrayList<>();
    }

    @Override
    public void initialize(int width, int height) {

        this.width = width;
        this.height = height;
        int initialX = width / 2;
        int initialY = height / 2;
        body.clear();
        body.add(new BodyPart(initialX, initialY));
    }

    @Override
    public void move() {
        int headX = body.get(0).getX();
        int headY = body.get(0).getY();

        if (direction.equals(" ")) {
            direction = lastDirection;
        }

        switch (direction) {

            case "w":
                headY--;
                break;
            case "s":
                headY++;
                break;
            case "a":
                headX--;
                break;
            case "d":
                headX++;
                break;
        }
        setLestDirection();

        // Check if the snake touches the wall or itself
        if (checkCollision(headX, headY)) {
            System.out.println("Game Over!");
            SnackBoard.isRunning = false;
            System.exit(0);
        }
        updateBodyPositions(headX, headY);
    }

    private void updateBodyPositions(int headX, int headY) {
        // Update the positions of the snake's body parts
        for (int i = length - 1; i > 0; i--) {
            BodyPart currentPart = body.get(i);
            BodyPart previousPart = body.get(i - 1);
            currentPart.setX(previousPart.getX());
            currentPart.setY(previousPart.getY());
        }

        // Update the position of the snake's head
        body.get(0).setX(headX);
        body.get(0).setY(headY);
    }

    @Override
    public void setDirection(String newDirection) {
        direction = newDirection;
    }

    @Override
    public boolean collidesWith(IFood food) {
        int headX = body.get(0).getX();
        int headY = body.get(0).getY();
        return headX == food.getPositionX() && headY == food.getPositionY();
    }

    @Override
    public void eatFood() {
        length++;
        body.add(new BodyPart(-1, -1)); // Placeholder position, will be updated on the next move
    }

    @Override
    public boolean containsPosition(int x, int y) {
        for (BodyPart part : body) {
            if (part.getX() == x && part.getY() == y) {
                return true;
            }
        }
        return false;
    }

    /************* Private Methods ****************/

    private void setLestDirection() {
        lastDirection = direction;
    }

    private boolean isValidDirection(String newDirection) {
        return newDirection.equals("w") || newDirection.equals("a")
                || newDirection.equals("s") || newDirection.equals("d");
    }

    private boolean checkCollision(int headX, int headY) {
        return headX < 0 || headX >= width || headY < 0 || headY >= height || containsPosition(headX, headY);
    }
}
