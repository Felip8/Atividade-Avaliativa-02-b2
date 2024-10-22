package logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import objetos.Quarto;
import objetos.Reserva;

public class reservaLogica {
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static Quarto quarto = new Quarto();
	static List<Reserva> listaDeReserva = new ArrayList<Reserva>();
	static Reserva reserva = new Reserva();
	
	public static void cadastroReserva() {
		
		int id = listaDeReserva.size() + 1;
        int numeroQuarto;
        reserva.setId(id);
        String hospede;
        LocalDate check_in;
        Quarto quarto;
		
		System.out.println("Nome do hóspede: ");
		reserva.setNomeHospede(app.Main.sc().nextLine());
		
		System.out.println("Data de check-in [dd/MM/yyyy]");
	    check_in = LocalDate.parse(app.Main.sc().nextLine(), dtf);
	    
	    System.out.println("Número do quarto:");
		numeroQuarto = app.Main.sc().nextInt();
		reserva.setidQuarto(numeroQuarto);
		quartoLogica.ocuparQuarto(numeroQuarto);
		
		listaDeReserva.add(reserva);
		
	}
	
	public static void listarReserva() {
		if(listaDeReserva.isEmpty()) {
			System.out.println("Lista vazia");
		}
		for (Reserva reserva : listaDeReserva) {
			System.out.println(reserva.toString());
		}
	}
	
	public static void listarHistoricoReserva() {
	   if(listaDeReserva.isEmpty()) {
		   System.out.println("Lista vazia");
	   }else {
		   for (Reserva reserva : listaDeReserva) {
			System.out.println(reserva.toString());
		}
	   }
	}
	
	public static void finalizarReserva(int id) {
		if(reserva.getId() == id) {
		    quarto.setDisponibilidade(true);
		    System.out.println("Check-out feito com sucesso!");
		}
		
	    
	}
}