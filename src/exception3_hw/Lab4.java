package exception3_hw;

public class Lab4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            printStatement(1);
            System.out.println(list[10]);
            printStatement(3);
        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }
        finally {
            printStatement(4);
        }
        printStatement(5);
    }

    // 1. If no exception occurs, will statement4 be executed, and will statement5 be executed?
    // ans. Yes, they will be executed.

    // 2. If the exception is of type Exception1, will statement4 be executed, and will statement5 be executed?
    // ans. Yes, they will be executed.

    // 3. If the exception is of type Exception2, will statement4 be executed, and will statement5 be executed?
    // ans. statement4 will be executed and statement5 will not be executed because the exception is re-thrown and not caught again.

    // 4. If the exception is not Exception1 nor Exception2, will statement4 be executed, and will statement5 be executed?
    // ans. statement4 will be executed and statement5 will not be executed because the exception is not caught.

    static void printStatement(int num) {
        System.out.println("statement" + num);
    }
}
