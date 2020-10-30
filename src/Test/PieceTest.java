package Test;

import Game.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    Piece piece = new Piece(3);

    @Test
    void getLocation() {
        assertEquals(3, piece.getLocation());
    }

    @Test
    void setLocation() {
        piece.setLocation(5);
        assertEquals(5, piece.getLocation());
    }

    @Test
    void testToString() {
        assertEquals("located at 3", piece.toString());
    }
}