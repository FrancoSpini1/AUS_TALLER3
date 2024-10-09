package ar.com.fs.PruebaTecnica2;

public class InviertirString {
	public char[] DOyVueltaCadena(String text) {		
		char[] copy = new char[text.length()];

		for (int i = 0,  j =(text.length()-1); i < text.length(); i++,j--) {
			copy[i] = text.charAt(j);
		}
		return copy;
	}
}
