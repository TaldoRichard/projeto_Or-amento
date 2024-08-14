package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite os dados do cliente: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Numero: ");
		String numero = sc.next();
		
		Cliente cliente = new Cliente(nome, email, numero);

		System.out.println();
		System.out.println("Dados do cliente: ");
		System.out.println(cliente.toString());
		
		sc.close();

	}

}
