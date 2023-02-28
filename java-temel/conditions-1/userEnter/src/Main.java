import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password,answer, newPassword;

        Scanner input = new Scanner(System.in) ;

        System.out.println("Please enter user name");
        userName = input.nextLine();
        System.out.println("Please enter password");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123"))
            System.out.println("You are logged in!");
        else{
            System.out.println("Your Information Is Wrong!");
            System.out.println("Do you want reset password ?(Y/N)");
            answer = input.nextLine();
            switch (answer) {
                case "Y" :
                    System.out.println("Please enter new password");
                    newPassword= input.nextLine();
                    if(!newPassword.equals("java123")) {
                        password = newPassword;
                        System.out.println("new password created : " + password);
                    }else{
                        System.out.println("new password not created, please enter new password");
                    }
                    break;
                case "N"  :
                    System.out.println("Program finished");
                    break;
                default: System.out.println("You entered the wrong character !");
            }
        }





    }
}