import java.util.Scanner;

public class Main {

    static int functionDec(int number , int temp ){
        if(temp <= 0 ){
            return functionInc(number,temp);
        }else{
            System.out.print(temp + " ");
            temp = temp - 5;
            return functionDec(number,temp);
        }

    }

    static int functionInc(int number, int temp){
        if(number == temp){
            System.out.println(temp + " ");
            return 1 ;
        }else{
            System.out.print(temp + " ");
            temp = temp+5 ;
            return functionInc(number, temp);
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = input.nextInt();

        functionDec(number, number);

    }
}