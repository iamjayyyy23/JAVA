package DSA;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];
            } else if (arr[i] > b && arr[i] != a) {
                b = arr[i];
            }
        }

        if(b == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else {
            System.out.println("The 2nd largest number is : " + b);
        }
    }
}