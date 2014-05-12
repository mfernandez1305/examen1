package examen;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Rating de Peliculas");
		System.out.print("Ingrese una Calificacion para Rio2 (de 1 a 5):");
		int cali;//declaracion de variable para poder evaluar//
		cali=s.nextInt(); //lee la calificacion ingresada por el ususario//
		
		if (cali==1)//evalua lo ingresado por el usuario//
		System.out.print("Pésima"); //muestra la calificacion segun lo que el usuario ingreso//
	    else; 
	    	if (cali==2)
			System.out.print("Mala");
	    	else;
				if (cali==3)
				System.out.print("Regular");
				else;
					if (cali==4)
					System.out.print("Buena");
					else;
						if(cali==5)
						System.out.print("Excelente");
					
	    }
	}




