package Practica2;

public class Producto {
	private String name;
	private String type;
	private float price;
	private int cant;
	
	public Producto(String n,String t,float p,int c) {
		this.name=n;
		this.type=t;
		this.price=p;
		this.cant=c;
	}

	public Object getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
