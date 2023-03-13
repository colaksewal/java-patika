import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size,num ,max =  0 , min =0 ;

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");

        size =input.nextInt();

        for(int i = 1 ; i <= size ; i++ ){
            System.out.print("Please enter "+ i +" . number " );
            num = input.nextInt();
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("the biggest number:" + max);
        System.out.println("the smallest number:" + min);


    }
}