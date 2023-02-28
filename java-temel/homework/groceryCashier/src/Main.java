import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pear = 2.14 ,
        apple = 3.67 ,
        tomatoes =  1.11 ,
        banana = 0.95 ,
        eggplant = 5.00 ,totalPRice=0.0, kg ;


        Scanner input = new Scanner (System.in);

        System.out.println("how many kilograms of pears?");
        kg = input.nextDouble();
        totalPRice+=kg * pear;
        System.out.println("how many kilograms of apples?");
        kg = input.nextDouble();
        totalPRice+=kg * apple;
        System.out.println("how many kilograms of tomatoes?");
        kg = input.nextDouble();
        totalPRice += kg * tomatoes;
        System.out.println("how many kilograms of banana?");
        kg = input.nextDouble();
        totalPRice+=kg * banana;
        System.out.println("how many kilograms of pears?");
        kg = input.nextDouble();
        totalPRice+=kg * eggplant;

        System.out.println("total price: " + totalPRice);



    }
}