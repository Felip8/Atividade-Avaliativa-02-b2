package objetos;

import java.time.LocalDate;

public class Reserva {
	
	private String nomeHospede;
	private LocalDate checkin;
	private LocalDate checkout;
	private int idQuarto;
	private boolean disponibilidade;
	private int id;
	

	public Reserva() {
		
	}
	
	public Reserva(String nomeHospede, LocalDate checkin,LocalDate checkout, int idQuarto) {
		this.nomeHospede = nomeHospede;
		this.checkin = checkin;
		this.checkout = checkout;
		this.idQuarto = idQuarto;
	}
	

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	public int getId() {
		return id;
	}

	public void setId(int reserva) {
		this.id = reserva;
	}
	
	public String getNomeHospede() {
		return nomeHospede;
	}
	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}
	public LocalDate getCheck() {
		return checkin;
	}
	public void setCheck(LocalDate check) {
		this.checkin = check;
	}
	public int getidQuarto() {
		return idQuarto;
	}
	public void setidQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	public boolean disponibilidade() {
		return disponibilidade;
	}

	public void setdisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Nome:" + nomeHospede + "| check:" + checkin + "| Número do quarto:" + idQuarto;
	}

	
	
}