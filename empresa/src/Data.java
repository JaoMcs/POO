public class Data {
	private int dia, mes, ano;

	public int getDia() {      	
		return this.dia;  	
	}
	public void setDia(int _dia) {
		this.dia = _dia; 	
	}


	public int getMes() {      	
		return this.mes;  	
	}
	public void setMes(int _mes) {
		this.mes = _mes; 	
	}


	public int getAno() {      	
		return this.ano;  	
	}
	public void setAno(int _ano) {
		this.ano = _ano; 	
	}

	public void setData(int _dia, int _mes, int _ano) throws Exception{

		if( Data.isDataValida(_dia, _mes, _ano) == true){

			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		}

		else{
			throw new Exception("ERRO: data invalida");
		}
	}

	public Data(int _dia, int _mes, int _ano) throws Exception{
		this.setData(_dia, _mes, _ano);
	}

	public boolean isDataBixesto() {
		if ( (this.getAno()%4 == 0 && this.getAno()%100 != 0) || (this.getAno()%400 == 0) ){
			return true;
		}
		else
			return false;
	}
	public static boolean isDataBixesto(int dia, int mes, int ano)throws Exception{

		if ( (ano%4 == 0 && ano%100 != 0) || (ano%400 == 0) ){
			return true;
		}
		else
			return false;	
	}
	
	public static boolean isDataValida (int dia, int mes, int ano)throws Exception{

		if (dia > 31 || mes > 12 || ano < 1582) {

			return false;
		}

		else if( (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31 )){

			return true;
		}
		else if ( (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 32 )) {

			return true;
		}

		else if(mes == 2){
			if (Data.isDataBixesto(dia, mes, ano) == true) {
				if(dia > 29){
					return false;
				}

				else{
					return true;
				}
			}
			else if(dia < 28){
				return true;
			}

			else {
				return false;
			}
		}

		return false;
	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		dados.append("]");
		return dados.toString();
	}  



}