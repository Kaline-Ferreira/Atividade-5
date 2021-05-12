	package app;
	
	public class Estudante extends Pessoas {
		
		@SuppressWarnings("unused")
		private int numCurso;
		@SuppressWarnings("unused")
		private String cursos;
		private int notas;
		
		public Estudante(String nome, String endereco) {
			super(nome, endereco);
			
		}
		
		public boolean addCursoNota(String curso, int nota) {
			if(this.notas == nota) {
				System.out.println("Nota adicionada! ");
				return true;
			}else {
				
				return false;
			}
			
		}
		
		public void imprimirNotas(double i) {
			
			System.out.println("A Nota é: " + this.notas);

			}
		
		
		public boolean getNotaMedia(double media) {
			if(media >=7) {
				return true;
			}else {
				return false;
			}
			
		}
		
	}
