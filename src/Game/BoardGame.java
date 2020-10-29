package Game;

public class BoardGame {
    private Helper helper = new Helper();
    private Board board = new Board(new Square[] {
            new Square("", 0),
            new Square("Tower", 250),
            new Square("Crater", -100),
            new Square("Palace Gates", 100),
            new Square("Cold Desert", -20),
            new Square("Walled City", 180),
            new Square("Monastery", 0),
            new Square("Black Cave", -70),
            new Square("Huts in the Mountain", 60),
            new Square("The Werewall", -80),
            new Square("The Pit", -50),
            new Square("Goldmine", 650)
    });
    private Player[] players;
    private Die[] dice = { new Die(6), new Die(6) };
    private boolean winner = false;

    public BoardGame() {
    }

    public void rollDice() {
        dice[0].roll();
        dice[1].roll();
    }

    public void setup() {
        helper.message("\tWelcome!");

        // Select number of players
        helper.message("\nHow many players? Enter a integer between 2 and 4: ");
        int num = helper.scanIntInRange(2, 4);
        players = new Player[num];

        // Select name of players
        helper.message("\nEnter the name of all players: ");
        for (int i = 0; i < players.length; i++) {
            String name = helper.scanString();
            players[i] = new Player(name,1000, 0);
            helper.message(name + " was added to the player pool.");
        }
    }

    public void run() {
        helper.message("\n\tNow playing:");
        do {
            for (Player player: players) {
                // Roll Dice
                rollDice();
                int sum = dice[0].getFaceValue() + dice[1].getFaceValue();
                helper.message(player.toString() + " rolled:");
                for (Die die: dice) {
                    helper.message(die.toString());
                }

                // Move Piece
                player.movePiece(sum);
                int index = player.getPiece().getLocation() - 1;
                int total = board.getSquare(index).getValue();
                helper.message("...moving to " + board.getSquare(index).getName());

                // Update Balance
                player.updateBalance(total);
                helper.message(player.toString() + " has updated balance.\n");

                // Winner?
                if (player.getBank().getBalance() >= 3000) {
                    winner = !winner;
                    helper.message("Winner is " + player.getName() + "!");
                    break;
                }
            }
        } while(!winner);
    }
}