package ar.com.fs.PuebaTecnica1;

public class Ordenador {
	
	public int ElMasGrande(int[] a) {
		//uso bubble sort, es el unico que me se ajajjaaj(si supiera el quick lo usaria pero bueh)	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]) {
					int tmp= a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		return a[0];
		
	}
	
}
