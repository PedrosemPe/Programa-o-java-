package clinica;

public class App {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Pelé");
		paciente1.setIdade(17);
		paciente1.setpeso(53.500);
		
		System.out.println("Nome do paciente: "+ paciente1.getNome());
		System.out.println("Idade do paciente: "+ paciente1.getIdade());
		System.out.println("Peso do paciente: "+ paciente1.getPeso());
		
		System.out.println();
		
		Medico medico1 = new Medico ();
		
		medico1.setNome("Paulo Astolfo");
		medico1.setEspecialidade("Infectologista");
		medico1.setValorConsulta(500.00);
		
		System.out.println("Nome do médico: "+ medico1.getNome());
		System.out.println("Especialidade: "+ medico1.getEspecialidade());
		System.out.println("Valor da consulta: R$"+ medico1.getValorConsulta());

	}

}
