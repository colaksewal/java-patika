import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter row and col size: ");
        int col = input.nextInt();
        int row = input.nextInt();

        int [][] matrix = new int[row][col];

        System.out.println("Please enter elements: ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;  j++){
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int [] satir  : matrix){
            for(int eleman : satir){
                System.out.print(eleman + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze:");
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(matrix[j][i]+ "  ");
            }
            System.out.println();
        }

    }
}