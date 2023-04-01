class Fighter {

    String name;
    int weight ;
    int damagePower;
    int health;
    int dodgeCapacity;


    Fighter(String name, int weight, int damagePower , int health , int dodgeCapacity){

        this.name = name;
        this.weight= weight;
        this.damagePower = damagePower;
        this.health = health;
        this.dodgeCapacity = dodgeCapacity;

    }


   int hit(Fighter foe){

        System.out.println("------------------------");

        System.out.println(this.name + " => "+ foe.name + " " + this.damagePower + " damaged " ) ;

        if(foe.dodge()){
            System.out.println(foe.name + " dodges incoming damage " );
            return foe.health;
        }

        if(foe.health - this.damagePower < 0 )
            return 0;

        return foe.health - this.damagePower;

   }

   boolean dodge(){
        double randomValue = Math.random()* 100 ;
        return randomValue <= this.dodgeCapacity;
   }






}