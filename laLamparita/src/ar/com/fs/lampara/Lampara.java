package ar.com.fs.lampara;

public class Lampara {
	private boolean encendido;

	public Lampara ()
	{
		encendido = false;
	}
	
	public boolean consultarEstado() 
	{
		return !encendido;
	}

	public void on() 
	{
		encendido = true;
	}
	
	public void off() 
	{
		encendido =  false;
	}
	
}
