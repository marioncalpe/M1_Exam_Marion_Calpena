package kata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        final Ball ball = new Ball();
        long start = System.currentTimeMillis();
        ball.roll();
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);
        assertEquals(20, (end - start)/1000);
    }
}
