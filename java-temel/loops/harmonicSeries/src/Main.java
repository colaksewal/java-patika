import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int endNum;
        double harmonic= 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number N :");
        endNum = input.nextInt();

        for(double  i = 1 ; i <= endNum; i++){

            harmonic += ( 1 / i );

        }

        System.out.println(harmonic);



    }
}