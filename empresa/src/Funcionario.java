public class Funcionario extends Pessoa{

	private Data dtAdmi;
	private double salario;
	
	
	public void setEmprestimo() {
		super.setEmprestimo(this.getSalario());
	}
	
	public double getSalario() {      	
		return this.salario;  	
	}
	public void setSalario(double _salario) {
		this.salario = _salario; 	
	}

	public Data getDtAdmi(){
		return this.dtAdmi;
	}
	public void setDtAdmi(Data _dtAdmi){
		this.dtAdmi = _dtAdmi;
	}


	public Funcionario (){

	}


	public Funcionario (String _nome, Data _dtNasc, int _indentidade,
			Data _dtAdmi, double _salario){

		this.setNome(_nome);
		this.setDtNasc(_dtNasc);
		this.setIndentidade(_indentidade);
		this.setDtAdmi(_dtAdmi);
		this.setSalario(_salario);

	}
	
	public void ReajusteSalario(double _taxa) {
		
		this.setSalario(this.getSalario()*_taxa);
		
	}
	
	public void Emprestimo() {
		
		this.setEmprestimo(this.getSalario());
		
	}

	public String toString(){
		StringBuilder dados = new StringBuilder();

		dados.append(super.toString());

		dados.append(" Salario : R$");
		dados.append(this.getSalario());
		dados.append(" Data que foi Admitido: ");
		dados.append(this.getDtAdmi());
		dados.append(".");
		return dados.toString();
	} 
	
}
