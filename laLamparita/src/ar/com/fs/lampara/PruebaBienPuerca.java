package ar.com.fs.lampara;

public class PruebaBienPuerca {
	public static void main(String[] args) {
		Dimer d = new Dimer();
		d.on();
		System.out.println(d.consultarItensidad());//debe  dar 1
		if(d.consultarEstado() == false)
		{
			System.out.println("ta prendida");
		}
		d.inc();
		System.out.println(d.consultarEstado());
		System.out.println("\n");
		//la apago
		d.off();
		System.out.println(d.consultarItensidad());
		d.dec();
		System.out.println(d.consultarEstado());
		System.out.println(d.consultarItensidad());
	}
}
