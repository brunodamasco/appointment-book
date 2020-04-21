package exercicios20_matriz;

import java.util.Scanner;

public class agendaAniversario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][][] aniversarios = new String[31][12][2021];

		boolean sair = false;
		byte opcao;

		while (!sair) {

			System.out.println(" ------- Menu Anivers�rios --------");
			System.out.println("| 1- Para inserir um anivers�rio   | ");
			System.out.println("| 2- Para verificar um anivers�rio | ");
			System.out.println("| 0- Para sair do menu             | ");
			System.out.println(" ----------------------------------");
			System.out.print("Digite a op��o desejada: ");
			opcao = sc.nextByte();

			if (opcao == 1) { // inserir anivers�rios

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.print("Entre com o dia do anivers�rio: ");
					dia = sc.nextInt();
					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente.");
					}
				}

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.print("Entre com o m�s do anivers�rio: ");
					mes = sc.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente.");
					}
				}

				boolean anoValido = false;
				int ano = 0;
				while (!anoValido) {
					System.out.print("Entre com o ano do anivers�rio: ");
					ano = sc.nextInt();
					if (ano > 1900 && ano < 2021) {
						anoValido = true;
					} else {
						System.out.println("Ano inv�lido, digite novamente.");
					}
				}
				System.out.print(dia + "/" + mes + "/" + ano + " � o anivers�rio de: ");
				aniversarios[dia][mes][ano] = sc.next();

			} else if (opcao == 2) { // verificar um anivers�rio
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.print("Entre com o dia do anivers�rio: ");
					dia = sc.nextInt();
					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente.");
					}
				}

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.print("Entre com o m�s do anivers�rio: ");
					mes = sc.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente.");
					}
				}

				boolean anoValido = false;
				int ano = 0;
				while (!anoValido) {
					System.out.print("Entre com o ano do anivers�rio: ");
					ano = sc.nextInt();
					if (ano > 1900 && ano < 2021) {
						anoValido = true;
					} else {
						System.out.println("Ano inv�lido, digite novamente.");
					}
				}
				System.out.println(dia + "/" + mes + "/" + ano + " � o anivers�rio de: ");
				System.out.println(aniversarios[dia][mes][ano]);

			} else if (opcao == 0) { // sair do programa
				sair = true;
			}

		}

		sc.close();
	}
}
