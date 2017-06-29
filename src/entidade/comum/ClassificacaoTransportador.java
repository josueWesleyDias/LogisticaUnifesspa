package entidade.comum;

public class ClassificacaoTransportador {
	private int id;
	
	private float nota;
	
	private int idUsuario;
	
	private int idTransportador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdTransportador() {
		return idTransportador;
	}

	public void setIdTransportador(int idTransportador) {
		this.idTransportador = idTransportador;
	}
}
