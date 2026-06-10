package mercado;

public class Item {
	
	private String descricao;
	private double preco;
	private int quantidade;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String novaDescricao) {
		if (novaDescricao != null && !novaDescricao.isBlank()) {
			this.descricao = novaDescricao;
		} else {
			System.out.println("Descrição vazia.");
		}
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
	
	
	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setquantidade (int novaQuantidade) {
		if (novaQuantidade >= 0) {
			this.quantidade = novaQuantidade;
		} else {
			System.out.println("Estoque inválido!");
		}
	}
	
	

}
