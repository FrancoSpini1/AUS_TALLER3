package ar.com.fs.calculadora;

public class Calculadora {
		double nro1;
		double nro2;
		
		public double getNro1() {return nro1;}
		
		public double getNro2() {return nro2;}

		public void setNro1(double nro1) {this.nro1 = nro1;}

		public void setNro2(double nro2) {this.nro2 = nro2;}
		
		public double sumar() {return this.nro1 + this.nro2;}

		public double multiplicar() {return nro1*nro2;}

		public double restar() {return nro1 - nro2;}

		public double dividir() {return (nro1/nro2);}
		}
