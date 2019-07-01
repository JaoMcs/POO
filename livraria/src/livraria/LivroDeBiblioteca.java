package livraria;

/*
private enum Status{
	EMPRESTADO, DEVOLVIDO, EMATRASO, EMMANUTENCAO;
}
*/

public class LivroDeBiblioteca extends Livro {
	
	public enum Status{
		EMPRESTADO, DEVOLVIDO, EMATRASO, EMMANUTENCAO;
	}
	
	
	public Status statusEmprestimo;
	
	private String locarizacao;
	private String descricao;
	
	public String getLocarizacao() {
		return this.locarizacao;
	}
	
	public void setLocarizacao(String _locarizacao) {
		this.locarizacao = _locarizacao;
	}
	
	public void setStatusEmprestimo(Status _statosemprestimo) {
		this.statusEmprestimo = _statosemprestimo;
	}
	
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	
	public Status isEmprestado() {
		return this.statusEmprestimo;
	}
	
	
	
	public void empresta() {
		this.statusEmprestimo = Status.EMPRESTADO;
	}
	
	public void desvolve() {
		this.statusEmprestimo = Status.DEVOLVIDO;
	}
	
	public String locariza() {
		return this.getLocarizacao();
	}
	
	public String apresentaDescricao() {
		return this.getDescricao();
	}
	
	
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(super.toString());
	//	dados.append(this.getStatusEmprestimo());
		dados.append("/");
		dados.append(this.getLocarizacao());
		dados.append("/");
		dados.append(this.getDescricao());
		dados.append("]");
		return dados.toString();
	} 
	
	
	
}
