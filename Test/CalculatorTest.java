import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void testTwoPlusThreeEqualsFive(){
        // a = 2, b = 3, res = 5

        //3. Arrange / Set-up
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int res = calculator.add(a,b);

        //1. Assert / Verification
        assertEquals(5, res);

        //4. Clean-up, her er ikke noget for nu.


    }

    @org.junit.jupiter.api.Test
    void test5Minus3Equals2() {

        //3. Arrange
        int a = 5;
        int b = 3;
        Calculator calculator = new Calculator();


        //2. Act
        int res = calculator.subtract(a, b);

        //1. Assert
        assertEquals(2, res);
    }
}