import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  type , age   ;
        double distance , total= 0.0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance in km : ");
        distance = input.nextInt();
        System.out.println("Please enter your age ");
        age = input.nextInt();
        System.out.println("Please enter trip type  (1 => One Way , 2 => Round Trip )");
        type = input.nextInt();

        if(distance > 0) {
            switch (type) {
                case 1:
                    if (age < 12) {
                        total = distance * 0.10;
                        total -= total * 0.5;
                    } else if ((age > 12) && (age < 24)) {
                        total = distance * 0.10;
                        total = total - total * 0.10;
                    } else if (age > 65) {
                        total = distance * 0.30;
                        total -= total * 0.5;
                    } else {
                        total = distance * 0.10;
                    }
                    break;
                case 2:
                    if (age < 12) {
                        total = distance * 0.10;
                        total -= total * 0.5;
                    } else if ((age > 12) && (age < 24)) {
                        total = distance * 0.10;
                        total = total - total * 0.10;
                    } else if (age > 65) {
                        total = distance * 0.30;
                        total -= total * 0.5;
                    } else {
                        total = distance * 0.10;
                    }
                    total -= total*0.20;
                    total *= 2;

                    break;
                default:
                    System.out.println("input type entered incorrectly!");
            }
            System.out.println("total ticket price : " + total);
        }
        else{
            System.out.println("You Entered Wrong Data!");
        }



    }
}