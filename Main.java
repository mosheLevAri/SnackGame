//package il.co.lird.FS133.Projects.Snack;

public class Main {

    public static void main(String[] args) {
        Icontroller game = new Controller();
        try {
            game.startGame();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
