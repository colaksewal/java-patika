import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int i){
        System.out.println(i);
        if(number <= 2){
            return (number == 2) ? true: false;
        }
        if( number % i == 0)
            return false;
        if(i * i > number)
           return true;

        return isPrime(number, i+1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: " );
        int number = input.nextInt();


        if(isPrime(number , 2))
            System.out.println(number + " is prime");
        else
            System.out.println(number + " is NOT prime");

    }
}