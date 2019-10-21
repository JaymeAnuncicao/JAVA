package yugioh;

public class Aluno {

	private String nome;
	private String matricula;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno)obj;
		return (matricula.equals(a.matricula));
	}
	
	@Override
	public String toString() {
		return "Aluno: {Nome: "+nome+", Matricula: "+matricula+"}";
	}
	
	
}
