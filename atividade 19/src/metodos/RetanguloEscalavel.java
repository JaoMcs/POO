package metodos;

import interfaces.Escalavel;
import interfaces.ObjetoGeometrico;

public class RetanguloEscalavel implements ObjetoGeometrico,Escalavel  {
	private Ponto dotSuperior;
	private Ponto dotInferior;




	public Ponto getDotSuperior() {
		return dotSuperior;
	}
	public void setDotSuperior(Ponto _dotSuperior) {
		this.dotSuperior = _dotSuperior;
	}
	public Ponto getDotInferior() {
		return dotInferior;
	}
	public void setDotInferior(Ponto _dotInferior) {
		this.dotInferior = _dotInferior;
	}

	public RetanguloEscalavel() {

	}

	public RetanguloEscalavel(Ponto _dotSuperior, Ponto _dotInferior) {

		this.setDotSuperior(_dotSuperior);
		this.setDotInferior(_dotInferior);

	}

	public void amplia(double escala) {

		try {
			Ponto p1 = new Ponto (dotSuperior.getX()-escala, dotSuperior.getY()+escala);
			Ponto p2 = new Ponto (dotInferior.getX()+escala, dotInferior.getY()-escala);

			this.setDotSuperior(p1);
			this.setDotInferior(p2);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}



	public void espelha(){
		try {
			Ponto p1 = new Ponto(this.dotSuperior.getX()+dotInferior.getX(), this.dotSuperior.getY());
			Ponto p2 = new Ponto(this.dotSuperior.getX()+dotInferior.getX(), this.dotSuperior.getY());

			this.setDotSuperior(p1);
			this.setDotInferior(p2);
		}
		catch(Exception e) {
		}
	}

	public Ponto centro() {

		Ponto a = null;
		try {
			Ponto centro = new Ponto ((this.dotSuperior.getY())/2,(this.dotInferior.getX())/2);

			return centro;

		}
		catch(Exception e) {

		}
		return a;


	}
	
   	public double calculaÁrea() {
   		
   		double area = (this.dotSuperior.getY()*this.dotInferior.getX());
   		
   		return area;
   		
   	}
   	
   	public double calculaPerímetro() {
   		
   		double perimetro = this.dotInferior.getX()+this.dotInferior.getY()+this.dotSuperior.getX()+this.dotSuperior.getY();
   		
   		return perimetro;
   		
   	}


	
}