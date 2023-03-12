import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int right =3 ;
        int balance =1500;
        int select;

        Scanner input  = new Scanner(System.in);

        //enter the system with correct name and password
        while(right > 0){
            System.out.println("Please enter your name:");
            userName = input.nextLine();
            System.out.println("Please enter your password");
            password = input.nextLine();
            if( userName.equals("patika") && password.equals("123")){
                System.out.println("Hello, welcome X Bank . Entered  system");
                break;
            }else{
                right--;
                System.out.println("You enter wrong name and password, please enter again!! Remain right:"+ right);
                if(right== 0)
                    System.out.println("Your account blocked");
            }
        }

        do{
            System.out.println("Please select the bank transaction you want to make");
            System.out.println("1- Deposit process \n" +
                    "2- Withdrawal process \n" +
                    "3- Balance inquiry process \n" +
                    "4- Logout process");
            select = input.nextInt();

            switch(select){
                case 1:
                    System.out.println("Amount money");
                    int price = input.nextInt();
                    balance += price;
                    break;
                case 2 :
                    System.out.println("Enter amount money");
                    int prices = input.nextInt();
                    if(prices > balance){
                        System.out.println("You don't withdrawal, Not ENOUGH money!!");
                    }else{
                        balance -= prices;
                    }
                    break;
                case 3:
                    System.out.println("Balance: " +balance);
                    break;
            }

        }while(select!=4);


    }
}