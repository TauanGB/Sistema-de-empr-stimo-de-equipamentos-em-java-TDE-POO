public class Emprestimo {
	private int[] dataHoraSaida;
	private int[] dataHoraRetorno;
	public Funcionario funcionario;
	public Equipamento equipamento;
	public String status;
	private String observacoes;

	public Emprestimo(int[] dataHoraSaida, Funcionario funcionario, 
					  Equipamento equipamento, String observacoes,int[] dataHoraRetorno) {
		this.dataHoraSaida = dataHoraSaida;
		this.funcionario = funcionario;
		this.equipamento = equipamento;
		this.observacoes = observacoes;
		this.dataHoraRetorno = dataHoraRetorno;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void confirmarRetorno(int[] dataHoraRetorno,String obs) {
		this.status = "Retornado";
		this.dataHoraRetorno = dataHoraRetorno;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public String getObservacoes() {
		return observacoes;
	}

	@Override
	public String toString() {
		return "------Empréstimo------" +
				"\n data Hora de Saida = " + dataHoraSaida[0] + "/" + dataHoraSaida[1]  +"/" + dataHoraSaida[2] +
				"\n data Hora de Retorno = " + dataHoraRetorno[0] + "/" + dataHoraRetorno[1]  +"/" + dataHoraRetorno[2] +
				"\n Funcionario: " + funcionario +
				"\n Equipamento: " + equipamento +
				"\n observacoes =  " + observacoes;
	}
}
