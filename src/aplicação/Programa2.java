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
			System.out.println("Orçamento com o valor do material? s/n");
			char escolha = sc.next().charAt(0);
			
			if (escolha == 's' || escolha == 'S') {
				char novoOrçamento = 's';
				
				while (novoOrçamento == 's' || novoOrçamento == 'S') {
					System.out.println("Digite os dados do serviço:");
					System.out.print("Valor do metro: ");
					double valorMetro = sc.nextDouble();
					
					System.out.print("Largura do ambiente: ");
					double largura = sc.nextDouble();
					
					System.out.print("Comprimento do ambiente: ");
					double comprimento = sc.nextDouble();
					
					System.out.print("Nivel do forro (Distancia da laje até altura desejada): ");
					double nivelDoForro = sc.nextDouble();
					
					System.out.print("Quantas placas de gesso?: ");
					int placasDeGesso = sc.nextInt();
					
					System.out.print("Quantos sacos de gesso?: ");
					int sacosDeGesso = sc.nextInt();
					
					System.out.print("Quantos kilos inteiros de sisal?: ");
					int sisal = sc.nextInt();
					
					System.out.print("Qantos sacos de cola?: ");
					int gessoCola = sc.nextInt();
					
					System.out.print("Quantos rolos de arame?: ");
					int arame = sc.nextInt();
					
					System.out.print("Quantos pacotes de pitao?: 1");
					int pitao = sc.nextInt();
					
					double metrosDeNegativo = largura * 2 + comprimento * 2;
					
					GessoComun comun = new GessoComun(valorMetro, largura, comprimento, nivelDoForro, placasDeGesso, sacosDeGesso, sisal, gessoCola,
							arame, pitao, metrosDeNegativo );

					double area = comun.areaDeForro();
					
					System.out.println(area);
					
					System.out.println("Deseja fazer o orçamento de outro ambiente? s/n");
					novoOrçamento = sc.next().charAt(0);
				}
			}
			
		}
		
		
		sc.close();

	}

}
