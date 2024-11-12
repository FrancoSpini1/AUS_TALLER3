package Practica2;

import java.util.ArrayList;

public class Cliente {
	private String ClientName;
	private int MemberCode;
	ArrayList<Producto> carrito=new ArrayList<>();
	
	
	public Cliente(String cn,int mc) {
		this.ClientName=cn;
		this.MemberCode=mc;
	}
	
	
	
	public void agregarAlCarrito(Producto producto) {
		carrito.add(producto);
	}

	public void quitarDelCarrito(String string) {
		Producto[] cc=new Producto[carrito.size()];
		carrito.toArray(cc);
		
		for (int i = 0; i < carrito.size(); i++) {
			if(cc[i].getName().equals(string)) {
				carrito.remove(i);
			}
		}
	}

	public void listarCarrito() {
		for (Producto producto : carrito) {
			System.out.println(producto.getName());
		}
	}

	public float calcularMontoTotal() {
		float tmp=0;
		for (Producto producto : carrito) {
			tmp+=producto.getPrice();
		}
		return tmp;
	}
	
	
}
