package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {

    }
    
    
    
    
    private static void elso10szamOsszege(){
        int osszeg = 0;
        for(int i = 0; i < 10; i++){
            osszeg += i;
            osszedad(osszeg, i);
        }
    }
    
    
    private static void osszedad(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }
    
}
