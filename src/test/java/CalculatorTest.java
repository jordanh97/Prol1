import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add()
    {
        Calculator c = new Calculator();
        int output = c.square(6);//expecting the output to be 30

        Assert.assertEquals(30, output);
    }

    @Test
    public void test()
    {
        Calculator c = new Calculator();
        int output = c.countA("alphabet");
        Assert.assertEquals(2, output);
    }
    
}
