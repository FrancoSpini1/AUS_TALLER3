package ar.com.fs.listas;

import java.util.ArrayList;

public class ListaDemo {
	public static void main(String[] args) {
		ArrayList p=new ArrayList();
		
		p.add("corchos");
		p.add("cáscaras");
		
		System.out.println(p.size());
		
		String s = p.get(0).toString();
		
		System.out.println(s);
	}
}
