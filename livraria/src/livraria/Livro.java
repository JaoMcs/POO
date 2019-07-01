package livraria;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;
	
	
	public Livro() {
		
	}
	
	public Livro(String _titulo, String _autor, int _numeropaginas, int _anoedicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeropaginas);
		this.setAnoEdicao(_anoedicao);
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String _autor) {
		this.autor = _autor;
	}
	
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public void setNumeroPaginas(int _numeropaginas) {
		this.numeroPaginas = _numeropaginas;
	}
	
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	
	public void setAnoEdicao(int _anoedicao) {
		this.anoEdicao = _anoedicao;
	}
	
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(this.getTitulo());
		dados.append("/");
		dados.append(this.getAutor());
		dados.append("/");
		dados.append(this.getNumeroPaginas());
		dados.append("/");
		dados.append(this.getAnoEdicao());
		dados.append("]");
		return dados.toString();
	}  

	
}
