package objetos;

public class Quarto {
	
	private int numeroQuarto;
	private String tipoQuarto;
	private double preco;
	private boolean disponibilidade;
	
	public Quarto() {
		
	}
	
	public Quarto(int numeroQuarto, String tipoQuarto, double preco, boolean disponibilidade) {
		this.numeroQuarto = numeroQuarto;
		this.tipoQuarto = tipoQuarto;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public String getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Quarto:" + numeroQuarto + "|tipoQuarto: " + tipoQuarto + "|preco: " + preco
				+ "|disponibilidade: " + disponibilidade;
	}
	
	

}