import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1 , num2 , result = 0;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = input.nextDouble();
        System.out.println("Enter second number");
        num2= input.nextDouble();

        System.out.println("1-Add\n2-Subtraction\n3-Multiplication\n4-Divide");

        select = input.nextInt();
        switch(select){
            case 1:
                result = num1 + num2;
                break;
            case 2 :
                result= num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("the number not divide zero!");
                break;
            default: System.out.println("wrong choice made ");

        }
        System.out.println("Result is:" + result);



    }
}