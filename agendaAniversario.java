package exercicios20_matriz;

import java.util.Scanner;

public class agendaAniversario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][][] aniversarios = new String[31][12][2021];

		boolean sair = false;
		byte opcao;

		while (!sair) {

			System.out.println(" ------- Menu Aniversários --------");
			System.out.println("| 1- Para inserir um aniversário   | ");
			System.out.println("| 2- Para verificar um aniversário | ");
			System.out.println("| 0- Para sair do menu             | ");
			System.out.println(" ----------------------------------");
			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextByte();

			if (opcao == 1) { // inserir aniversários

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.print("Entre com o dia do aniversário: ");
					dia = sc.nextInt();
					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.print("Entre com o mês do aniversário: ");
					mes = sc.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}

				boolean anoValido = false;
				int ano = 0;
				while (!anoValido) {
					System.out.print("Entre com o ano do aniversário: ");
					ano = sc.nextInt();
					if (ano > 1900 && ano < 2021) {
						anoValido = true;
					} else {
						System.out.println("Ano inválido, digite novamente.");
					}
				}
				System.out.print(dia + "/" + mes + "/" + ano + " é o aniversário de: ");
				aniversarios[dia][mes][ano] = sc.next();

			} else if (opcao == 2) { // verificar um aniversário
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.print("Entre com o dia do aniversário: ");
					dia = sc.nextInt();
					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.print("Entre com o mês do aniversário: ");
					mes = sc.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}

				boolean anoValido = false;
				int ano = 0;
				while (!anoValido) {
					System.out.print("Entre com o ano do aniversário: ");
					ano = sc.nextInt();
					if (ano > 1900 && ano < 2021) {
						anoValido = true;
					} else {
						System.out.println("Ano inválido, digite novamente.");
					}
				}
				System.out.println(dia + "/" + mes + "/" + ano + " é o aniversário de: ");
				System.out.println(aniversarios[dia][mes][ano]);

			} else if (opcao == 0) { // sair do programa
				sair = true;
			}

		}

		sc.close();
	}
}
