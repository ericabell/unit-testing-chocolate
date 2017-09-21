import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void makeChocolate() throws Exception {
        // we have inventory and goal is div by 5
        assertTrue(Chocolate.makeChocolate(10,10,40) == 0);
        // we have inventory and goal is not div by 5
        assertTrue(Chocolate.makeChocolate(10,10,42) == 2);
        // we have the inventory all in small bars
        assertTrue(Chocolate.makeChocolate(10,0,10) == 10);
        // we don't have the inventory of small bars
        assertTrue(Chocolate.makeChocolate(5,0,10) == -1);


    }

}