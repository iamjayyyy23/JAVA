package Tuition;
import java.util.Scanner;

class reg{
    public void student(String n, String c, String... s){

        System.out.println(" ");
        System.out.println("Student name is : "+n);
        System.out.println("Student course is : "+c);
        System.out.print("Student's subjects are : ");
        for(String i : s){
            System.out.print(i+", ");
        }
    }
}

public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter student name : ");
        String n = sc.nextLine();

        System.out.print("Enter course name : ");
        String c = sc.next();

        reg obj = new reg();
        obj.student(n, c, "Numerical Analysis using C","OS","Networking","JAVA");
    }
}
