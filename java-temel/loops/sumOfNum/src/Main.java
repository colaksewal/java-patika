import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num , total = 0 ;
        System.out.print("Please enter number ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num % 2 == 0 ){
            if(num % 4 == 0) {
                total += num;
            }
            System.out.print("Please enter number ");
            num = input.nextInt();

        }
        System.out.println("Total is: " +total);
    }
}