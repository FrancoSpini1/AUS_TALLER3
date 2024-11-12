package practica4;

public class Usuario {
	private String UserName;
	private int nMember;
	private Libro libroPrestado;
	public Usuario(String UserName,int nMember) {
		this.UserName=UserName;
		this.nMember=nMember;
	}

	public String getUserName() {
		return UserName;
	}

	public int getnMember() {
		return nMember;
	}
	
	public void setLibro(Libro l) {
		libroPrestado =l;
	}
	
	public Libro getLibro() {
		return libroPrestado;
	}
	
	
	
}
