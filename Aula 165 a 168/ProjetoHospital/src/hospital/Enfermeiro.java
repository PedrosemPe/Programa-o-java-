package hospital;

public class Enfermeiro extends Profissional {
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if (setor != null && !setor.isBlank()) {
			this.setor = setor;
		} else {
			System.out.println("Setor inválido");
		}
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Setor: " +getSetor());
	}

}
