package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecCardDeck {

    CardDeck deck = new CardDeck();
    @Test
    public void testBuildDeck(){

        assertNotNull("deck should not be null: ", deck);

    }
    @Test
    public void testShuffleDeck(){

        CardDeck shuffled = new CardDeck();
        shuffled.shuffleDeck();
        assertFalse("shuffled deck should not be equal to start deck: ",shuffled.equals(deck));
    }
    @Test
    public void testDrawCard(){
        assertNotNull("drawn card should not be null: ", deck.drawCard());
    }
    @Test
    public void testGetDeck(){
        assertNotNull("returned deck should not be null: ", deck.getDeck());
    }
}
