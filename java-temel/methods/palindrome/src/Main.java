import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number ){
        int temp = number , lastNumber , reverseNumber = 0; // temporary variable

        while (temp != 0){

            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10 ) + lastNumber ;
            temp /= 10 ;
        }

        if(number == reverseNumber)
            return true;
        else
            return false;


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = input.nextInt();

        isPalindrome(7778);
        if(isPalindrome(number) == true)
            System.out.println("The number is Palindrome :  " + number);
        else
            System.out.println("The number is NOT Palindrome : " + number);



    }
}