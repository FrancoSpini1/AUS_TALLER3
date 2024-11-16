package palindromo;

import java.util.Iterator;

public class Palindromo {
	public boolean isPalindromo(String palin) {
		int contador=0;
		char[] copy=new char[palin.length()];
		copy=palin.toCharArray();
		int i;
		int j=palin.length()-1;
		for (i=0,j=palin.length()-1;i<=j;i++,j--) {
			if(palin.charAt(i) == palin.charAt(j)) {
				contador++;
			}
		}
		if(contador == i) {
			return true;
		}
		return false;
	}
}
