package entidade.cliente;

import java.util.Date;

import entidade.comum.Localizacao;

public class Carga {
	private int id;
	
	private long tamanho;
	
	private long peso;
	
	private Localizacao pontoInicial;
	
	private Localizacao pontoFinal;
	
	private Date dataInicial;
	
	private String obs;
	
	private int idUsuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTamanho() {
		return tamanho;
	}

	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}

	public Localizacao getPontoInicial() {
		return pontoInicial;
	}

	public void setPontoInicial(Localizacao pontoInicial) {
		this.pontoInicial = pontoInicial;
	}

	public Localizacao getPontoFinal() {
		return pontoFinal;
	}

	public void setPontoFinal(Localizacao pontoFinal) {
		this.pontoFinal = pontoFinal;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
