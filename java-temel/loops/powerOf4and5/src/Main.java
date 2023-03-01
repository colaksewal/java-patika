import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        num = input.nextInt();
        

        System.out.println("Power of 4 : ");
        for(int i = 1 ; i<= num ; i*=4 ){
            System.out.println(i);
        }
        System.out.println("-------------");
        System.out.println("Power of 5 : ");
        for(int i = 1 ; i<= num ; i*=5 ){
            System.out.println(i);
        }




    }
}