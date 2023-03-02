import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n , r , facN=1, facR=1 , facNR=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of cluser elements");
        n  = input.nextInt();
        System.out.println("Please enter the number of clusters with how many elements you want ");
        r = input.nextInt();

        for(int i= 1; i <= n ; i++){
            facN *= i  ;
        }

        for (int i = 1 ; i <= r ; i++){
            facR *= i;
        }

        for(int i = 1; i <= n-r ; i++){
            facNR *= i ;
        }

        int com = facN / (facR * (facNR));

        System.out.println(n + " combination "+ r+ " is: " + com);



    }
}