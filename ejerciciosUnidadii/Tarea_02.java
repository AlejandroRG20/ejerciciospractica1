package ejerciciosUnidadii;

public class Tarea_02 {

	public static void main(String[] args) {
		double a = 10.0, b = 3.0, c = 14.0, respuesta = 0.0;
		Boolean es_Verdadero = false;
		
		respuesta = (a*b + 2*b);
		es_Verdadero = (b<a & a>c);
		
		System.out.println("(a*b + 2*b) = " + respuesta);
		System.out.println("(b<a || a>c) = " + es_Verdadero);

	}

}
