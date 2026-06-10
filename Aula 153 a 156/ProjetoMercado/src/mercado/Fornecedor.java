package mercado;

public class Fornecedor {

	private String nome;
	private String telefone;
	private String cidade;
	
	public String getNome () {
		return nome;
	}
	
	public void setnome(String novoNome) {
		if (novoNome != null && !novoNome.isBlank()) {
			this.nome = novoNome;
		} else {
			System.out.println("Nome vazio.");
		}
	}
	
	
	
	
	public String getTelefone () {
		return telefone;
	}
	
	public void settelefone(String novoTelefone) {
		if (novoTelefone != null && !novoTelefone.isBlank()) {
			this.telefone = novoTelefone;
		} else {
			System.out.println("Telefone vazio.");
		}
	}
	
	
	
	
	public String getCidade () {
		return cidade;
	}
	
	public void setcidade(String novaCidade) {
		if (novaCidade != null && !novaCidade.isBlank()) {
			this.cidade = novaCidade;
		} else {
			System.out.println("Cidade vazia.");
		}
	}
	
}
