import java.util.*;



public class uso_1 {
	public static void main(String args[]) {
		Set <String> tree = new TreeSet <String> ();
		
		Set <Integer> arvorerandom = new TreeSet <Integer> ();

		
		Map <String,Integer> m = new HashMap <String,Integer> ();
		
		List<String> x = new LinkedList<String>();

		Random random = new Random();
				
		String texto = ("alo eu gosto de poo ( mentira nem gosto ) alo alo"
				+ " alo entendeu de alguma coisa");	

		String []vet = texto.split(" ");

		Integer frequencia;
		
		
		int i = 0;

		while(i != vet.length) {
			
			if(m.containsKey(vet[i])) {
			    frequencia = m.get(vet[i]);
				m.put(vet[i],frequencia+1);
			}
			else {
				
				m.put(vet[i],1);
			}
			
	
			System.out.printf("%s, ",vet[i]);
			
			arvorerandom.add(random.nextInt(50));
			x.add(vet[i]);
			tree.add(vet[i]);
			i++;
		}
		
		Collections.shuffle(x);

		
		// ordem alfabetica
		System.out.println("Arvore: " + tree);
		
		// Frequencia de Paalavras
		System.out.println("Tabela :"+ m);
		
		//Random
		System.out.println("Lista: "+ x);
		
		//Numeros aleatorios
		System.out.println("\nAleatorios : " + arvorerandom);

		


	}
}
