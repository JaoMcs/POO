
public class Diretor extends Chefe {
	private Data dtPromo;
	private double emprestimo;

	
	
	public double getEmprestimo() {
		return this.emprestimo;
	}
	
	public void setEmprestimo(double _emprestimo) {
		this.emprestimo = _emprestimo;
	}
	
	public Data getDtPromo() {      	
		return this.dtPromo;  	
	}
	public void setDtPromo(Data _dtPromo) {
		this.dtPromo = _dtPromo; 	
	}
	
	public Diretor (String _nome, Data _dtNasc, int _indentidade,
			Data _dtAdmi, int _salario, String _departamento, Data _dtPromo){
		
		this.setNome(_nome);
		this.setDtNasc(_dtNasc);
		this.setIndentidade(_indentidade);
		this.setDtAdmi(_dtAdmi);
		this.setSalario(_salario);
		this.setDepartamento(_departamento);
		this.setDtPromo(_dtPromo);
		
	}
		
	
	public Diretor() {
		
	}
	
	public void Emprestimo(double _valor) {
		
		this.setEmprestimo(1.5*super.getSalario());
		
	}

	public String toString(){
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		
		dados.append(" Data de promocao : ");
		dados.append(this.getDtPromo());
		dados.append(".");
		return dados.toString();
	}
	
	
}
