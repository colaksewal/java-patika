import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int number, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number ");
        number = input.nextInt();
        for(int i = 1 ; i <=  number/2 ; i++){
            if(number %i == 0) {
                total += i;
            }
        }
        if(number == total)
            System.out.println(number + " is the perfect number");
        else
            System.out.println(number + " is NOT  the perfect number");
    }
}