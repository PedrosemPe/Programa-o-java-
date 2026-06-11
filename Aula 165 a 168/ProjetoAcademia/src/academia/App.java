package academia;

public class App {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Pedro");
		aluno1.setIdade(16);
		aluno1.setPlano("Mensal");

		aluno1.exibirAluno();

		Instrutor instrutor1 = new Instrutor();
		instrutor1.setNome("Pelé");
		instrutor1.setIdade(17);
		instrutor1.setEspecialidade("Educação Física");

		instrutor1.exibirInstrutor();

	}

}
