package examen3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Programa para calcular el puntaje de un juego en el que el usuario ingrese 3 numeros");
		System.out.print("Ingrese Puntaje 1:");
		int punt1;//lee lo ingresado por el usuario//
		punt1=s.nextInt();
		System.out.print("Ingrese Puntaje 2:");
		int punt2;
		punt2=s.nextInt();
		System.out.print("Ingrese Puntaje 3:");
		int punt3;
		punt3=s.nextInt();
		double prom;
		prom=(punt1+punt2+punt3)/3;//calcula el Promnedio//
		
		if (prom>1000)//evalua lo ingresado por el usuario//
			System.out.print("Excelente"); //muestra la evaluacion segun lo que el usuario ingreso//
		    else 
		    	if (prom>700)
				System.out.print("Bueno");
		    	else
					if (prom>500)
					System.out.print("Suficiente");
					else
						if (prom<500)
						System.out.print("Has Perdido");
						
						
				
		 

	}

}
/*Ejercicio 3: (5 pts)
Realice un programa para calcular el puntaje de un juego en el que el usuario ingrese 3 numeros. 
Si el promedio está arriba de 1000 imprimir "Excelente",
 sino si está arriba de 700 imprimir "Bueno", 
 sino si esta arriba de 500 imprimir "Suficiente" y 
 sino imprimir "Has perdido".
Ejemplo:
Puntaje 1: 1000
Puntaje 2: 500
Puntaje 3: 750
Promedio: 750 Bueno*/