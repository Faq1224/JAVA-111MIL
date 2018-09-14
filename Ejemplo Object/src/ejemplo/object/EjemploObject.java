/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.object;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Edad;
        int Contador;
        Contador=1;
        double NumeroSecreto;
        int NumeroIncognito;
        int NumeroIngresado;
        NumeroSecreto=Math.random();
        NumeroSecreto=NumeroSecreto*100;
        NumeroIncognito=(int) NumeroSecreto;
        Scanner myScanner= new Scanner(System.in);
        NumeroIngresado=-1;
        
        while (NumeroIngresado!=NumeroIncognito)
                {
                    System.out.println("Por favor ingrese un numero");
                    NumeroIngresado=myScanner.nextInt();
                    if (NumeroIncognito>NumeroIngresado)
                    {
                        System.out.println("Te falta");
                    }
                    if (NumeroIncognito<NumeroIngresado)
                    {
                        System.out.println("Te pasaste");
                    }
                    if (NumeroIncognito==NumeroIngresado)
                    {
                        System.out.println("Ganaste");
                        break;
                    }
                    Contador++;
                    
                }
        switch (Contador)
        {
            case 1:
                System.out.println("Sos un genio");
                break;
            case 2:
                System.out.println("Tuviste suerte");
                break;
            case 3:
                System.out.println("Casi casi");
                break;
            case 4:
                System.out.println("Tomate un fosfobita");
                break;
            default:
                System.out.println("Tenes suerte en el amor");
                break;
        }
        /*
        System.out.println("Por favor ingrese su edad");
        Edad=myScanner.nextInt();
        System.out.println("Su edad es "+Edad);
        /*
        if (Edad<0)
        {
            System.out.println(Edad+" no es una edad válida. Por favor ingrese su edad");
        }
        */
        /*
        while (Edad<0)
        {
            Contador=Contador+1;
            System.out.println("La edad ingresada no es valida. Por favor ingrese su edad");
            Edad=myScanner.nextInt();
            if (Contador==3)
            {
                System.out.println("Perdiste");
                break;
            }
        
        
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
