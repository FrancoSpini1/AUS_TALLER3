package ar.com.fs.PruebaTecnica2;

public class PruebaTecnica2 {
	public static void main(String[] args) {
		/*
		 * IMPLEMENTA UNA FUNCION QUE INVIERTA UNA CADENA DE TEXTO
		 * SIN USAR FUNCIONES NATIVAS
		 * */
		
		String t = "hola mundo";
		InviertirString is = new InviertirString();
		
		//ordenada
		System.out.println(t);
		
		//invertida
		System.out.println(is.DOyVueltaCadena(t));
		//ajajajaj me llevó 23 minutos esta vaina jajaja (encima usé metodos nativos todo mal);
	}
}
