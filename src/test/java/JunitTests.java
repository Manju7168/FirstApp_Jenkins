import org.junit.Assert;
import org.junit.Test;

public class JunitTests {
    DevMethods devMethods = new DevMethods();

    @Test
    public void testAddition() {
        System.out.println("Testing Addition method");
        int res = devMethods.addition(3,4);
        Assert.assertEquals(7,res);
    }

    @Test
    public void testSubtraction() {
        System.out.println("Testing Subtraction method");
        int res = devMethods.subtraction(8,4);
        Assert.assertEquals(4,res);
    }

    @Test
    public void testMultiplication() {
        System.out.println("Testing Multiplication method");
        int res = devMethods.multiplication(3,4);
        Assert.assertEquals(12,res);
    }

    @Test
    public void testDivision() {
        System.out.println("Testing Division method");
        int res = devMethods.division(16,4);
        Assert.assertEquals(4,res);
    }
    
}
