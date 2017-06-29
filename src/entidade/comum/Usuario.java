package entidade.comum;

public class Usuario {
	private int id;
	
	private String nome;
	
	private String senha;
	
	private String login;
	
	private long cpfCcnpj;
	
	private int idEndereco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public long getCpfCcnpj() {
		return cpfCcnpj;
	}

	public void setCpfCcnpj(long cpfCcnpj) {
		this.cpfCcnpj = cpfCcnpj;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
}
