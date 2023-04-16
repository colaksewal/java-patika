public class Main {

    // sondaki ve baştaki charAt ile aynı mı
    static boolean isPalindrome1(String name){
        int i = 0 ;
        int j = name.length()-1;
        while ( i < j ){
            if(name.charAt(i) != name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //reverse array kullanarak

    static  boolean isPalindrome2(String name){

       String reverse = "" ;
       int i = name.length() -1 ;
       while (i >= 0 ){
           reverse = reverse + name.charAt(i) ;
           i--;
       }

       if(name.equals(reverse)){
           return true;
       }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("kayak"));
        System.out.println(isPalindrome2("kavak"));
    }
}