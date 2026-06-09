package programaCarro;

public class AppCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.marca = "Ferrari";
		carro1.placa = "AXC-093";
		carro1.cor = "Preto";
		carro1.ano = 2020;
		
		carro1.mostrarCarro();
	}

}
