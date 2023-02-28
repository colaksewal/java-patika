import java.util.*;

public class Main {
    public static void main(String[] args) {

        double math, physic, tur, chemist, music ,avarage, total = 0.0;
        int lessonNum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter math note");
        math = input.nextDouble();
        System.out.println("Please enter physic note");
        physic = input.nextDouble();
        System.out.println("Please enter tur note");
        tur = input.nextDouble();
        System.out.println("Please enter chemist note");
        chemist = input.nextDouble();
        System.out.println("Please enter music note");
        music = input.nextDouble();

        if(math >= 0 && math <= 100 ) {
            total += math;
            lessonNum++;
        }
        if(physic >= 0 && physic <= 100 ) {
            total += physic;
            lessonNum++;
        }
        if(tur >= 0 && tur <= 100 ) {
            total += tur;
            lessonNum++;
        }
        if(chemist >= 0 && chemist <= 100 ) {
            total += chemist;
            lessonNum++;
        }
        if(music >= 0 && music <= 100 ) {
            total += music ;
            lessonNum++;
        }

        avarage =  total/ lessonNum;
        if(avarage <= 55 )
            System.out.println("Unfortunately ! You fail class");
        else if (avarage >= 100)
            System.out.println("Cong! You passed class");
        else
            System.out.println("You entered wrong note");
        System.out.println("your avarage is: " + avarage);

    }
}