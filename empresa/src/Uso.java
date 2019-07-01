import java.util.Scanner;

public class Uso {

	public static void main(String args[]) {

	//	String scan2 = new Scanner(System.in);//.hasNextLine();
		Scanner scan = new Scanner(System.in);

		double _taxa = 1.5;
		int i = 10, j=10;

		int escolha, escolha2;


		while( escolha != 0) {

			System.out.println("Voce Deseja cadastrar pessoas? ");
			System.out.println("1) sim"+"2) nao");
			escolha = scan.nextInt();

			switch(escolha) {
			case 1:

				while( i != 0 ) {

					System.out.println("Qual o tipo que deseja cadastrar?");
					System.out.println("1) Funcionario"+"2) Chefe"+"3) Diretor"+"0) Sair");
					escolha2 = scan.nextInt();

					switch (escolha2) {
						
					case 1:
						try {
							String nome;
							int indentidade;
							
							
							System.out.println("Nome: ");
							nome = new Scanner(System.in).next();
							System.out.println("Identidade: ");
							identidade = new Scanner(System.in).next();
							System.out.println("Data nascimento (dd/mm/aaaa): ");
							dtNascStr = new Scanner(System.in).next();
							System.out.println("Data admissao: ");
							dtAdmStr = new Scanner(System.in).next();
							System.out.println("Salario: ");
							salario = new Scanner(System.in).nextDouble();
							vetor[i] = new Funcionario(nome, identidade, dtNascStr, dtAdmStr, salario);
							
							
							/*
							
							Data data1 = new Data (1,1,2002);
							System.out.println(data1);
	
							Pessoa pessoa1 = new Pessoa("Roberto",10,10,2010,42);		
							System.out.println(pessoa1);
	
							Chefe chefe1 = new Chefe ("Roberto the boss",data1,20201990,data1,10000,"RH");
							System.out.println(chefe1);
	
							chefe1.ReajusteSalario(_taxa);
	
							System.out.println(chefe1);
	
							Paciente_de_clínica paciente1 = new Paciente_de_clínica ("Roberto", data1, 202020, "basico");
							System.out.println(paciente1); */
	
						}
						catch(Exception e) {
							System.out.println(e);
						}
					}
				}

				break;
			case 2:
				escolha = 0;

				break;

			}




		}
	}


}
