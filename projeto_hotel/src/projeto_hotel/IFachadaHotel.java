package projeto_hotel;

import java.util.Collection;
import java.util.Date;

public interface IFachadaHotel {
	
	public Hotel cadastrarHotel(String nome, String endereco, int cnpj);
	public Quarto cadastrarQuarto(int numeroQuarto, String tipoQuarto);
	public void fazerReserva();
	
	public Float valorHospedagem(Hotel hotel, Quarto quarto);
	public Collection<Quarto> listarQuartoDisponiveis(Date checkIn, Date checkOut);
	
}