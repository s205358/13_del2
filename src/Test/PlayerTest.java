package Test;

import Game.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player = new Player("John Doe", 100,0);

    @Test
    void movePiece() {
        player.movePiece(2);
        assertEquals(2, player.getPiece().getLocation());
    }

    @Test
    void updateBalance() {
        player.updateBalance(50);
        assertEquals(150, player.getBank().getBalance());
        player.updateBalance(-50);
        assertEquals(100, player.getBank().getBalance());
        player.updateBalance(0);
        assertEquals(100, player.getBank().getBalance());
    }

    @Test
    void getName() {
        assertEquals("John Doe", player.getName());
    }

    @Test
    void setName() {
        player.setName("John Smith");
        assertEquals("John Smith", player.getName());
    }

    @Test
    void testToString() {
        assertEquals("John Doe $100", player.toString());
    }
}