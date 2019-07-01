
public class Chefe extends Funcionario {
	
	private String departamento;
	private double emprestimo;

	
	public double getEmprestimo() {
		return this.emprestimo;
	}
	
	public void setEmprestimo(double _emprestimo) {
		this.emprestimo = _emprestimo;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String _departamento){
		this.departamento = _departamento;
	}
	

	public Chefe (String _nome, Data _dtNasc, int _indentidade,
			Data _dtAdmi, int _salario, String _departamento){
		
		this.setNome(_nome);
		this.setDtNasc(_dtNasc);
		this.setIndentidade(_indentidade);
		this.setDtAdmi(_dtAdmi);
		this.setSalario(_salario);
		this.setDepartamento(_departamento);
		
	}
	public Chefe () {
		
	}
	
	//METODOS
	
	public void Emprestimo(double _valor) {
		
		this.setEmprestimo(2*super.getSalario());
		
	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		
		dados.append(" Departamento : ");
		dados.append(this.getDepartamento());
		dados.append(".");
		return dados.toString();
	} 
	
}
