package test.java.utils;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

	public Utilidades(){
		
	}
	

	/*Ejercicio 3
		Crear un método genérico reverse que devuelva un array de objetos con la misma
		información, pero en orden inverso, es decir donde en la primera posición esté la
		información del último objeto, en la segunda la penúltima y así sucesivamente.
		private static <T> T[] reverse ( T[] arrayOriginal)*/
	
	
	public  static <T> T[] reverseArray ( T[] arrayOriginal){
		T[] clone = null;
		
		if(arrayOriginal !=null) {
			 clone = arrayOriginal.clone();
			
			for (int i=0; i<arrayOriginal.length; i++) {
				clone[i]=arrayOriginal[clone.length-1 -i];
			}
			
		}
		
		return clone;
	}
}