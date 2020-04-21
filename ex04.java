package exercicios20_matriz;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][][] compromisso = new String[12][31][8];
		
		boolean sair = false;
		byte opcao;
		while (!sair) {

			System.out.println(" -------  AGENDA DE COMPROMISSOS -------- ");
			System.out.println("|Digite 1 para agendar um compromisso.   |");
			System.out.println("|Digite 2 para verificar um compromisso. |");
			System.out.println("|Digite 0 para sair.                     |");
			System.out.println(" ---------------------------------------- ");

			System.out.print("Digite sua opção: ");
			opcao = sc.nextByte();

			if (opcao == 1) { // adicionar compromisso

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) { // validar mes
					System.out.print("Entre com o mês: ");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) { // validar o dia
					System.out.print("Entre com o dia do mês: ");
					dia = sc.nextInt();
					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) { // validar hora
					System.out.print("Entre com a hora do compromisso: ");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente.");
					}
				}

				mes--;
				dia--;
				hora--;
				
				System.out.println("Digite o compromisso:");
				compromisso[mes][dia][hora] = sc.next();

			} else if (opcao == 2) { // verificar compromissos

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.print("Entre com o mês do compromisso: ");
					mes = sc.nextInt();

					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) { // validar dia
					System.out.print("Entre com o dia do mês: ");
					dia = sc.nextInt();

					if (dia > 0 && dia < 32) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) { // validar hora
					System.out.print("Entre com a hora do compromisso: ");
					hora = sc.nextInt();

					if (hora >= 0 && hora < 25) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente.");
					}
				}

				mes--;
				dia--;
				hora--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromisso[mes][dia][hora]);

			} else if (opcao == 0) { // sair
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente.");
			}
		}
		sc.close();
	}

}
