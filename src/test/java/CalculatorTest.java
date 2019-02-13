import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add()
    {
        Calculator c = new Calculator();
        int output = c.square(5);//expecting the output to be 25

        Assert.assertEquals(25, output);
    }

    @Test
    public void test()
    {
        Calculator c = new Calculator();
        int output = c.countA("alphabet");
        Assert.assertEquals(2, output);
    }
    
}
