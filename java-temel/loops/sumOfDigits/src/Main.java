import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  num , total = 0 , digit ;

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter number: ");
        num = input.nextInt();

        while(num > 0){

            digit = num % 10 ;
            total+= digit;
            num /= 10;

        }

        System.out.println("Sum of digits:" + total);

    }
}