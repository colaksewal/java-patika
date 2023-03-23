 class Car {
    //Niteliklerr
    String type  ;
    String model ;
    String color ;
    int speed;
    int speedLimit ;

    Car( String model , int speed , String color){
        this.model = model ;
        this.speed = speed ;
        this.type = "Sedan";
        this.color = color ;
        this.speedLimit =180 ;
    }

    Car(){
        System.out.println("Constructor");
    }




    void increaseSpeed(int increment ){
        if(this.speed + increment < speedLimit)
             this.speed += increment ;
    }

    void decreaseSpeed(int decrease){
        if(this.speed > 0 ){
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız: " + this.speed);
    }
    void printInfo(){System.out.println("Model \t:" + this.model);
                     System.out.println("Color \t:" + this.color);
                     System.out.println("Type \t:" + this.type);
                     System.out.println("Speed \t:" + this.speed);

    }




}
