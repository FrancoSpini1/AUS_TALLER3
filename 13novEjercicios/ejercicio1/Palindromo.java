package ejercicio1;

public class Palindromo {
	public boolean esPalindromo_oNo(String palabra) {
		char[]copy =new char[palabra.length()];
		copy=palabra.toCharArray();
		int count=0;
		int i=0;
		int j=0;
		for (i = 0 ,j=copy.length -1; i <= j; i++,j--) {
			if(copy[i] == copy[j]) {
				count++;
			}
		}
		if(count ==i) {
			return true;
		}
		return false;
	}
}
