package loja;

public class Cliente {
	private String nome;
	private int idade;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) {
			this.idade = novaIdade;
		} else {
			System.out.println("Idade inválida!");
		}
	}
	
	
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail(String novoEmail) {
		if (novoEmail != null && !novoEmail.isBlank()) {
			this.email = novoEmail;
		} else {
			System.out.println("Email vazio.");
		}
	}
}
