package controlador;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import modelo.Emprestimo;
import modelo.Equipamento;
import modelo.Funcionario;

public class ControladorEmprestimo {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Adicionar um novo empréstimo
    public void adicionarEmprestimo(LocalDate dataHoraSaida, Funcionario funcionario, Equipamento equipamento, String observacoes,LocalDate dataHoraRetorno) {
		Emprestimo temprestimo = new Emprestimo(dataHoraSaida, funcionario, equipamento, observacoes, dataHoraRetorno);
        emprestimos.add(temprestimo);

    }

	public void carregarDados(List<Emprestimo> emprestimosNovo) {
		emprestimos = emprestimosNovo;
	}


    // Deletar um empréstimo pelo INDEX
    public void deletarEmprestimo(int index) {
        emprestimos.remove(emprestimos.get(index));
    }

    // Listar todos os empréstimos
    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }
    
	// Listar todos os empréstimos
    public Emprestimo getEmprestimoPorIndex(int index) {
        return emprestimos.get(index);
    }

    // Atualizar dados de um empréstimo
    public void atualizarEmprestimo(int index, Emprestimo emprestimoAtualizado) {
		emprestimos.set(index, emprestimoAtualizado);
    }
}
