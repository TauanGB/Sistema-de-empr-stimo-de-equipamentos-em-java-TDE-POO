import java.util.ArrayList;

public class Equipamento {
	public int id;
	public String descricao;
	public String status;
	private int[] dataCompra;
	private double peso;
	private double largura;
	private double comprimento;
	public ArrayList<String> historicoManutencao;
	public String estadoConservacao;

	public Equipamento(int id, String descricao, int[] dataCompra, double peso, 
					   double largura, double comprimento, String estadoConservacao) {
		this.id = id;
		this.status = "Disponivel";
		this.descricao = descricao;
		this.dataCompra = dataCompra;
		this.peso = peso;
		this.largura = largura;
		this.comprimento = comprimento;
		this.historicoManutencao = new ArrayList<>();
		this.estadoConservacao = estadoConservacao;
	}
	public int getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void adicionarHistoricoManutencao(String descricaoManutencao) {
		historicoManutencao.add(descricaoManutencao);
	}

	@Override
	public String toString() {
		return "\n------Equipamento------ " +
				"\n id =" + id + 
				"\n Estatus = " + status +
				"\n descricao = " + descricao +
				"\n dataCompra = " + dataCompra[0] + "/" + dataCompra[1]  +"/" + dataCompra[2] +
				"\n peso = " + peso +
				"\n largura = " + largura +
				"\n comprimento = " + comprimento +
				"\n estadoConservacao = " + estadoConservacao+"\n";
	}
}
