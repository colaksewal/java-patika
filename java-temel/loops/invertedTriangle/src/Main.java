import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  digit number ");

        number = input.nextInt();

        for (int i = number; i >= 1; i--) {

            for (int j = i; j < number ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i - 1) ; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}



