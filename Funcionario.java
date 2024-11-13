public class Funcionario {
	public int id;
	public String nome;
	private String funcao;
	private int[] dataAdmissao;

	public Funcionario(int id, String nome, String funcao, int[] dataAdmissao) {
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
				"\n dataAdmissao = " + dataAdmissao[0] + "/" + dataAdmissao[1]  +"/" + dataAdmissao[2]+"\n";
	}
}
