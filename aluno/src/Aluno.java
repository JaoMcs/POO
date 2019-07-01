public class Aluno {
	private String nome;
	private double nota1, nota2, media, pontos;
	private final static double LIMITESUPERIOTDEFAULT = 10;
	private static double limiteSuperior = Aluno.LIMITESUPERIOTDEFAULT;
	
	
	
	// quatro construtores sobrecarregados
	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2, double _pontos)  {
		this("sem nome", _nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2)  {
		this(_nota1, _nota2, 0.0);
	}
	public Aluno() {
		this(0.0,0.0);
	}

	// métodos de interface para acesso aos campos privados
	public String getNome() {      	
		return this.nome;     
	}
	public void setNome(String _nome) {
		this.nome = _nome; 	
	}
	public double getNota1() {
		return this.nota1; 	
	}
	public double getNota2() {
		return this.nota2; 	
	}
	public double getMedia() {
		return this.media; 	
	}
	public double getPontos()  {
		return this.pontos;	
	}
	public void setPontos(double _pontos) {
		this.pontos = _pontos;
		this.calculaMedia(10);
	}

	public static void setLimiteSup(double _limSup) {
		Aluno.limiteSuperior = _limSup;
	}
	
	public static double getLimiteSup() {
		return Aluno.limiteSuperior;
	}
	
	
	public boolean setNotas(double _nota1, double _nota2, double _pontos) {
		this.pontos = _pontos;
		if(_nota1>=0 && _nota1<=Aluno.limiteSuperior && _nota2>=0 && _nota2<=Aluno.limiteSuperior) {
			this.nota1 = _nota1;
			this.nota2 = _nota2;
			this.calculaMedia(10);
			return true;
		}
		else
			return false;
	}

	public void setNotas(double _nota1, double _nota2) {
		this.setNotas(_nota1, _nota2, 0);
	}

	// método para calcular a média. Privado pois o uso é apenas interno a classe
	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
		return this.media;
	}
	
	// método para verificar se a determinada nota passou o limite
	public boolean calculaLimite(double _nota) {
		if(_nota <= Aluno.limiteSuperior) {
			return true;
		}
		else
			return false;
	}

	// sobrecarregamento do cálculo da média para limitar o valor máximo
	private double calculaMedia(int _limite) {
		this.calculaMedia();
		if(this.media > _limite)
			this.media = _limite;
		return this.media;
	}

	public boolean equals(Object objeto) {
		
		Aluno aux = (Aluno)objeto;
		
		if (this.getNome().equals(aux.getNome()) &&
				this.getNota1() == aux.getNota1() &&
				this.getNota2() == aux.getNota2() &&
				this.getPontos() == aux.getPontos())
			return true;
		return false;
	} 

	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(this.getNome());
		dados.append(";");
		dados.append(this.getNota1());
		dados.append(";");
		dados.append(this.getNota2());
		dados.append(";");
		dados.append(this.getPontos());
		dados.append(";");
		dados.append(this.getMedia());
		return dados.toString();
	}  

}
