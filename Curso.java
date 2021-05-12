package app;

public class Curso extends Pessoas {
	
	private String nome;
	public Object professor;
	

	public Curso(String nome) {
		super(nome);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


}


