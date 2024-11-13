package ejercicio2;
import java.util.*;
public class Conversor {
	public void convertirACelcius() {
		Scanner k=new Scanner(System.in);
		System.out.println("ingresa el monto y se convertira a celcius");
		float temperaturaC;
		temperaturaC=k.nextFloat();
		System.out.println(((temperaturaC - 32) * 5.0/9)); 
	}

	public void convertirAFarenheit() {
		Scanner k=new Scanner(System.in);
		System.out.println("ingresa el monto y se convertira a farenheit");
		float temperaturaF=k.nextFloat();
		System.out.println(((temperaturaF * 9/5) +32));
	}
}
