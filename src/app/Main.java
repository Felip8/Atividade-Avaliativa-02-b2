package app;

import java.util.Scanner;


public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int op1;
		do {
			System.out.println("\n***SISTEMA DE GERENCIAMENTO DE HOTEL***");
			System.out.println("[1]Quartos | [2]Reserva | [0]Sair");
			op1 = app.Main.sc().nextInt();
			app.Main.sc().nextLine();
			switch (op1) {
			case 1:
				int op2;
				do {
					System.out.println("[1]Cadastrar quarto | [2]Listar quarto | [3]Voltar");
					op2 = app.Main.sc().nextInt();
					app.Main.sc().nextLine();
					switch (op2) {	
					case 1:
						logica.quartoLogica.cadastroQuarto();
						break;
					case 2:
						logica.quartoLogica.listarQuarto();
						break;
					case 3:
						break;
					default:
						System.out.println("Opção inválida. Tente novamente.");
						break;
					}
				} while (op2 != 3); 
				break;

			case 2:
				int op3;
				do {
					System.out.println("[1]Cadastrar reserva | [2]Listar reserva | [3]Listar Histórico de reserva | [4]Finalizar reserva | [0]Voltar");
					op3 = app.Main.sc().nextInt();
					app.Main.sc().nextLine();
					switch (op3) {	
					case 1:
						System.out.println("\n***QUARTOS DISPONÍVEIS:***\n");
						logica.quartoLogica.listarQuarto();
						logica.reservaLogica.cadastroReserva();
						break;
					case 2:
						logica.reservaLogica.listarReserva();
						break;
					case 3:
						logica.reservaLogica.listarHistoricoReserva();
						break;
					case 4:
						System.out.println("Insira o ID da reserva a ser finalizada: ");
						int idReserva = app.Main.sc().nextInt();
						app.Main.sc().nextLine();
						logica.reservaLogica.finalizarReserva(idReserva);
						break;
					case 0:
						break; 
					default:
						System.out.println("Opção inválida. Tente novamente.");
						break;
					}
				} while (op3 != 0); 
				break; 

			case 0:
				System.out.println("Sistema finalizado!");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (op1 != 0);
		
	}

	public static Scanner sc() {
		return scan;
	}
}