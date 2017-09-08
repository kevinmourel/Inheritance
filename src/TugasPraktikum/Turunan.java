package TugasPraktikum;

public class Turunan extends Induk{
    public void test(String s){
        System.out.println("Method overload di dalam kelas turunan");
        System.out.println("S:\""+s+"\"");
}
    public void test(){
        System.out.println("Method override di dalam kelas turunan");
    }
}
