/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number2 != 0)
            System.out.println(number1+"/"+number2+" = "+(number1/ number2));
        else
            System.out.println("Divisor cannot be zero ");
    }
}
