package entidade.transportador;

import entidade.comum.Localizacao;

public class ParametroBuscaCarga {
	private int id;
	
	private long tamanho;
	
	private long peso;
	
	private Localizacao pontoInicial;
	
	private Localizacao pontoFinal;
	
	private long distancia;

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

	public long getDistancia() {
		return distancia;
	}

	public void setDistancia(long distancia) {
		this.distancia = distancia;
	}
}
