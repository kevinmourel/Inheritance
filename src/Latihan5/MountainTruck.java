package Latihan5;

public class MountainTruck extends Truck  {
    //adds one field
    public int seatHeight;
    //has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
            super (startCadence, startSpeed, startGear);
            seatHeight = startHeight;
        }
    //adds one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[]args){
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+MB.speed);
    }
}
