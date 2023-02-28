import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double area, perimeter, radius, angle;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter circle radius");
        radius = input.nextDouble();
        System.out.println("please enter angle ");
        angle = input.nextDouble();
        area = (radius * radius * 3.14 * angle) / 360.0 ;

        System.out.println("the circle radius : " +radius );
        System.out.println("the circle area: " + area  );


    }
}