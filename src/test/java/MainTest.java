import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void simpleTest() {
        assertEquals(3, 3);
    }

    @Test
    public void simpleTestGetTwo() {
        assertEquals(2, MyUtils.getTwo());
    }

}
