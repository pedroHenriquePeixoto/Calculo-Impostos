package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Pessoa;
import entitites.Fisica;
import entitites.Juridica;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de pessoas: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Imposto #"+(i+1)+": ");
			System.out.print("Fisica ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if(ch == 'f') {
				System.out.print("Gastos com saude: ");
				double saude = sc.nextDouble();
				list.add(new Fisica(nome,renda,saude));
			}
			else if(ch == 'j') {
				System.out.print("Numero de funcionarios: ");
				int func = sc.nextInt();
				list.add(new Juridica(nome, renda, func));
			}
		}
		System.out.println();
		System.out.println("Taxas de Impostos: ");
		double total=0.0;
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getNome()+ ": $ "+ String.format("%.2f", pessoa.taxa()));
			total += pessoa.taxa();
		}
		System.out.println();
		System.out.print("TOTAL DAS TAXAS: $"+String.format("%.2f", total));
		
		sc.close();

	}


}
