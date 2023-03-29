/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class Lab6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toSrring());
            StackTraceElement[] st = e.getStackTrace();
            for (int i = 0; i < TraceElement.length; i++) {
                System.out.println(st[0].getClassName());
                System.out.println(st[0].getMethodName());
                System.out.println(st[0].getFileName());
                System.out.println(st[0].getLineNumber());
            }
        }
    }
}
