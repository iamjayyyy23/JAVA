package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number : ");
            int n1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int n2 = sc.nextInt();

            System.out.println("The divison result is : " + n1/n2);
        }catch (InputMismatchException e){
            System.out.println("The input must be a number.");
        }catch(ArithmeticException e){
            System.out.println("Nothing is divisible by Zero(0).");
        }finally {
            sc.close();
        }

    }
}
