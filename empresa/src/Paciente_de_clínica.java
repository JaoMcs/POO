
public class Paciente_de_cl�nica extends Pessoa{
	
	private String planoS;
	//Plano de Saude (planoS) vou levar em considera��o que � o tipo do plano
	// sendo que o tipo 1 = plano simples tipo 2 = plano melhor
	// tipo 3 = plano top; 
	
	public String getPlanoS() {      	
		return this.planoS;  	
	}
	public void setPlanoS(String _planoS) {
		this.planoS = _planoS; 	
	}
	
	public Paciente_de_cl�nica (String _nome, Data _dtNasc, int _indentidade, String _planoS){
		
		this.setNome(_nome);
		this.setDtNasc(_dtNasc);
		this.setIndentidade(_indentidade);
		this.setPlanoS(_planoS);
		
		
	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("Plano de saude � o : "); 
		dados.append(this.getPlanoS());
		dados.append(".");
		return dados.toString();
	} 
	
	
}
