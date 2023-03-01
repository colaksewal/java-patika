import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num , total = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        num = input.nextInt();

        for(int i = 0 ; i <= num ; i++){
            if((i % 3 == 0)&& (i % 4 == 0) && (i != 0)){
                total +=i;
                count++;
            }
        }

        System.out.println( "Avarage is: " + total/count);

    }
}