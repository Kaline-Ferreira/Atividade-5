package app;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {
	
	private String nome;
	private String endereco;
	
	@SuppressWarnings("unused")
	private List<Pessoas> pessoa = new ArrayList<>(100);
	
	
	public Pessoas(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}


	public Pessoas(String nome2) {
	
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	

}
