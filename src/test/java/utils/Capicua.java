package test.java.utils;

public class Capicua {

	public Capicua() {
		
	}
	
	/*Implementa una clase Utilidades. Esta clase contiene dos métodos estáticos, 
	 * uno para comprobar si un número es capicúa (13531, 245542, 13.31 son capicúas) y
	 *  otro para comprobar que una cadena de texto es un anagrama.
	 Desarrolla primero los tests unitarios que den cobertura a estos dos métodos y a 
	 continuación desarrolla los dos métodos.*/
	
	public static boolean esCapicua(Integer numero) {
		Integer numeroInvertido=0;
		if(numeroInvertido==numero)
			 return true;
		
		else {
			numeroInvertido=numero;
			Integer[] numero1= new Integer[1];
			Integer[] numeroAComparar = new Integer[1];
			numero1[0]= numeroInvertido;
			for (int i=0; i<numero1.length;i++){
				numeroAComparar[i]=numero1[numeroAComparar.length-1 -i];
				if(numero1.equals(numeroAComparar)) {
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean esCapicua(String numero) {
		boolean resultado =true;
		for(int i=0; numero.length()/2>i; i++) {
			if (numero.charAt(i) != numero.charAt(numero.length()-1)-i) {
				return false;
			}
		}
		return resultado;
	}
	
	
	public static boolean esCapicua(Double numero) {
		
		
		
		return false;
	}

}
