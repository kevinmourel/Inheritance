package Latihan4;

class DemoOverride2 {
    public static void main(String[]args){
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //memanggil method pada class B
        obj.tampilkanNilai();
    }
}
