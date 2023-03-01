import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        heat = input.nextInt();

        if (heat >25 ) {
            System.out.println("You can swim");
        }else if( heat >= 5 ) {
            if(heat <= 15){
                System.out.println("You can go cinema");
            }
            if(heat >= 10 ){
                System.out.println("Yo can go picnic");
            }
        }
        else{
            System.out.println("you can  ski ");
        }

    }
}