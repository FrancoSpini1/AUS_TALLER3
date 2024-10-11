package ar.com.fs.primo;

public class Primo {

	public void EsPrimo_o_No(int nro) {
		int i=0;
		for (int j = nro; j >0; j--) {
			if(nro%j==0) {
				i++;
			}
			
		}
		
		if(i==2) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}
	}

}
