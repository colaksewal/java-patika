import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter birth month");
        month = input.nextInt();
        System.out.println("Please enter birth day");
        day = input.nextInt();

        if (month <= 12) {
            if (month == 1) {
                if ((day < 22) && (day >= 1))
                    horoscope = "Capricorn";
                else if (day <= 31){
                    horoscope = "Aquarius";}
                else{
                    isError = true;

                }
            }
            if (month == 2) {


                if ((day < 20) && (day >= 1))
                    horoscope = "Aquarius";
                else if (day <= 29)
                    horoscope = "Pisces";
                else
                    isError = true;
            }
            if (month == 3) {
                if ((day < 21) && (day >= 1))
                    horoscope = "Pisces";
                else if (day <= 31)
                    horoscope = "Aries";
                else
                    isError = true;
            }
            if (month == 4) {
                if ((day < 21) && (day >= 1))
                    horoscope = "Aries";
                else if (day <= 30)
                    horoscope = "Taurus";
                else
                    isError = true;
            }
            if (month == 5) {


                if ((day < 22) && (day >= 1))
                    horoscope = "Taurus";
                else if (day <= 31)
                    horoscope = "Gemini";
                else
                    isError = true;
            }
            if (month == 6) {
                if ((day < 22) && (day >= 1))
                    horoscope = "Gemini";
                else if (day <= 30)
                    horoscope = "Cancer";
                else
                    isError = true;
            }
            if (month == 7) {
                if ((day < 23) && (day >= 1))
                    horoscope = "Cancer";
                else if (day <= 31)
                    horoscope = "Leo";
                else
                    isError = true;
            }
            if (month == 8) {
                if ((day < 23) && (day >= 1))
                    horoscope = "Leo";
                else if (day <= 31)
                    horoscope = "Virgo";
                else
                    isError = true;
            }
            if (month == 9) {
                if ((day < 23) && (day > 1))
                    horoscope = "Virgo";
                else if (day <= 30)
                    horoscope = "Libra";
                else
                    isError = true;
            }
            if (month == 10) {
                if ((day < 23) && (day >= 1))
                    horoscope = "Libra";
                else if (day <= 30)
                    horoscope = "Scorpio";
                else
                    isError = true;
            }
            if (month == 11) {
                if ((day < 22) && (day >= 1))
                    horoscope = "Scorpio";
                else if (day <= 30)
                    horoscope = "Sagittarius";
            else
                isError = true;
            }

            if (month == 12) {
                if ((day < 22) && (day >= 1))
                    horoscope = "Saggittarius";
                else if (day <= 31)
                    horoscope = "Capricorn";
                else
                    isError = true;
               }

            if (isError)
                    System.out.println("the day you entered is wrong");
            else
                    System.out.println("your horoscope is " + horoscope);
            }

            else {
                System.out.println("the month you entered is wrong");
            }


        }
    }
