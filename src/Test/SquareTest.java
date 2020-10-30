package Test;

import Game.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square("The Square", 100);

    @Test
    void getName() {
        assertEquals("The Square", square.getName());
    }

    @Test
    void setName() {
        square.setName("The Renamed Square");
        assertEquals("The Renamed Square", square.getName());
    }

    @Test
    void getValue() {
        assertEquals(100, square.getValue());
    }

    @Test
    void setValue() {
        square.setValue(150);
        assertEquals(150, square.getValue());
    }

    @Test
    void testToString() {
        assertEquals("The Square, 100", square.toString());
    }
}