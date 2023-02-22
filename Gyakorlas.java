package gyakorlas;

public class Gyakorlas {

    public static void main(String[] args) {
        kiirasok();
    }

    private static void kiirasok() {
        int a = 1;
        int b = 5;
        int[] szamok = {2, 4, 6, 8};
        int osszeg = osszedad(szamok[0], szamok[1]);
        osszeg += osszedad(szamok[2], szamok[3]);
        int[] szamok2 = {3, 3, 3};
        
        kiir("Az elso 10 szam: " + elso10szamOsszege() + "\n");
        
        kiir(String.format("%d + %d = %d\n",a, b, osszedad(a, b)));
        
        kiir(String.format("%d + %d + %d + %d = %d\n", szamok[0], szamok[1], szamok[2], szamok[3], osszeg));
        
        kiir(String.format("%d + %d + %d gyoke = %s\n", szamok2[0], szamok2[1], szamok2[2], haromGyok(szamok2[0], szamok2[1], szamok2[2])));
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

    
    private static double haromGyok(int a, int b, int c){
        int osszeg = osszedad(a, b);
        osszeg += c;
        return Math.sqrt(osszeg);
    }
    
}
