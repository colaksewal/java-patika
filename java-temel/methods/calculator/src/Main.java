import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static int numOfCal;

    static void add(   ){
        int  result = 0, number,numOfCal;
        System.out.print("How many numbers will you enter :");
        numOfCal = input.nextInt();
        while(numOfCal  > 0){
            System.out.print("Please enter number: " );
            number = input.nextInt();
            result += number;
            numOfCal-- ;
        }
        System.out.println("Result is : " + result);
    }

    static void sub( ){
        int result= 0 , number;
        int numOfCal;
        System.out.print("How many numbers will you enter :");
        numOfCal = input.nextInt();
        for(int i = 1; i <= numOfCal ; i++){
            System.out.print("Please enter number: " );
            number = input.nextInt();
            if(i == 1){
                result+= number;
                continue;
            }
            result -= number ;
        }
        System.out.println("Result is : " + result);
    }
    static void mul( ){
        int  result = 1, number;
        int numOfCal;
        System.out.print("How many numbers will you enter :");
        numOfCal = input.nextInt();
        while(numOfCal  > 0){
            System.out.print("Please enter number: " );
            number = input.nextInt();
            result *= number;
            numOfCal-- ;
        }
        System.out.println("Result is : " + result);
    }

    static void div(){
        double result= 1.0 , number;
        int numOfCal;
        System.out.print("How many numbers will you enter :");
        numOfCal = input.nextInt();
        for(int i = 1; i <= numOfCal ; i++){
            System.out.print("Please enter number: " );
            number = input.nextDouble();
            if(i != 1 && number == 0){
                System.out.println("You cannot enter the divisor 0");
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number ;
        }
        System.out.println("Result is : " + result);
    }
    static void pow( ){
        System.out.println("Enter the base value :");
        int base = input.nextInt();
        System.out.println("Enter exponent :");
        int exponent = input.nextInt();
        int result = 1;

        System.out.println("Result is : " + Math.pow(base,exponent));

    }

    static void mod(){
        int a ,b ;
        System.out.print("Please enter numbers");
        a = input.nextInt();
        b= input.nextInt();
        System.out.println("Result is: " + a % b );
    }

    static void rec( ){
        int a, b;
        System.out.print("Please enter numbers");
        a = input.nextInt();
        b= input.nextInt();
       System.out.println("Area " +  a *b );
       System.out.println("Perimeter " + 2 * (a+b));
    }

    public static void main(String[] args) {
        int select , numOfCal;


        String menu = "1- Addition operation\n"
        + "2- Extraction\n"
        + "3- Multiplication operation \n"
        + "4- Partition \n"
        + "5- Exponential Calculation\n"
        + "6- Get Mod\n"
        + "7- Rectangular Area and Perimeter Calculation\n"
        + "8- Sign Out" ;
        

        while (true){

            System.out.println(menu);
            System.out.print("Please enter your select: ");
            select = input.nextInt();

            if(select == 8 ){
                System.out.println("Good by!");
                break;
            }
            if((select <= 0) || (select >= 8)){
                System.out.println("Please enter a number from 1-8 ");
                continue;
            }


            switch (select){

                case 1 :
                    add();
                    break;
                case 2 :
                    sub();
                    break;
                case 3 :
                    mul();
                    break;
                case 4 :
                    div();
                    break;
                case 5 :
                    pow();
                    break;
                case 6 :
                    mod();

                    break;
                case 7 :
                    rec();
                    break;

            }
            System.out.println("-----------------");
        }

    }
}