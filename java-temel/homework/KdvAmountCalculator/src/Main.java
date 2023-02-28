import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double money, kdvPrice;

        Scanner inp = new Scanner(System.in);

        System.out.println("enter money price : ");
        money = inp.nextDouble();

        boolean isBig = money > 1000 ;

        kdvPrice = isBig ? 0.08 : 0.18 ;
        double totalPrice = isBig ? money+money*kdvPrice : money + money* kdvPrice;

        System.out.println("your money price: " + money);
        System.out.println("kdv price : " + kdvPrice);
        System.out.println("total money with kdv : " + totalPrice );


    }
}