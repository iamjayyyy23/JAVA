package DSA;

import java.util.Scanner;

public class sortingZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter first element : ");
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.print("The sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
