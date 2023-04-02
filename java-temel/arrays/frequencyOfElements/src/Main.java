public class Main {

    static void printArr(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }


    static int countRepeat(int[] arr, int value){
        int count= 0;
        for(int element : arr){
            if(value == element) {
                count++;
            }
        }
        return count ;

    }

    public static void main(String[] args) {
        int [] arr= {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Repeating number: ");
        int [] freq = new int[arr.length];
        int visited = -1 ;

        for(int i = 0 ; i< arr.length ; i++){
            for(int j= i+ 1  ; j < arr.length ; j++){
               if(arr[i] == arr[j]){
                   freq[j] = visited;
               }
            }

        if(freq[i] != visited){
            freq[i] = countRepeat(arr,arr[i]);
        }
    }
        //printArray(freq)

        for(int i = 0 ; i< freq.length; i++){
            if(freq[i] != visited){
                System.out.println(arr[i] + " : " + countRepeat(arr, arr[i])+ " times repeated");

            }
        }


    }
}