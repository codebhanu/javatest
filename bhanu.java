interface interfaceOne{
  public void updateGear(int gear);

}
interface interfaceOTwo{
    public void accelerate(int accelearate);

}

interface interfaceThree{
    public void pushBrake(int brake);


}

class car implements interfaceOne,interfaceOTwo,interfaceThree{
   private int gear;
    private int brake;
   private int accelearate;
   private int speed;

    public void updateGear( int gear){
        this.gear =gear;


    }
    public void accelerate(int accelearate){
        this.accelearate=accelearate;


    }
    public void pushBrake(int brake){
        this.brake=brake;


    }

    public void currentSpeed(){
         this.speed=accelearate-brake;
        System.out.printf("Car present state: %nBrake: %d %nSpeed: %d Gear: %d",brake,speed,gear);


    }




    
}
class Truck implements interfaceOne,interfaceOTwo,interfaceThree{
   private int gear;
     private int brake;
     private int accelearate;
    private int speed;
    public void updateGear(int gear ){
        this.gear =gear;


    }
    public void accelerate(int accelearate){
        this.accelearate=accelearate;


    }
    public void pushBrake(int brake){
        this.brake=brake;


    }

    public void currentSpeed(){
        this.speed=accelearate-brake;
        System.out.printf(" %n Truck present state: %nBrake: %d %nSpeed: %d Gear: %d",brake,speed,gear);


    }


}
public class bhanu{
    public static void main (String[] args){
      car c1 =new car();
      Truck t1= new Truck();
      c1.pushBrake(2);
      c1.accelerate(4);
      c1.updateGear(3);
      c1.currentSpeed();

      t1.pushBrake(2);
      t1.accelerate(5);
      t1.updateGear(3);
      t1.currentSpeed();
    }
}


