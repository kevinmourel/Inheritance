package Latihan5;

public class Truck {
    //the Truck has three fields
    public int cadence;
    public int gear;
    public int speed;
    //has one constructor
    public Truck(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence= startCadence;
        speed = startSpeed;
    }
    //has four methods
    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applybrake(int decrement){
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
}
