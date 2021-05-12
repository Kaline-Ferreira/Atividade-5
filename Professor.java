package app;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoas{
	
	@SuppressWarnings("unused")
	private int numCursos;
	@SuppressWarnings("unused")
	private String cursos;
	
	List<Curso> curso = new ArrayList<>();
	
	public Professor(String nome, String endereco, int numCursos) {
		super(nome, endereco);
		
	}
	

	@SuppressWarnings("unchecked")
	public boolean addCurso(Curso curso) {
		this.curso.add(curso);
		return ((List<Curso>) curso.professor) != null;
		
		}

	
	public boolean removeCurso(String curso) {
		
			  return true;
	}

	public String toString() {
		return getNome();
	
	
	}
}
