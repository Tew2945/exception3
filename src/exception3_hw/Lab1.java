package exception3_hw;

public class Lab1 {
    public static void main(String[] args) {
        testArthmeticException();
        testArrayIndexOutOfBoundsException();
        testStringIndexOutOfBoundsException();
        testClassCastException();
        testNullPointerException();
        testIllegalArgumentException();
    }

    static void testArthmeticException() {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testArrayIndexOutOfBoundsException() {
        try {
            int[] list = new int[5];
            System.out.println(list[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testStringIndexOutOfBoundsException() {
        try {
        String s = "abc";
            System.out.println(s.charAt(3));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testClassCastException() {
        try {
            Object o = new Object();
            String d = (String) o;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testNullPointerException() {
        try {
            Object o = null;
            System.out.println(o.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testIllegalArgumentException() throws IllegalArgumentException {
        double divisor = 0;
        if(divisor == 0) {
            System.out.println("Floating point Overflow");
        } else {
            System.out.println(1.0/divisor);
        }
    }
}

