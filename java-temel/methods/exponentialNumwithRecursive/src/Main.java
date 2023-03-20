import java.util.Scanner;

public class Main {

    static int exp( int base , int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * exp(base, exponent-1 );

    }



    public static void main(String[] args) {
        int base , exponent ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter base : ");
        base = input.nextInt();
        System.out.print("Please enter exponent : ");
        exponent = input.nextInt();

         int result =  exp(base, exponent);
         System.out.println(result);


    }
}