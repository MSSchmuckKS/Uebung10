package test;

import aufgabe01.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void compareTo() {
        Card[] cardSet = new Card[] {
                new Card("Wizard of Oz", Card.BLUE, 1939),
                new Card("Dandelion", Card.GREEN, 1993),
                new Card("Harry Potter", Card.RED, 1997),
                new Card("Chewbacca", Card.GREEN, 1977),
                new Card("Frodo", Card.GREEN, 2001),
                new Card("Scarecrow", Card.BLACK, 1939),
                new Card("Dandelion", Card.GREEN, 1993),
                new Card("Ron Weasley", Card.RED, 1997),
                new Card("Luke Skywalker", Card.BLUE, 1977),
                new Card("Gandalf", Card.WHITE, 2001),
                new Card("Scarecrow", Card.BLACK, 1939),
                new Card("Geralt of Rivia", Card.WHITE, 1993),
                new Card("Ron Weasley", Card.RED, 1997),
                new Card("Luke Skywalker", Card.BLUE, 1977),
                new Card("Gandalf", Card.WHITE, 2001)
        };

        Card[] sortedSet = new Card[] {
                new Card("Wizard of Oz", Card.BLUE, 1939),
                new Card("Scarecrow", Card.BLACK, 1939),
                new Card("Scarecrow", Card.BLACK, 1939),
                new Card("Luke Skywalker", Card.BLUE, 1977),
                new Card("Luke Skywalker", Card.BLUE, 1977),
                new Card("Chewbacca", Card.GREEN, 1977),
                new Card("Geralt of Rivia", Card.WHITE, 1993),
                new Card("Dandelion", Card.GREEN, 1993),
                new Card("Dandelion", Card.GREEN, 1993),
                new Card("Harry Potter", Card.RED, 1997),
                new Card("Ron Weasley", Card.RED, 1997),
                new Card("Ron Weasley", Card.RED, 1997),
                new Card("Gandalf", Card.WHITE, 2001),
                new Card("Gandalf", Card.WHITE, 2001),
                new Card("Frodo", Card.GREEN, 2001)
        };

        Arrays.sort(cardSet);

        // Testing whether all indices of both arrays have matching card names
        for (int i = 0; i < sortedSet.length; i++) {
            Assertions.assertEquals(sortedSet[i].getName(), cardSet[i].getName());
        }

    }
}