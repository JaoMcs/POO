package interfaces;

import metodos.Ponto3D;

public interface ObjetoTridimensional {

	/*
	 *  -métodos centro que deve retornar uma
	 *  instância da classe Ponto3D, 
	 *  -calculaSuperfície, que calcula e retorna a área de superfície do 
	 *  objeto tridimensional,
	 *  -calculaVolume, que calcula e retorna o volume do objeto tridimensional.
	 */
	
   	Ponto3D centro();
   	
   	double calculaSuperfice();
   	
   	double calculaVolume();
	
}
