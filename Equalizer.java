/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyakorlas;

import java.util.Random;

/**
 *
 * @author szlan
 */
public class Equalizer {
    
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        sorok();
    }
    
    private static void sorok(){
        eq();
        eq(12, true);
        eq();
        eq(8, true);
        eq();
    }
    
    private static void eq(){
        eq(rnd.nextInt(5)+3, false);
    }
    private static void eq(int hossz){
        eq(hossz, false);
    }
    private static void eq(boolean hosszKiir){
        eq(rnd.nextInt(5)+3, hosszKiir);
    }
    
    private static void eq(int hossz, boolean hosszKiir){
        String szoveg = "";
        for(int i = 0; i < hossz; i++){
            szoveg += "\u001B[45m" + " ";
        }
        if(hosszKiir){
                System.out.println(szoveg + "\u001B[0m(%d)".formatted(hossz));
            }
        else{
            System.out.println(szoveg);
        }
    }
    
    
}
