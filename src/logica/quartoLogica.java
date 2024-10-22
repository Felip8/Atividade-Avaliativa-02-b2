package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import app.Main;
import objetos.Quarto;

public class quartoLogica {
	
	Scanner scan = new Scanner(System.in);
	static List<Quarto> listaDeQuarto = new ArrayList<Quarto>();
	
	public static void cadastroQuarto() {
		Quarto quarto = new Quarto();
		
		System.out.println("Número do quarto: ");
		quarto.setNumeroQuarto(Main.sc().nextInt());
		Main.sc().nextLine();
		
		System.out.println("Tipo de quarto: ");
		quarto.setTipoQuarto(Main.sc().nextLine());
		
		System.out.println("Preço diário: ");
		quarto.setPreco(Main.sc().nextDouble());
		
		quarto.setDisponibilidade(true);
		
		listaDeQuarto.add(quarto);
	}
	
	public static void ocuparQuarto(int numeroQuarto) {
		for (Quarto quarto : listaDeQuarto) {
			if(quarto.getNumeroQuarto() == numeroQuarto) {
				quarto.setDisponibilidade(false);
			}
		}
	}
	
	public static void desocuparQuarto(int numeroQuarto) {
		for (Quarto quarto : listaDeQuarto) {
			if(quarto.getNumeroQuarto() == numeroQuarto) {
				quarto.setDisponibilidade(true);
			}
		}
	}
	
	public static void listarQuarto() {
		if(listaDeQuarto.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			for (Quarto quarto : listaDeQuarto) {
				System.out.println(quarto.toString());
			}
		}
		
	}

}