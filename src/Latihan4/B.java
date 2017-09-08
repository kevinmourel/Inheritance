package Latihan4;

class B extends A {
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    //override method tampilkanNilai from class A
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
    }
}
