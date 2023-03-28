package exception3_hw;

public class Lab3 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            printStatement(1);
            System.out.println(list[10]);
            printStatement(3);
        } catch (ArithmeticException e) { // Assume this is Exception1

        } finally {
            printStatement(4);
        }
        printStatement(5);
    }

    // 1. If no exception occurs, will statement4 be executed, and will statement5 be executed?
    // ans. Yes, they will be executed.

    // 2. If the exception is of type Exception1, will statement4 be executed, and will statement5 be executed?
    // ans. No, they won't be executed.

    // 3. If the exception is not of type Exception1, will statement4 be executed, and will statement5 be executed?
    // ans. Yes, they will be executed.

    static void printStatement(int num) {
        System.out.println("statement" + num);
    }
}
