package Game;

public class Main {
    private static BoardGame game = new BoardGame();

    public static void main(String[] args) {
        game.setup();
        game.run();
    }
}
