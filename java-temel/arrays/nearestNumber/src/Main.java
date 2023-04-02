import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int[] array = {1, 3, 5, 7, 9 , 4 , 10 ,15 };
            int smallest = array[0];
            int largest = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < number && array[i] > smallest) {
                    smallest = array[i];
                }
                if (array[i] > number && array[i] < largest) {
                    largest = array[i];
                }
            }
            System.out.println("The closest number smaller than the entered number: " + smallest);
            System.out.println("The closest number larger than the entered number: " + largest);
        }

}

