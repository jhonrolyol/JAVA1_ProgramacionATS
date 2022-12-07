/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06_entradaysalidadedatosporconsola;

import java.util.Scanner;

/**
 *
 * @author GAMER
 */
public class Main {
    
    // Topic: Console data input and output
    
    // Link : https://www.youtube.com/watch?v=taSF09mPlcs&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K&index=9

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // # 1 int
           Scanner entrada1 = new Scanner(System.in);
	   int número1;
	   System.out.println("Digite un numero: ");
	   número1 = entrada1.nextInt();
           System.out.println("El número es: " + número1);
		  
	// # 2 float
           Scanner entrada2 = new Scanner(System.in);
	   float número2;
	   System.out.println("Digite un numero: ");
	   número2 = entrada2.nextFloat();
	   System.out.println("El número es: " + número2);
		
	// # 3 double
	   Scanner entrada3 = new Scanner(System.in);
           double número3;
	   System.out.println("Digite un numero: ");
           número3 = entrada3.nextDouble();
           System.out.println("El número es: " + número3);
		
	// # 4 String 1
	   Scanner entrada4 = new Scanner(System.in);
	   String cadena1;
	   System.out.println("Digite una cadena: ");
	   cadena1 = entrada4.next();	
	   System.out.println("La cadena es: " + cadena1);
		
	// # 5 String 2
	   Scanner entrada5 = new Scanner(System.in);
           String cadena2;
	   System.out.println("Digite una cadena: ");
	   cadena2 = entrada5.nextLine();	
	   System.out.println("La cadena es: " + cadena2);
		
	// # 6 chart
	   Scanner entrada6 = new Scanner(System.in);
	   char letra;
	   System.out.println("Digite una letra: ");
	   letra = entrada6.next().charAt(0);	
	   System.out.println("La letra es: " + letra);
           
    }
    
}
