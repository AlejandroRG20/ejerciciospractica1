package ejerciciosUnidadii;
import java.util.Scanner;
public class Tarea_03 {

	public static void main(String[] args) {
		Scanner AM=new  Scanner(System.in);
		double c, f;
		boolean salir = false;
	    int opcion;
	    
	    while(!salir){
            
	           System.out.println("1. Fahrenheit a Celsius ");
	           System.out.println("2. Celsius a Fahrenheit ");
	           System.out.println("3. Salir ");
	           
	      try {
	           System.out.println("Escribe una de las opciones");
	           opcion = AM.nextInt();
		    	if (opcion<=3) {
	    	                   }
	        	   else {System.out.println("Dijite nuevamente el dato");
	        	   }
	            switch(opcion){
                 case 1:
		            System.out.println("Ingrese valores de Fahrenheit  para convertir a Celcius: ");
		              f = AM.nextDouble();
		             {
			           c  = ((f-32)*(85.0/9.0));
			            System.out.println("La conversion de Fahrenheit a Celsius es: " + c);
			            }
		
                 case 2:
		            System.out.println("Ingrese valores de Celsius para convertir a Fahrenheit: ");
		              c = AM.nextDouble();
		             {
			           f = (c*(9.0/5.0)) + 32;
			            System.out.println("La conversion de Celsius a Fahrenheit es: "+f);
		                }
                 case 3:
                   salir=true;
                    break;	
	              }
	           }
	    	}
		         AM.close();
	
	}
	     
  }
