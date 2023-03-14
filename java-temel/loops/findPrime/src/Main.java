public class Main {
    public static void main(String[] args) {

        int number = 1;
        while(number <= 100){
        // Holds the count of values
        int count = 0;


        // Do a for loop
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.print(number + " ");
        }
        number++;
      }
    }
}
