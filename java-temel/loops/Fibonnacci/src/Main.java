import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number ,  leftSide= 1 , result=0 , rightSide= 0  ;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number of elements");

        number = input.nextInt();
        int i = 1 ;
        while(i < number){
            result = rightSide + leftSide;

            System.out.println(rightSide + " + " + leftSide + " = " + result );
            rightSide = leftSide;
            leftSide = result ;
            i++;
        }





    }
}