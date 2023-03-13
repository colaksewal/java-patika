import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, gsb =1, lsb=1, num3, num4 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2) {
            int i = num1 ;
            while(i >= 1){
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    gsb = i ;
                    break;
                }
                i--;
            }
        } else {
            int i = num2 ;
            while(i >= 1){
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    gsb = i ;
                    break;
                }
                i--;
            }
        }
        System.out.println("greatest common divisor: " + gsb);

        System.out.println("Please enter two words to find the least common divisor");

        num3 = input.nextInt();
        num4 = input.nextInt();

        if(num3 >= num4 ){
            int i = num4;
            while( i <= num3 * num4 ){
                if((i % num3 == 0 ) && (i % num4 == 0)){
                    lsb= i;
                    break;
                }
                i++;
            }
        }else{
            int i = num3;
            while( i <= num3 * num4 ){
                if((i % num3 == 0 ) && (i % num4 == 0)){
                    lsb= i;
                    break;
                }
                i++;
            }

        }


        System.out.println("least common divisor is : " + lsb );



    }
}