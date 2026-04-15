import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class evenOddBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num%2==0){
            System.out.println("The number "+num+" is Even number.");
        }
        else{
            System.out.println("The number "+num+" is Odd number.");
        }
    }
}
