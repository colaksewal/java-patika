import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year ;
        String zodiac= "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter birth year");
        year = input.nextInt();

        year = year % 12;

        switch (year){
            case 0 :
                zodiac = "monkey";
                break;
            case 1 :
                zodiac = "rooster";
                break;
            case 2 :
                zodiac = "dog";
                break;
            case 3 :
                zodiac = "pig";
                break;
            case 4 :
                zodiac = "mice";
                break;
            case 5 :
                zodiac = "ox";
                break;
            case 6 :
                zodiac = "tiger";
                break;
            case 7 :
                zodiac = "rabbit";
                break;
            case 8 :
                zodiac = "dragon";
                break;
            case 9 :
                zodiac = "snake";
                break;
            case 10 :
                zodiac = "horse";
                break;
            case 11 :
                zodiac = "sheep";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + year);
        }
        System.out.println("Your Chinese Zodiac Sign : " + zodiac);
    }
}