import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        double edge1, edge2, edge3 ,u, area ;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the triangle edges");
        edge1 = input.nextDouble();
        edge2 = input.nextDouble();
        edge3 = input.nextDouble();

        u = (edge1 +edge2+ edge2) / 2.0;


        area = sqrt(u * (u-edge1) * (u-edge2)* (u-edge3));

        System.out.println(area);
    }
}