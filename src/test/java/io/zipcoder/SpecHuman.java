package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecHuman {
    Human hu = new Human(1);
    @Test
    public void testGetId(){
        assertTrue("number returned should be non-negative: ", hu.getId() >= 0);
    }
    @Test
    public void testScore(){
        hu.calcScore();
        assertTrue("number returned should be non-negative: ", hu.getScore() >=0);
    }
    @Test
    public void testAceStatus(){
        assertFalse("aceFound should be false at start: ", hu.getAceStatus());
        hu.changeAceFound();
        assertTrue("acefound should be true after changeAceFound is called: ", hu.getAceStatus());
    }
}
