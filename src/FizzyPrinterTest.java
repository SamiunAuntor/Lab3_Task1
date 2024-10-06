import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzyPrinterTest {

    @Test
    public void testFizz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(3, false);
        assertEquals("Fizz", result);
    }

    @Test
    public void testBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(5, false);
        assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(15, false);
        assertEquals("Fizzbuzz", result);
    }

    @Test
    public void testFizzBuzzBang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(105, true);
        assertEquals("FIZZBUZZBANG", result);  // Testing uppercase option
    }

    @Test
    public void testBoom() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(2, false);
        assertEquals("Boom", result);
    }
}
