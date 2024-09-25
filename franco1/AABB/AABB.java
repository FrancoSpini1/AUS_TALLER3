package ar.com.franco1.AABB;

import ar.com.franco1.punto.Punto;

public class AABB {
	private Punto p1;
	private Punto p2;
	public void setPuntos(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	public Punto getP1() {
		return p1;
	}

	public Punto getP2() {
		return p2;
	}



	public boolean colision(AABB c2) {
		if( (this.p1.getX() > c2.getP2().getX() || this.p2.getX() < c2.getP1().getX()) && (this.p1.getY() < c2.getP2().getY() || this.p2.getY() > c2.getP1().getY())) {
			return false;
		}
		return true;
		
	}
	
}
