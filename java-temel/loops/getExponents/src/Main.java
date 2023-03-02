import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,k;
        int result = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number :");
        n = input.nextInt();
        System.out.println("Please enter exponent number");
        k = input.nextInt();

        for(int i = 1 ; i <= k ; i++){
            result *= n;
        }

        System.out.println("Result is: "+ result);

    }
}