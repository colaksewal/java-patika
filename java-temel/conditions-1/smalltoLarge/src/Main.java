import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2 , num3 , num4;
        Scanner input = new Scanner(System.in);
        System.out.println("1. number : ");
        num1= input.nextInt();
        System.out.println("2. number : ");
        num2=input.nextInt();
        System.out.println("3. number : ");
        num3 = input.nextInt();
        

        if((num1 < num2) && (num1 < num3)){
            if(num2 < num3){
                System.out.println(num1 + "<"+ num2 +"<" + num3);
            }else{
                System.out.println(num1 + "<"+ num3 +"<" + num2);
            }
        }else if ((num2 < num1) && (num2 < num3)){
            if(num1 < num3){
                System.out.println(num2 + "<"+ num1  +"<" + num3 );
            }else{
                System.out.println(num2 + "<"+ num3 +"<" + num1);
            }
        }else{
            if (num1 < num2) {
                System.out.println(num3 + "<"+ num1 +"<" + num2);
            }else{
                System.out.println(num3 + "<"+ num2 +"<" + num1);
            }
        }




    }
}