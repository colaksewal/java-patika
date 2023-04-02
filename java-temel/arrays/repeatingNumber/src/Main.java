public class Main {

    static boolean isRepeat(int[] arr, int value){

        for(int num : arr){
            if(num == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = {3 , 7 , 2 , 2 , 7 , 8 , 3 , 4, 1 , 33 , 1, 4  };
        int [] evenDuplicate = new int[list.length];
        int startIndex= 0 ;

        for (int i= 0 ; i < list.length;i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isRepeat(evenDuplicate, list[i])) {
                        evenDuplicate[startIndex++] = list[i];
                        break; // Zaten 1 tane bulduysak tekrar etmiş demektir
                    }
                }
            }
        }

        for(int val : evenDuplicate){
                if(val != 0)
                 System.out.print(val + " ");
        }



    }
}