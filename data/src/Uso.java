import java.util.Scanner;


public class Uso {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int d1,m1,a1;
		int i = 0,j=3;
		int quant;

		while(i < 4) {

			System.out.println("Digite a sua Data;");
			d1 = ler.nextInt();
			m1 = ler.nextInt();
			a1 = ler.nextInt();
			
			System.out.println("Digite o numero de vezes a ser incrementado:");
			quant = ler.nextInt();

			try {
				if(i < 4) {

					Data data3 = new Data(d1,m1,a1);

					Data data1 = new Data(4,"marco",1997);
					
					Data data2;
					data2 = new Data("1/3/1997");


					Uso.verificaData(data1,data3);
					
					if(data3.compareTo(data1) == 0) {
						System.out.println("data igual");
					}
					else if(data3.compareTo(data1) == 1) {
						System.out.println("data 1 é maior que data 2");
					}
					else {
						System.out.println("data 2 é maior que data 1");
					}

					//System.out.println(data1);
					//System.out.println(data2);
					System.out.println(data3);
					
					data3.incrementa();
					
					System.out.println(data3);
					
					data3.incrementaN(quant);
					
					System.out.println(data3);
					
					i=4;
					
				}

				else {
					Data data3 = new Data(1,1,1900);
					System.out.println(data3);
					break;
				}
			}
			catch(Exception e) {
				i ++;
			//	System.out.println(e);
				System.out.println("\nERRO: "+i+"x ");
				System.out.printf("\nVoce tem %d tentativas\n\n",j);
				j--;
				
			}
		}
	}

	public static void verificaData(Data d1, Data d2) {
		if (d1.equals(d2)) {
			System.out.println("rpz eh igual");
		}
		else
			System.out.println("rpz neh igual nao em");
	}

}

