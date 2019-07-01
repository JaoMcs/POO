import java.util.*;


public class uso {

	public static void main(String args[]) {
		String nome;
		int i = 0;
		Set <String> tree = new TreeSet <String> ();

		Scanner scan = new Scanner(System.in);

		while(i!=2) {

			System.out.println("Digite o nome que sera inserido");

			tree.add(nome = new Scanner(System.in).next());
			
			System.out.println("Deseja adicionar mais um nome?\n1)Sim\n2)Nao");
			i = new Scanner(System.in).nextInt();


		}
		System.out.println(tree);




	}	
}
