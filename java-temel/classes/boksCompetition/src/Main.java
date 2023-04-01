public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Selin", 60, 15,100,50);
        Fighter f2 = new Fighter("Pelin" , 70,10 , 140,65) ;

        Match match = new Match(f1, f2, 55, 75);
        match.run();
    }
}