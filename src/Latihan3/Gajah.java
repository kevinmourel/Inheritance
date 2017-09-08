package Latihan3;

public class Gajah extends Hewan {
    public static void testCLassMethod(){
        System.out.println("The Class MEthod in Hewan...");
    }
    //override class animal method
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah...");
    }
    public static void main(String[]args){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
