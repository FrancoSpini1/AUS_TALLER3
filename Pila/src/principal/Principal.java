package principal;

import pila.Pila;
import pila.TeBandeasteException;
import pila.TieneRepetidosException;

import java.util.*;
import java.lang.*;
public class Principal {
	public static void main(String[] args)  {
		Pila<Integer> p1= new Pila<>();
		try {
			for (int i = 0; i < 9; i++) {
				try {
					p1.push( i+22);
				} catch (TieneRepetidosException e) {
					e.printStackTrace();
				}
			}
		} catch (TeBandeasteException e) {
			e.printStackTrace();
		}
		System.out.println(p1.SizeList()+"\n");//daria 9
		
		
		for (int i = 0; i < 9; i++) {
			System.out.println(p1.pop());
		}
		try {
			System.out.println(p1.TieneRepetidos());		//da false porque todos son unicos
		} catch (TieneRepetidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//como que no tiene repetidos? si hay un monton que se repiten

	}
}
