/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapelotijera;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PiedraPapeloTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int Piedra;
        int Papel;
        int Tijera;
        int Piedrapapeltijerarandom;
        */
        int OpcionIngresada;
        int PPTRandom;
        PPTRandom=(int)(Math.random()*3);
        System.out.println(""+PPTRandom);
        System.out.println("Ingrese Piedra (0), Papel (1) o Tijera (2)");
        Scanner myScanner= new Scanner(System.in);
        OpcionIngresada= myScanner.nextInt();
        
        switch (PPTRandom)
        {
            case 0:
                System.out.println("La maquina eligio piedra");
                break;
            case 1:
                System.out.println("La maquina eligio papel");
                break;
            case 2:
                System.out.println("La maquina eligio tijera");
                break;
        }
        switch (OpcionIngresada)
        {
            case 0:
                System.out.println("Elegiste piedra");
                break;
            case 1:
                System.out.println("Elegiste papel");
                break;
            case 2:
                System.out.println("Elegiste tijera");
                break;
        }
        
        if (OpcionIngresada==0)
        {
            if (PPTRandom==0)
            {
                System.out.println("Empate");
            }
            if (PPTRandom==1)
            {
                System.out.println("Perdiste");
            }
            
            if (PPTRandom==2)
            {
                System.out.println("Ganaste");
            }
            
        }
        
        if (OpcionIngresada==1)
        {
            if (PPTRandom==0)
            {
                System.out.println("Ganaste");
            }
            if (PPTRandom==1)
            {
                System.out.println("Empate");
            }
            
            if (PPTRandom==2)
            {
                System.out.println("Perdiste");
            }
            
        }
        
        if (OpcionIngresada==2)
        {
            if (PPTRandom==0)
            {
                System.out.println("Perdiste");
            }
            if (PPTRandom==1)
            {
                System.out.println("Ganaste");
            }
            
            if (PPTRandom==2)
            {
                System.out.println("Empate");
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
