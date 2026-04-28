//The Bill Splitter 🍕
//Write a Java program that:
//
//Takes a restaurant bill amount
//Takes number of friends splitting it
//Takes tip percentage
//Calculates and prints each person's share including tip

package Practice.FunProblems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the bill amount : ");
            double bill_a = sc.nextDouble();
            System.out.print("Enter number of friends : ");
            int n_fd = sc.nextInt();
            System.out.print("Enter the tip percentage : ");
            int tip_p = sc.nextInt();

            double tip_a = (bill_a*tip_p)/100;
            double total = (bill_a + tip_a);

            if(n_fd == 0){
                System.out.println("Number of friends can't be zero.");
            } else {
                System.out.println("Tip amount : "+tip_a);
                System.out.println("Total bill : "+(bill_a + tip_a));
                System.out.println("Each person pays : " + total/n_fd);
            }
        } catch(InputMismatchException e){
            System.out.println("All must be a number.");
        }
    }
}
