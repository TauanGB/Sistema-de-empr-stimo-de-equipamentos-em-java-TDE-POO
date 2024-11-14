package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Emprestimo implements Serializable{
	private static final long serialVersionUID = 1L;
	private LocalDate dataHoraSaida;
	private LocalDate dataHoraRetorno;
	public Funcionario funcionario;
	public Equipamento equipamento;
	public String status;
	private String observacoes;

	public Emprestimo(LocalDate dataHoraSaida, Funcionario funcionario, 
					  Equipamento equipamento, String observacoes,LocalDate dataHoraRetorno) {
		this.dataHoraSaida = dataHoraSaida;
		this.funcionario = funcionario;
		this.equipamento = equipamento;
		this.observacoes = observacoes;
		this.dataHoraRetorno = dataHoraRetorno;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void getStatus(String status) {
		this.status = status;
	}
	
	public void confirmarRetorno(LocalDate dataHoraRetorno,String obs) {
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
				"\n data Hora de Saida = " + dataHoraSaida +
				"\n data Hora de Retorno = " + dataHoraRetorno +
				"\n Funcionario: " + funcionario +
				"\n Equipamento: " + equipamento +
				"\n observacoes =  " + observacoes;
	}
}
