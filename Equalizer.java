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
    
    
    public static void main(String[] args) {
        sorok();
    }
    
    private static void sorok(){
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    
    private static void eq(){
        Random rnd = new Random();
        String szoveg = "";
        int hossz = rnd.nextInt(5)+3;
        int i = 0;
        while(i < hossz){
            szoveg += "\u001B[45m" + " ";
            i++;
        }
        System.out.println(szoveg);
    }
    private static void eq(int hossz){
        Random rnd = new Random();
        String szoveg = "";
        int i = 0;
        while(i < hossz){
            szoveg += "\u001B[45m" + " ";
            i++;
        }
        System.out.println(szoveg);
    }
    
}
