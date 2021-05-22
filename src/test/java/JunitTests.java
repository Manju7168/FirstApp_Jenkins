import org.junit.Assert;
import org.junit.Test;

public class JunitTests {
    DevMethods devMethods = new DevMethods();
    @Test
    public void testMethod() {
        System.out.println("test it");
    }


    public void tearDown() throws Exception {
    }

    @Test
    public void testAddition() {
        int res = devMethods.addition(3,4);
        Assert.assertEquals(9,res);
    }

    @Test
    public void testSubtraction() {
        int res = devMethods.subtraction(8,4);
        Assert.assertEquals(4,res);
    }

    @Test
    public void testMultiplication() {
        int res = devMethods.multiplication(3,4);
        Assert.assertEquals(12,res);
    }

    @Test
    public void testDivision() {
        int res = devMethods.division(16,4);
        Assert.assertEquals(4,res);
    }
}
