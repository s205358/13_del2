package Game;

public class Player {
    // Spillernavn (Name) + get/set
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Void setName(String name) {
        this.name = name;
    }

    //Spillerkonto (Bank) + get/set
    private Bank bank;

    public Player(int balance) {
        this.bank = new Bank(balance);
    }

    public void updateBalance(int cash) {
        bank.updateBalance(cash);
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    //Spilbrik (Piece) + get/set
    private Piece piece;

    public Player(int location){
        this.piece = new Piece(location);
    }

    public void movePiece(int sum) {
        piece.setLocation(sum);
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}



