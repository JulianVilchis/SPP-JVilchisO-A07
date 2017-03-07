/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a07;

import java.util.Scanner;

public class SPPJVILCHISOA07 {
    
 public static void main(String[] args) {
        
        int num;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el numero de telefon " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Introduzca el numero ");
        num= kb.nextInt();
        if (num < telefono.length){
        System.out.println("El numero es " + telefono[num]);
        } else System.out.println("FUERA DEL RANGO.");
        
        
        
        
        
    }
    
    public static void arrelgo(){
        
    }
    
}

