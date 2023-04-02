import java.util.Scanner;

public class Main {

    static void sort(int[] list, int size){
        for(int i = 1 ; i < size ; i++) {
            int key = list[i];
            int j = i -1;

            while( j >= 0 && list[j] > key){
                list[j+1]= list[j];
                j = j - 1;
            }
            list[j + 1 ] = key;
        }

    }

    static void printArray(int [] list ){
        System.out.print("Sorted array: ");
        for(int element: list){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter size of arrays ");
        int size = input.nextInt();
        int startIndex= 0 ;
        int [] list = new int[size];
        System.out.println("Please enter elements ");

        for(int i = 0 ; i< size ; i++){
            System.out.print(i+1 +". element: ");
            int element = input.nextInt();
            list[startIndex++]= element;

        }

        sort(list , size);
        printArray(list);




    }
}