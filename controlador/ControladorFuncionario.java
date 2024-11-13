package controlador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Funcionario;

public class ControladorFuncionario {
    private List<Funcionario> funcionarios = new ArrayList<>();

    // Adicionar um novo funcionário
    public void adicionarFuncionario(String nome, String funcao, LocalDate dataAdmissao) {
        Funcionario funcionario = new Funcionario(funcionarios.size() + 1, nome, funcao, dataAdmissao);
        funcionarios.add(funcionario);
    }

    // Deletar um funcionário pelo ID
    public void deletarFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }

    // Listar todos os funcionários
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    // Atualizar dados de um funcionário
    public void atualizarFuncionario(int id, Funcionario funcionarioAtualizado) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                funcionarios.set(i, funcionarioAtualizado);
                break;
            }
        }
    }

    // Função específica: buscar funcionários por index
    public Funcionario buscarPorIndexFuncionario(int id) {
        return funcionarios.get(id);
    }
}
