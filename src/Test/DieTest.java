package Test;

import Game.Die;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    Die die = new Die(6);

    @org.junit.jupiter.api.Test
    void roll() {
        die.roll();
        assertEquals(3, die.getFaceValue(),3);
    }

    @org.junit.jupiter.api.Test
    void faceValue() {
        die.setFaceValue(3);
        assertEquals(3, die.getFaceValue());
    }
}