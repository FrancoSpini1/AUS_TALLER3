package calculadora;

public class Calculadora {
	
	public float sumar(float n1,float n2) {
		return n1+n2;
	}
	
	public float dividir(float dividendo,float divisor ) throws DividoPorCeroException{
		DividoPorCeroException dpce=new DividoPorCeroException();
		return dividendo /divisor;
	}

	public float multiplicar(float n1, float n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	public float restar(float n1, float n2) {
		return n1-n2;
	}
}
