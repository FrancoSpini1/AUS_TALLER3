package Practica2;

public class Principal {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("franco spini",44351);
		
		c1.agregarAlCarrito(new Producto("agua villa del sur 2.25lts","bebida",1700,2));
		c1.agregarAlCarrito(new Producto("paleta cocida paladini(100gr)","embutido",2000,2));
		c1.agregarAlCarrito(new Producto("pan lactal 460gr","panes",2600,1));
		
		c1.listarCarrito();
		System.out.println(c1.calcularMontoTotal());
		System.out.println("#####################");
		c1.quitarDelCarrito("pan lactal 460gr");
		System.out.println("#####################");
		c1.listarCarrito();
		System.out.println("#####################");
		System.out.println("#####################");
		System.out.println(c1.calcularMontoTotal());
	}
}
