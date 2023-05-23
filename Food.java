//package il.co.lird.FS133.Projects.Snack;

class Food implements IFood{
    private int positionX;
    private int positionY;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
}
