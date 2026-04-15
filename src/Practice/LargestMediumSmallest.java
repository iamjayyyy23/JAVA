package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LargestMediumSmallest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number : ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter second number : ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter third number : ");
        int c = Integer.parseInt(br.readLine());

        if(a>b && a>c){
            System.out.println("The number "+a+" is the largest");
            if(b>c){
                System.out.println("The number "+b+" is the medium");
                System.out.println("The number "+c+" is the smallest");
            }
            else{
                System.out.println("The number "+c+" is the largest");
                System.out.println("The number "+b+" is the smallest");
            }
        }
        else if(b>a && b>c){
            System.out.println("The number "+b+" is the largest");
            if(a>c){
                System.out.println("The number "+a+" is the medium");
                System.out.println("The number "+c+" is the smallest");
            }
            else{
                System.out.println("The number "+c+" is the largest");
                System.out.println("The number "+a+" is the smallest");
            }
        }
        else{
            System.out.println("The number "+c+" is the largest");
            if(c>a){
                System.out.println("The number "+c+" is the medium");
                System.out.println("The number "+a+" is the smallest");
            }
            else{
                System.out.println("The number "+a+" is the largest");
                System.out.println("The number "+c+" is the smallest");
            }
        }

    }
}
