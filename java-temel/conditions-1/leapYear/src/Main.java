import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, leap;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter year:");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 400 == 0){
                System.out.println(year +" is  leap year!");
            }else if(year % 100 == 0){
                System.out.println(year +" is not  leap  year!");
            }else{
                System.out.println(year +" is  leap year!");
            }
        }else{
            System.out.println(year +" is not leap year!");
        }


    }

}