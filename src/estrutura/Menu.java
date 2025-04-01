package estrutura;

import java.util.Scanner;

public class Menu {
	
	/* Menu de lanchonete segue os itens
	item 1 - Cachorro quente R$4.00
	item 2 - X salada R$4.50
	item 3 - X bacon R$5.00
	item 4 - Torrada simples R$ 2.00
	item 5 - Refrigerante R$1.50 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int item = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if(item == 1) {
			total = quantidade * 4.0;
			
		}
		else if(item == 2) {
			total = quantidade * 4.5;
			
		}
		else if(item == 3) {
			total = quantidade * 5.0;
			
		}
		else if(item == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade *1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		sc.close();
	}

}
