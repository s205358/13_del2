package Test;

import Game.Board;
import Game.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Square squareOne = new Square("Square 1", 100);
    Square squareTwo = new Square("Square 1", 100);
    Square squareThree = new Square("Square 1", 100);
    Board board = new Board(new Square[] {
            squareOne,
            squareTwo,
            squareThree,
    });

    @Test
    void getSquare() {
        assertEquals(squareOne, board.getSquare(0));
        assertEquals(squareTwo, board.getSquare(1));
        assertEquals(squareThree, board.getSquare(2));
    }

    @Test
    void getLength() {
        assertEquals(3, board.getLength());
    }

    @Test
    void testToString() {
        assertEquals("3 squares", board.toString());
    }
}