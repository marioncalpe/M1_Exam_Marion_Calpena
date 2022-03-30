package kata;

import com.sun.tools.javac.util.ArrayUtils;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertTrue;


public class JavaRandomizerIT {


    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        final JavaRandomizer rand = new JavaRandomizer();
        int result = rand.getRouletteResult();
        int high = 37;
        int low = 0;
        System.out.println(rand);
        assertTrue(high >= result, "Error, random is too high");
        assertTrue(low  <= result,"Error, random is too low");

    }

    @Test
    public void allNumbersOccur() throws Exception {
//        final JavaRandomizer rand = new JavaRandomizer();
//        int[] tableau = {};
//        while(tableau.length<38){
//            int result = rand.getRouletteResult();
//            if (!ArrayUtils.contains(tableau, result));
//        }
    }


}
