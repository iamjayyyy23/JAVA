import java.util.Scanner;

public class sumOfOneToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=n;i++){
            sum = sum + i;
        }

        System.out.println("The sum of 1 to "+n+" is " + sum);
    }
}
