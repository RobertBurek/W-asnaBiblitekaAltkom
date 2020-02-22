import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import pl.altkom.utils.HelloUtil;

import static org.junit.jupiter.api.Assertions.*;

class MyLibrarieTest {


    @Test
    void myUpperCase() {
        try {
            assertEquals(MyLibrarie.myUpperCase("Maciej"), "HELLOMACIEJ");
        }catch (AssertionFailedError ex){
            System.out.println("Nic się nie stało");
            System.out.println(ex.getMessage());
            System.out.println(ex.getExpected());
        }

    }
}