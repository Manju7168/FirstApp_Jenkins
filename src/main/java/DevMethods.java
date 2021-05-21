public class DevMethods {

    public int addition(int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public int division(int a, int b) {
        if(b==0)
            System.err.println("Number cannot be divided by 0");
        return a/b;
    }

}
