package entidade.transportador;

import java.util.Date;

import entidade.cliente.Carga;

public class Proposta {
	private int id;
	
	private double valor;
	
	private Date data;
	
	private boolean aceita;
	
	private String obs;
	
	private Carga carga;
	
	private int idTransportador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isAceita() {
		return aceita;
	}

	public void setAceita(boolean aceita) {
		this.aceita = aceita;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}
	
	public int getIdTransportador() {
		return idTransportador;
	}

	public void setIdTransportador(int idTransportador) {
		this.idTransportador = idTransportador;
	}
}
