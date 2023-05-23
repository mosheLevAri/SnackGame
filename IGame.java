//package il.co.lird.FS133.Projects.Snack;

public interface IGame {

    public void initialize(int width, int height);

    public void move();

    public void setDirection(String newDirection);

    public boolean collidesWith(IFood food);

    public void eatFood();

    public boolean containsPosition(int x, int y);
    }
