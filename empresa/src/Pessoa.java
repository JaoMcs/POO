public class Pessoa{
	private String nome;
	private int indentidade;
	private Data dtNasc;
	private final static double EMPRESTIMO = 1000;
	private double emprestimo = EMPRESTIMO;


	
	// Interface basicos
	public int getIndentidade() {      	
		return this.indentidade;  	
	}
	public void setIndentidade(int _id) {
		this.indentidade = _id; 	
	}
	
	
	public void setEmprestimo(double _valor) {
		this.emprestimo = _valor;
	}
	
	public double getEmprestimo() {
		return this.emprestimo;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String _nome){
		this.nome = _nome;
	}


	public Data getDtNasc(){
		return this.dtNasc;
	}
	public void setDtNasc(Data _dataNasc){
		this.dtNasc = _dataNasc;
	}


	//Construtores Basicos

	public Pessoa (){

	}

	public Pessoa(String _nome, int _dia, int _mes, int _ano, int _indentidade )throws Exception{
		this.setNome(_nome);
		this.dtNasc = new Data(_dia, _mes, _ano);
		this.setIndentidade(_indentidade);
	}


	public Pessoa (String _nome, Data _dtNasc, int _indentidade ){
		this.setNome(_nome);
		this.setDtNasc(_dtNasc);
		this.setIndentidade(_indentidade);
	}
	
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("; Indentidade: ");
		dados.append(this.getIndentidade());
		dados.append("; Data de Nascimento: ");
		dados.append(this.getDtNasc());
		dados.append(" .");
		return dados.toString();
	} 

}