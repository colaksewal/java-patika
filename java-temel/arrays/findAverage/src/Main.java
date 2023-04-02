import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter arrays dimension");

        int lng = input.nextInt();

        double[] array = new double[lng];
        System.out.println("Please enter array elements");

        for (int i = 0; i < lng; i++) {
            array[i] = input.nextDouble();// take element
        }

        double sum = 0;
        for (int i = 0; i < lng; i++) {
            sum += 1 / array[i];
        }

        double harmonic = lng / sum;

        System.out.println("Harmonic avarage: " + harmonic);


    }
}