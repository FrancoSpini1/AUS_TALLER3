package inversor;
/*Crea un método que invierta las palabras en una oración, manteniendo el orden de las palabras.*/
import java.util.Iterator;

public class Invertir {
	
	public String invertirPalabras(String oracion) {
		char[] copia = new char[oracion.length()];
		for (int i = 0,j=oracion.length()-1; i < j; i++,j--) {
			char tmp =oracion.charAt(i);
			 copia[i] = oracion.charAt(j);
			 copia[j] =tmp;
		}
		
		return oracion.copyValueOf(copia);
	}
	
}
