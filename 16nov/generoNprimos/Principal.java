package generoNprimos;
//crear un metodo que genere primos del n1 al n2
public class Principal {
	public static void main(String[] args) {
		Primos np= new Primos();
		int n1=1;
		int n2=9;
		int[]arrayPrimos=np.generarPrimos(n1,n2);
		for (int i : arrayPrimos) {
			System.out.println(i);
		}
	}
}
