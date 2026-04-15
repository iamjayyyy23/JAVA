import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int n = 0;
        int sum=0;

        while(num!=0){
            n = num%10;
            sum = sum*10+n;
            num= num/10;
        }

        System.out.println("The reverse number is "+ sum);

    }
}
