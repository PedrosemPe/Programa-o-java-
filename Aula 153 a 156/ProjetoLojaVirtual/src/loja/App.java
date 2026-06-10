package loja;

public class App {

	public static void main(String[] args) {
		 Produto produto1 = new Produto();
		 
		 produto1.setNome("Notebook");
		 produto1.setpreco(10);
		 produto1.setquantidadeEstoque(100);
		 
		 System.out.println("Nome: "+ produto1.getNome());
		 System.out.println("Preço: "+ produto1.getPreco());
		 System.out.println("Quantidade em estoque: "+ produto1.QuantidadeEstoque());
		 
		 System.out.println();
		 
		 
		 Cliente cliente1 = new Cliente();
		 
		 cliente1.setNome("Isac");
		 cliente1.setIdade(17);
		 cliente1.setEmail("Isacpegoodesouza@gmail.com");
		 
		 
		 System.out.println("Nome: "+ cliente1.getNome());
		 System.out.println("Idade: "+ cliente1.getIdade());
		 System.out.println("Email: "+ cliente1.getEmail());
		 

	}

}
