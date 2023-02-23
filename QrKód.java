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
public class QrKód {
    private static final Random rnd = new Random();
    
    
    public static void main(String[] args) {
        kiir(qr());
        kiir(qr(20));
    }
    
    private static void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
    private static String qr(){
        return qr(10);
    }
    
    
    
    private static String qr(int szelesseg){
        String szoveg = "";
        String szinek = "";
        for(int j = 0; j < szelesseg/2; j++){
            for(int i = 0; i < szelesseg; i++){
                int random = rnd.nextInt(2);
                if(random == 0){
                    szinek = "\u001B[43m" + " ";
                }
                else{
                    szinek = "\u001B[0m" + " ";
                }
                szoveg += szinek;
            }
            szoveg += "\n";
        }

        return szoveg;
    }
    
    
    
    
}
