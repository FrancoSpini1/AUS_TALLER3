package adivinador;

public class GeneradorRandom {
	public int generoNumRandom(int n1,int n2) {
		
		int[] v=new int[(n2-n1)+1];
 		for (int i = 0; i < v.length; i++) {
			v[i]=i+n1;
		}
 		int random =(int) (Math.random()* v.length);
 		return v[random];
	}
}
