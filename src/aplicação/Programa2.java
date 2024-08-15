package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.GessoComun;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja fazer um orçamento para qual tipo de forro?");
		System.out.println("1 - Gesso comun");
		System.out.println("2 - Gesso acartonado");
		
		System.out.println("Sua escolha: ");
		int tipo = sc.nextInt();
		
		if (tipo == 1) {
			GessoComun comun = new GessoComun();
			
			System.out.println("Orçamento com o valor do material? s/n");
			char escolha = sc.next().charAt(0);
			
			if (escolha == 's' || escolha == 'S') {
				
			}
			
		}
		
		
		sc.close();

	}

}
