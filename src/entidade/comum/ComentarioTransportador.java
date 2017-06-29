package entidade.comum;

public class ComentarioTransportador {
	private int id;
	
	private int idUsuario;
	
	private int idTransportador;
	
	private ComentarioTransportador comentario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ComentarioTransportador getComentario() {
		return comentario;
	}

	public void setComentario(ComentarioTransportador comentario) {
		this.comentario = comentario;
	}
}
