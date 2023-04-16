import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        // Create random number
        /*int number = (int) (Math.random() * 100);
        System.out.println(number);
        */

        int [] wrongCase = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        System.out.println(number);
        while(right < 5){
            System.out.println("Enter guess ");
            selected = input.nextInt();

            if(selected < 0 || selected>99 ){
                System.out.println("You entered the wrong range, please enter a number between 0 and 100!!");
                if(isWrong){
                    System.out.println("You have made more than one wrong entry, remaining right:" + (5- (++right)));
                }else{
                    isWrong = true;
                    System.out.println("Your right will be reduced at the next wrong entry!!");
                }
                continue;//bunu bitirip devam et while
            }

            if(number == selected){
                System.out.println("Congratulations, you got it right!!");
                isWin= true;
                break;//bu komut sayesinde artık döngüden çıkacak
            }
            else{
                wrongCase[right++] = selected;

                System.out.println("Sorry, you entered an incorrect number!");
                if(selected> number){
                    System.out.println(selected + " The number you entered is greater than the hidden number!");
                }else{
                    System.out.println(selected + " The number you entered is less than the hidden number!");
                }
            System.out.println("Remaining right: " +(5-right));
            }

        }


        System.out.println("Hidden number is: "+  number);

        if(!isWin && !isWrong){
            System.out.println("You lose");
            System.out.println("Wrong numbers you entered: " );
            for(int i = 0 ; i < right ; i++) {
                if( i == 0){
                    System.out.print(" [");
                }
                System.out.print(wrongCase[i] + " ");
                if( i == right-1){
                    System.out.print("]");
                }
            }
            //System.out.println(Arrays.toString(wrongCase));
        }




    }
}