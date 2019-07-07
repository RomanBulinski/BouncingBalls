import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasMain {

    @Test
    public void test1() {
        assertEquals(3, Main.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, Main.bouncingBall(30.0, 0.66, 1.5));
    }

}
