package ar.com.fs.lampara;

public class Dimer extends Lampara{

	private int intensidad;
	
	public int consultarItensidad() 
	{
		return intensidad;
	}

	public void inc() 
	{
		intensidad++;
		if(this.consultarItensidad() >= 0) {		
			super.on();
		}
	}

	public void dec() 
	{
		intensidad--;
		if(this.consultarItensidad() <= 0) 
		{
			super.off();
		}
	
	}			
	@Override	
	public void off() {
		super.off();
		this.intensidad = 0;
	}
	
	@Override 
	public void on() {
		inc();
	}

}
