package exerciopackage;

import java.util.Collection;
import java.util.Date;

import exercício.LogSingleton;
import projeto_hotel.Hotel;
import projeto_hotel.IFachadaHotel;
import projeto_hotel.Quarto;

public class FachadaHotel implements IFachadaHotel{
	private RepositorioHotel respositorioHotel;
	private RepositorioQuarto respositorioQuarto;
	
	private static FachadaHotel instance;
	
	private  FachadaHotel() {
		// TODO Auto-generated constructor stub
	}
	
	public static FachadaHotel getInstance(){
		
		if(instance == null) {
			instance = new FachadaHotel();
		}
		
		
		return instance;
	}
	
	@Override
	public Hotel cadastrarHotel(String nome, String endereco, int cnpj) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Quarto cadastrarQuarto(int numeroQuarto, String tipoQuarto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void fazerReserva() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Float valorHospedagem(Hotel hotel, Quarto quarto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<Quarto> listarQuartoDisponiveis(Date checkIn, Date checkOut) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
