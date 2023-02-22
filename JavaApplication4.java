package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        kiir("Az elso 10 szam: " + elso10szamOsszege() + "\n");
        kiir(String.format("%d + %d = %d",a, b, osszedad(a, b)));
    }
    
    
    
    
    private static int elso10szamOsszege(){
        int osszeg = 0;
        for(int i = 0; i < 10; i++){
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszedad(int a, int b){
        return a+b;
    }
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
    
    
    
}
