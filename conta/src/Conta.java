
public class Conta {
	private String nome;
	private double saldo;
	private static double taxaJuros;
	
	// interface / gets e sets
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public double getTaxa() {
		return this.taxaJuros;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public void setSaldo(double _saldo) {
		this.saldo = _saldo;
	}
	
	//olhar isso dps
	public void setConta(String _nome, double _saldo) throws Exception {
		if(_saldo > 0 ) {
			this.setSaldo(_saldo);
			this.setNome(_nome);	
		}
		else {
			throw new Exception("ERRO: Saldo invalido");
		}
		
		
	}
	
	public int compareTo(Conta _conta) {

		return this.getNome().compareTo(_conta.getNome());	
	}
	
	
	public boolean equals(Object objeto) {

		Conta aux = (Conta) objeto;

		if(this.getNome().equals(aux.getNome()) &&
				this.getSaldo() == aux.getSaldo()) 
			return true;

		else 
			return false;

	} 
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(this.getNome());
		dados.append(", saldo: ");
		dados.append(this.getSaldo());
		dados.append("Sua taixa foi: ");
		dados.append(this.getTaxa());
		dados.append("]");
		return dados.toString();
	}  
	
	
}
