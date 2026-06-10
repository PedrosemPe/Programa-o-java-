package loja;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
	
	public double getPreco() {
		return preco;
	}
	
	public void setpreco(double novoPreco) {
		if (novoPreco > 0) {
			this.preco = novoPreco;
		} else {
			System.out.println("Preço inválido!");
		}
	}
	
	
	
	public int QuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setquantidadeEstoque (int novaQuantidadeEstoque) {
		if (novaQuantidadeEstoque >= 0) {
			this.quantidadeEstoque = novaQuantidadeEstoque;
		} else {
			System.out.println("Estoque inválido!");
		}
	}
}
