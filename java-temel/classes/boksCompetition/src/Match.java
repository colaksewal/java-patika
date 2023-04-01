import java.awt.*;
import java.util.Random;

class Match {
    //Yarışçıların olması gerekiyor
    Fighter f1 ;
    Fighter f2 ;

    //Siklet hesaplamamız gerekiyor örn  85 -100

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){

        if (isPlay()){

            while(f1.health > 0 && f2.health >0){

                System.out.println("============NEW ROUND==============");

                if(change() == 0){

                    f2.health = f1.hit(f2);

                    if(isWin()){
                        break;
                    }

                    f1.health= f2.hit(f1);

                    if(isWin()){
                        break;
                    }
                    printScore();
                }else{

                    f1.health = f2.hit(f1);

                    if(isWin()){
                        break;
                    }

                    f2.health= f1.hit(f2);

                    if(isWin()){
                        break;
                    }
                    printScore();
                }

            }
        }else{
            System.out.println(" Athletes' weights do not match ");
        }
    }


    boolean isPlay(){
        return ((this.f1.weight >= minWeight && this.f1.weight<= maxWeight ) && (this.f2.weight >= minWeight && this.f2.weight<= maxWeight ));
    }

    boolean isWin(){
        if(f1.health == 0){
            System.out.println(" Winner : " + f2.name);
            return true;
        }else if(f2.health == 0 ){
            System.out.println("Winner : " + f1.name);
            return true;
        } else if (f1.health== 0 && f2.health == 0) {
              System.out.println("Scoreless");
              return true;
        }
        return false;
    }

    void printScore(){

        System.out.println("Score "+ f1.name+ " Remaining life: "+ f1.health + " || " + f2.name + " Remaining life: " + f2.health+ " || ");
    }

     int change(){
        Random random = new Random();
        return random.nextInt(2);
    }






}
