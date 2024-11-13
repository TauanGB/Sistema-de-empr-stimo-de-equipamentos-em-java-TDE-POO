package controlador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Equipamento;

public class ControladorEquipamento {
    private List<Equipamento> equipamentos = new ArrayList<>();

    // Adicionar um novo equipamento
    public void adicionarEquipamento(String descricao, LocalDate dataCompra, double peso, 
					   double largura, double comprimento, String estadoConservacao) {
		Equipamento equipamento = new Equipamento(equipamentos.size()+1, descricao, dataCompra, peso, largura, comprimento, estadoConservacao);
        equipamentos.add(equipamento);
    }

    // Deletar um equipamento pelo ID
    public void deletarEquipamento(int id) {
        equipamentos.removeIf(e -> e.getId() == id);
    }

    // Listar todos os equipamentos
    public List<Equipamento> listarEquipamentos() {
        return equipamentos;
    }
    
	public Equipamento getEquipamentoPorIndex(int index) {
        return equipamentos.get(index);
    }

    // Atualizar dados de um equipamento
    public void atualizarEquipamento(int id, Equipamento equipamentoAtualizado) {
        for (int i = 0; i < equipamentos.size(); i++) {
            if (equipamentos.get(i).getId() == id) {
                equipamentos.set(i, equipamentoAtualizado);
                break;
            }
        }
    }

    // Função específica: verificar disponibilidade do equipamento
    public String verificarDisponibilidade(int id) {
        for (Equipamento e : equipamentos) {
            if (e.getId() == id) {
                return e.getStatus();
            }
        }
		return "Indisponivel";
    }
}
