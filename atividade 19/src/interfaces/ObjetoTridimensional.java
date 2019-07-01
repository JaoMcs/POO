package interfaces;

import metodos.Ponto3D;

public interface ObjetoTridimensional {

	/*
	 *  -m�todos centro que deve retornar uma
	 *  inst�ncia da classe Ponto3D, 
	 *  -calculaSuperf�cie, que calcula e retorna a �rea de superf�cie do 
	 *  objeto tridimensional,
	 *  -calculaVolume, que calcula e retorna o volume do objeto tridimensional.
	 */
	
   	Ponto3D centro();
   	
   	double calculaSuperfice();
   	
   	double calculaVolume();
	
}
