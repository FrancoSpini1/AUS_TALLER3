package cuentovocales;
/*Implementa un método que cuente cuántas vocales contiene una cadena de texto.

*/
public class CuentaVocales {
	
	public int ContadorDeVocales(String str) {
			int contadorVocales=0;
		for (int i = 0; i < str.length(); i++) {			
			String frase=str.toLowerCase();
			switch (frase.charAt(i)) {
			case 'a'  :
				contadorVocales ++;
				break;
			case 'e' :
				contadorVocales++;
				break;
			case 'i' :
				contadorVocales++;
				break;
			case'o':
				contadorVocales++;
				break;
			case'u' :
				contadorVocales++;
				break;		
			default:
				break;
			}
		}
		return contadorVocales;
	}

	
}
