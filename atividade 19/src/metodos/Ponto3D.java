package metodos;

public class Ponto3D extends Ponto  { 

	private double z;

	public double getZ() {
		return z;
	}

	public void setZ(double _z)throws Exception{
     	if(Ponto.isLimite(_z)) 	
                this.z = _z;
     	else
            	throw new Exception ("valor de z fora dos limites");
	}
	
	public Ponto3D () throws Exception {
		this.setX(0);
		this.setY(0);
		this.setZ(0);
	}
	
	public Ponto3D(double _x, double _y,double _z) throws Exception{
		
		this.setX(_x);
		this.setY(_y);
		this.setZ(_z);
		
	}
	
	
	public boolean temEixoComum(Ponto3D _ponto){
     	return this.getX() == _ponto.getX() || this.getY() == _ponto.getY() || this.getZ() == _ponto.getZ();
	}
	
	
   	static public double distancia(double x1, double y1, double z1, double x2, double y2, double z2){
     	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
	}
	

   	public double distancia(Ponto3D _ponto){
         	return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_ponto.getX(),_ponto.getY(),_ponto.getZ());
   	}

   	public double distancia(double _x, double _y, double _z){
         	return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_x,_y,_z);
   	}

   	public double distanciaDaOrigem(){
         	return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),0,0,0);
   	}
   	

   	public int compareTo(Ponto3D _ponto){
         	if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
                	return 1;
         	else if(this.distanciaDaOrigem() < _ponto.distanciaDaOrigem())
                	return -1;
         	else
                	return 0;
   	}
   	
   	
	
	public String toString(){
		StringBuilder dados = new StringBuilder();

	//	dados.append(super.toString());

		dados.append("(");
		dados.append(getX());
		dados.append(",");
		dados.append(getY());
		dados.append(",");
		dados.append(getZ());
		dados.append(")");
		return dados.toString();
	} 
	
	
	
}
