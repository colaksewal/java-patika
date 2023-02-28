import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight , bmi;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in meters:");
        height = input.nextDouble();
        System.out.println("Please enter your weight in kilograms:");
        weight = input.nextDouble();

        bmi = (weight / (height * height));
        System.out.println("your body mass index is : "+ bmi);

    }
}