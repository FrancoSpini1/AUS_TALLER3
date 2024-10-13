package palindromo;
/*Escribe un método en Java que determine si una cadena de
 *texto es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).*/
public class Palindromo {
	public boolean esPalindromo(String palabra) {
		//System.out.println(palabra.length());
		int i,j;
		int l = 0;
		for ( i = 0,j=palabra.length()-1; i <= j; i++,j--) {
			if(palabra.charAt(i) == palabra.charAt(j) ) {
				l++;
			}
		}
		if(l==i) {
			return true;
		}
		return false;
	}
}
