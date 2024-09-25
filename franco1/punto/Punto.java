package ar.com.franco1.punto;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(float x) 
	{this.x = x;}

	public void setY(float y) 
	{this.y = y;}

	public float getX() 
	{return x;}

	public float getY() 
	{return y;}

	public double distancia(Punto p2) {
		return Math.sqrt(Math.pow(this.getX()-p2.getX(), 2)+Math.pow(this.getY()-p2.getY(), 2));
		
	}
	
}
