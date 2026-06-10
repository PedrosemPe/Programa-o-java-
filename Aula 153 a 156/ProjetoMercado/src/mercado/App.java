package mercado;

public class App {

	public static void main(String[] args) {
		Item item1 = new Item();
		
		item1.setDescricao("Samsung Galaxy M55");
		item1.setpreco(1500.00);
		item1.setquantidade(56);
		
		System.out.println("Descrição: "+ item1.getDescricao());
		System.out.println("Preço: "+ item1.getPreco());
		System.out.println("Quantidade em estoque: "+ item1.getQuantidade());
		
		System.out.println();
		
		
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setnome("SAMSUNG LTDA");
		fornecedor1.settelefone("4002-8922");
		fornecedor1.setcidade("Lagoas");
		
		System.out.println("Nome fornecedor: "+fornecedor1.getNome());
		System.out.println("Telefone: "+fornecedor1.getTelefone());
		System.out.println("Cidade: "+fornecedor1.getCidade());

	}

}
