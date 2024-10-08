package entidades;

public class Cliente {
	
	private String nome;
	private String email;
	private String numero;
	
	//List<Orçamento> orçamentos = new ArrayList<>();
	
	public Cliente() {
	}

	public Cliente(String nome, String email, String numero) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Nome do cliente: " + nome
				+ "\nEmail para contato: " + email
				+ "\nNumero para contato: " + numero;
	}

	
}
