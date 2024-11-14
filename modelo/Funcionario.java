package modelo;
import java.time.LocalDate;
import java.io.Serializable;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	public int id;
	public String nome;
	private String funcao;
	private LocalDate dataAdmissao;

	public Funcionario(int id, String nome, String funcao, LocalDate dataAdmissao) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "\n------Funcionario-----" +
				"\n id = " + id +
				"\n n nome = " + nome +
				"\n funcao = " + funcao +
				"\n dataAdmissao = " + dataAdmissao;
	}
}
