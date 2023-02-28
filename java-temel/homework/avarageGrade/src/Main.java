import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mathNote , physicNote , turNote ,chemistNote ,historyNote ,musicNote;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter math note");
        mathNote = input.nextInt();

        System.out.println("please enter physic note");
        physicNote = input.nextInt();

        System.out.println("please enter turkish note");
        turNote = input.nextInt();

        System.out.println("please enter chemist note");
        chemistNote = input.nextInt();

        System.out.println("please enter history note");
        historyNote = input.nextInt();

        System.out.println("please enter music note");
        musicNote = input.nextInt();

        double avarage = (mathNote + physicNote + turNote + chemistNote + historyNote + musicNote) / 6.0;

        System.out.println("avarage is: "+ avarage);

        boolean limits = avarage > 60 ;

        String result = limits ? "Pass class" : "Fail class";

        System.out.println(result);

    }
}