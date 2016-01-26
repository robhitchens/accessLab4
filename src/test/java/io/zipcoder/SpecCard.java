package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecCard {

    @Test
    public void testCardInit(){
        Card card = new Card("Spades", "Ace");
        assertNotNull("card should not be null: ", card);
        assertNotNull("card suit should not be null: ", card.getSuit());
        assertNotNull("card rank should not be null: ", card.getRank());
    }
}
