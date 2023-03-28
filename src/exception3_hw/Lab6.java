/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3_hw;

/**
 *
 * @author user
 */
public class Lab6 {

    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println("list[10] is " + list[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println(e.getMessage());
// System.out.println(e.toString());
// e.getStackTrace();

            StackTraceElement[] s = e.getStackTrace();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].getClassName());
                System.out.println(s[i].getMethodName());
                System.out.println(s[i].getFileName());
                System.out.println(s[i].getLineNumber());
            }
        }
    }

}
