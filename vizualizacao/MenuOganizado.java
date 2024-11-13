package vizualizacao;
//A TrackBug decidiu convidar os estudantes de Programação Orientada a Objetos para desenvolver uma solução digital em Java para o controle de empréstimos. No entanto, algumas especificações devem ser seguidas:

//1 - O projeto deve ser desenvolvido seguindo os princípios de orientação a objetos em sua totalidade.

//2 - Os equipamentos devem conter os seguintes dados: código,
// descrição,
// data de compra,
// peso,
// largura,
// comprimento,
// histórico de manutenção e estado de conservação.

//3 - Os funcionários devem ser registrados com: código
// nome
// função e data de admissão.

//4 - Para os empréstimos
// é necessário armazenar: 
//data e hora de saída
// data e hora de retorno
// funcionário responsável pelo empréstimo e observações.


import java.util.Scanner;
import controlador.ControladorEmprestimo;
import controlador.ControladorEquipamento;
import controlador.ControladorFuncionario;
import modelo.Emprestimo;
import modelo.Equipamento;
import modelo.Funcionario;
import java.time.LocalDate;

public class MenuOganizado {
	private ControladorEmprestimo emprestimoController = new ControladorEmprestimo();
	private ControladorEquipamento equipamentoController = new ControladorEquipamento();
	private ControladorFuncionario funcionarioController = new ControladorFuncionario();
	

	public void exemplos(LocalDate exemploDataTmp){
		//FUNCIONARIOS FICTICIOS--------------------------------FUNCIONARIOS FICTICIOS------------------------FUNCIONARIOS FICTICIOS----------------------FUNCIONARIOS FICTICIOS
		funcionarioController.adicionarFuncionario( "Tindo", "extelionatario", exemploDataTmp);
		funcionarioController.adicionarFuncionario( "Luis", "Patrão", exemploDataTmp);
		funcionarioController.adicionarFuncionario( "Carlos Souza", "Técnico de TI", exemploDataTmp);
		funcionarioController.adicionarFuncionario( "Mariana Silva", "Coordenadora", exemploDataTmp);
		funcionarioController.adicionarFuncionario( "joselindo", "Mercenario", exemploDataTmp);
		
		equipamentoController.adicionarEquipamento("Impressora", exemploDataTmp, 5.5, 40, 50, "Bom");
		equipamentoController.adicionarEquipamento( "Monitor", exemploDataTmp, 3.2, 60, 30, "Novo");
		equipamentoController.adicionarEquipamento( "Projetor", exemploDataTmp, 2.0, 25, 15, "Novo");
		equipamentoController.adicionarEquipamento( "Cadeira de Escritório", exemploDataTmp, 8.0, 60, 60, "Bom");
		equipamentoController.adicionarEquipamento( "Nootbook", exemploDataTmp, 12, 123, 1211, "Novo");
	}
	
	public void menu() {
		LocalDate exemploDataTmp = LocalDate.of(3, 10, 2024);
		
		exemplos(exemploDataTmp);

		Scanner Leitor = new Scanner(System.in);
		int RespostaLeitor;

		do {
			System.out.println("\033[H\033[2J");
			System.out.println(" -----Interface----- ");
			System.out.println(" 1 - Cadastro \n 2 - Gerenciar Dados \n 3 - Emprestimo \n 4 - Sair ");

			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");

			switch (RespostaLeitor) {
				case 1:
					cadastro(Leitor, exemploDataTmp);
					break;
				case 2:
					gerenciarDados(Leitor);
					break;
				case 3:
					gerenciarEmprestimos(Leitor);
					break;
			}

		} while (RespostaLeitor < 4);
		Leitor.close();
	}

	// Função de cadastro de funcionário e equipamento
	public void cadastro(Scanner Leitor, LocalDate DataTmp) {
		int RespostaLeitor;
		do {
			System.out.println("\033[H\033[2J");
			System.out.println(" -----Funcionarios----- ");
			System.out.println(" 1 - Cadastrar Funcionario \n 2 - Cadastrar Equipamento \n 3 - Sair");
			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");

			switch (RespostaLeitor) {
				case 1:
					cadastrarFuncionario(Leitor);
					break;
				case 2:
					cadastrarEquipamento(Leitor);
					break;
			}
		} while (RespostaLeitor <= 2);
	}

	public void cadastrarFuncionario(Scanner Leitor) {
		System.out.println(" -----Cadastro Funcionario----- ");
		System.out.println("Nome :");
		String scanNome = Leitor.next();
		System.out.println("Função :");
		String scanFuncao = Leitor.next();
		System.out.println("__Data de admissão__");
		System.out.println("Dia :");
		int DiaTmp = Leitor.nextInt();
		System.out.println("Mês :");
		int MesTmp = Leitor.nextInt();
		System.out.println("Ano :");
		int AnoTmp = Leitor.nextInt();

		LocalDate DataTmp = LocalDate.of(DiaTmp, MesTmp, AnoTmp);

		funcionarioController.adicionarFuncionario( scanNome, scanFuncao, DataTmp);
	}

	public void cadastrarEquipamento(Scanner Leitor) {
		System.out.println(" -----Cadastro Equipamento----- ");
		System.out.println("Descrição :");
		String scanDescricao = Leitor.next();
		System.out.println("Descrição :");
		String scanEstadoConcervacao = Leitor.next();
		System.out.println("Peso :");
		double scanPeso = Leitor.nextDouble();
		System.out.println("Largura :");
		double scanLargura = Leitor.nextDouble();
		System.out.println("Comprimento :");
		double scanComprimento = Leitor.nextDouble();
		System.out.println("__Data de admissão__");
		System.out.println("Dia :");
		int DiaTmp = Leitor.nextInt();
		System.out.println("Mês :");
		int MesTmp = Leitor.nextInt();
		System.out.println("Ano :");
		int AnoTmp = Leitor.nextInt();

		LocalDate DataTmp = LocalDate.of(DiaTmp, MesTmp, AnoTmp);

		equipamentoController.adicionarEquipamento(scanDescricao, DataTmp, scanPeso, scanLargura, scanComprimento, scanEstadoConcervacao);
	}

	// Função para gerenciar dados de funcionários e equipamentos
	public void gerenciarDados(Scanner Leitor) {
		int RespostaLeitor;
		do {
			System.out.println("\033[H\033[2J");
			System.out.println(" -----Dados----- ");
			System.out.println(" 1 - Funcionarios \n 2 - Equipamentos \n 3 - Sair");
			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");
			
			switch (RespostaLeitor) {
				case 1:
				gerenciarFuncionarios(Leitor);
				break;
				case 2:
				gerenciarEquipamentos(Leitor);
					break;
				}
			} while (RespostaLeitor < 3);
		}
		
		// Gerenciamento de funcionarios
		public void gerenciarFuncionarios(Scanner Leitor) {
			System.out.println(" -----Funcionarios----- ");
			System.out.println(" 0 - Sair");
			for (Funcionario TmpFuncionarioF : funcionarioController.listarFuncionarios()) {
				System.out.println((TmpFuncionarioF.id) + " - " + TmpFuncionarioF.nome);
			}
			

		int RespostaLeitor = Leitor.nextInt();
		System.out.println("\033[H\033[2J");
		
		if (RespostaLeitor <= funcionarioController.listarFuncionarios().size() && RespostaLeitor != 0) {
			String tmpNovoDado;
			int Funcescolhido = RespostaLeitor - 1;
			System.out.println("\033[H\033[2J");
			System.out.println(" -----" + funcionarioController.buscarPorIndexFuncionario(Funcescolhido).nome + "----- ");
			System.out.println("0 - Expandir dados ");
			System.out.println("1 - Alterar nome ");
			System.out.println("2 - Alterar funcao ");
			System.out.println("3 - Sair ");
			RespostaLeitor = Leitor.nextInt();
			
			switch (RespostaLeitor) {
				case 0:
					System.out.println(" ---------- ");
					System.out.println(funcionarioController.buscarPorIndexFuncionario(Funcescolhido).toString());
					System.out.println("--- 0 - Sair ---");
					Leitor.nextInt();
					System.out.println("\033[H\033[2J");
					break;
					case 1:
					System.out.println("Novo dado :");
					tmpNovoDado = Leitor.next();
					funcionarioController.buscarPorIndexFuncionario(Funcescolhido).setNome(tmpNovoDado);
					break;
					case 2:
					System.out.println("Nova função :");
					tmpNovoDado = Leitor.next();
					funcionarioController.buscarPorIndexFuncionario(Funcescolhido).setFuncao(tmpNovoDado);
					break;
				}
			}
		}

		// gerenciamento de equipamentos no total
		public void gerenciarEquipamentos(Scanner Leitor) {
			System.out.println(" -----Equipamentos----- ");
			System.out.println(" 0 - Sair");
			for (Equipamento TmpEquipamentoF : equipamentoController.listarEquipamentos()) {
				System.out.println((TmpEquipamentoF.id) + " - " + TmpEquipamentoF.descricao);
			}
			int RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");
			
			if (RespostaLeitor <= equipamentoController.listarEquipamentos().size() && RespostaLeitor != 0) {
				String tmpNovoDado;
			int EquipamentoEscolhido = RespostaLeitor - 1;
			System.out.println(" ---------- ");
			System.out.println("0 - Expandir Dados");
			System.out.println("1 - Alterar descrição ");
			System.out.println("2 - Alterar Estado Conservação ");
			System.out.println("3 - Historico de manutenção");
			System.out.println("4 - Retirado para manutenção");
			System.out.println("5 - Devolvido de manutenção");
			System.out.println("6 - Alterar status");
			System.out.println("7 - Sair ");
			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");
			

			switch (RespostaLeitor) {
				case 0:
					System.out.println(" -----" + equipamentoController.getEquipamentoPorIndex(EquipamentoEscolhido).descricao + "----- ");
					System.out.println(equipamentoController.getEquipamentoPorIndex(EquipamentoEscolhido).toString());
					System.out.println("--- 0 - Sair ---");
					Leitor.nextInt();
					System.out.println("\033[H\033[2J");
					break;
					case 1:
					System.out.println("Nova descrição :");
					tmpNovoDado = Leitor.next();
					equipamentoController.getEquipamentoPorIndex(EquipamentoEscolhido).setDescricao(tmpNovoDado);
					break;
					case 2:
					System.out.println("Novo estado :");
					tmpNovoDado = Leitor.next();
					System.out.println("Novo ou bom - 0 \n Funcional - 1 \n Quebrado - 2");
					RespostaLeitor = Leitor.nextInt();

					switch (RespostaLeitor) {
						case 0:
							emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Novo ou bom");

						break;

						case 1:
							emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Funcional");
							
							break;
					
						case 2:
							emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Quebrado");
							emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setStatus("Quebrado");
					}
					break;
					case 3:
					System.out.println("\033[H\033[2J");
					HistoricoManutencao(EquipamentoEscolhido,Leitor);
					break;
					case 4:
					saidaParaManutencao(EquipamentoEscolhido,Leitor);
					break;
					case 5:
					retornoDeManutencao(EquipamentoEscolhido,Leitor);
					break;
					case 6:
					System.out.println("\033[H\033[2J");
					System.out.println("Estado Atual");
					System.out.println("Funcional - 0 Quebrado -1");
					int RespostaLeitors = Leitor.nextInt();
					switch (RespostaLeitors) {
						case 0:
						equipamentoController.getEquipamentoPorIndex(EquipamentoEscolhido).setStatus("Funcional");
						break;
						
						case 1:
						equipamentoController.getEquipamentoPorIndex(EquipamentoEscolhido).setStatus("Quebrado");
						break;
					}
					break;
				}
			}
		}

		//lista todos os items do historico
		public void HistoricoManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			System.out.println(equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido) + " Historico ");
			Equipamento equipTmp = equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido);
			if (equipTmp.historicoManutencao.size() == 0) {
				System.out.println("Sem Manutenções catalogadasx");
			}
			else{
				for (String items : equipTmp.historicoManutencao ) {
					System.err.println(items);
				}
			}
			System.out.println("--- 0 - Sair ---");
			RespostaLeitor = Leitor.nextInt();
		}

		//cadsatra saira para manutenção
		public void saidaParaManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			String RespostaLeitors;
			if (equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).status =="Disponivel" || equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).status =="Quebrado"){
				System.out.println("Data de retirada (dd/mm/aaaa)");
				RespostaLeitors = Leitor.next();
				equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).adicionarHistoricoManutencao("Retirado para manutenção dia " + RespostaLeitors);
				equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).status = "Manutenção";

				System.out.println("\033[H\033[2J");
				for (String items : equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).historicoManutencao ) {
					System.err.println(items);
				}
			}
			else{
				
				System.out.println("Objeto imcapacitado de reitrar pois esta emprestado ou em manutenção!");

			}
			System.out.println("--- 0 - Sair ---");
			RespostaLeitor = Leitor.nextInt();
		}
		
		public void retornoDeManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			String RespostaLeitors;

			if (equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).status =="Manutenção"){
				System.out.println("Data de retirada (dd/mm/aaaa)");
				RespostaLeitors = Leitor.next();
				equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).adicionarHistoricoManutencao("Retornado de manutenção dia " + RespostaLeitors);
				equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).status = "Disponivel";
				System.out.println("\033[H\033[2J");
				for (String items : equipamentoController.getEquipamentoPorIndex(Equipamentoescolhido).historicoManutencao ) {
					System.err.println(items);
				}

			}
			else{
				
				System.out.println("Objeto imcapacitado de voltar ja que não saiu");

			}
			System.out.println("--- 0 - Sair ---");
			RespostaLeitor = Leitor.nextInt();
		}
		
		// Função para gerenciar empréstimos
	public void gerenciarEmprestimos(Scanner Leitor) {
		int RespostaLeitor;
		do {
			System.out.println(" -----Emprestimos----- ");
			System.out.println(" 1 - Ver Emprestimos \n 2 - Gerar novo empréstimo \n 3 - Validar Retorno \n 4 - Sair");
			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");

			switch (RespostaLeitor) {
				case 1:
					verEmprestimos(Leitor);
					break;
				case 2:
					gerarEmprestimo(Leitor);
					break;
				case 3:
					validarRetorno(Leitor);
					break;
			}
		} while (RespostaLeitor <= 3);
	}

	public void verEmprestimos(Scanner Leitor) {
		System.out.println(" -----Lista----- ");
		for (Emprestimo TmpEmprestimos : emprestimoController.listarEmprestimos()) {
			System.out.println(TmpEmprestimos.toString());
		}
		System.out.println("--- 0 - Sair ---");
		Leitor.nextInt();
	}

	public void gerarEmprestimo(Scanner Leitor) {
		System.out.println(" -----Novo Empréstimo----- ");
		System.out.println("__Data do Emprestimo__");

		System.out.println("Dia :");
		int DiaTmp = Leitor.nextInt();
		System.out.println("Mês :");
		int MesTmp = Leitor.nextInt();
		System.out.println("Ano :");
		int AnoTmp = Leitor.nextInt();

		LocalDate DataTmp = LocalDate.of(DiaTmp, MesTmp, AnoTmp);
		
		System.out.println("Funcionários disponíveis:");
		for (Funcionario tmpFuncionario : funcionarioController.listarFuncionarios()) {
			System.out.println(tmpFuncionario.id + " - " + tmpFuncionario.nome);
		}
		System.out.println("Escolha um funcionário pelo ID:");
		int idFuncionario = Leitor.nextInt();
		Funcionario tmpFuncionario = funcionarioController.buscarPorIndexFuncionario(idFuncionario - 1);

		System.out.println("Equipamentos disponíveis:");
		for (Equipamento tmpEquipamento : equipamentoController.listarEquipamentos()) {
			if (tmpEquipamento.status != "Emprestado" &&  tmpEquipamento.status != "Manutenção" &&  tmpEquipamento.status != "Quebrado" )
				System.out.println(tmpEquipamento.id + " - " + tmpEquipamento.descricao);
		}
		System.out.println("Escolha um equipamento pelo ID:");

		int idEquipamento = Leitor.nextInt();
		Equipamento tmpEquipamento = equipamentoController.getEquipamentoPorIndex(idEquipamento - 1);

		equipamentoController.getEquipamentoPorIndex(idEquipamento).setStatus("Emprestado");


		System.out.println("Data hora prevista de retorno:");
		System.out.println("Dia :");
		int DiaTmp1 = Leitor.nextInt();
		System.out.println("Mês :");
		int MesTmp1 = Leitor.nextInt();
		System.out.println("Ano :");
		int AnoTmp1 = Leitor.nextInt();

		LocalDate DataTmp1 = LocalDate.of(DiaTmp1, MesTmp1, AnoTmp1);

		System.out.println("Observações:");
		String observacoes = Leitor.next();

		emprestimoController.adicionarEmprestimo(DataTmp, tmpFuncionario, tmpEquipamento, observacoes, DataTmp1);
	}

	//ADICIIONANDO RETORNO A LISTA DO EQUIPAMENTOx
	public void validarRetorno(Scanner Leitor) {
		int RespostaLeitor;
		String RespostaLeitorS;
		System.out.println(" -----Validar Retorno----- ");
		for (Emprestimo TmpEmprestimos : emprestimoController.listarEmprestimos()) {
			if (TmpEmprestimos.status != "Retornado")
				System.out.println(emprestimoController.listarEmprestimos().indexOf(TmpEmprestimos) + " --"+TmpEmprestimos.equipamento.descricao+" para "+TmpEmprestimos.funcionario.nome);
		}
		System.out.println("--- Selecione o emprestimo ---");
		RespostaLeitor = Leitor.nextInt();
		System.out.println("\033[H\033[2J");

		if (emprestimoController.getEmprestimoPorIndex(RespostaLeitor).status != "Retornado")
			System.out.println(emprestimoController.getEmprestimoPorIndex(RespostaLeitor).toString());
			emprestimoController.getEmprestimoPorIndex(RespostaLeitor).toString();
			System.out.println("--- Confirmar ? (Sim = 0,Não = 1) ---");
			RespostaLeitor = Leitor.nextInt();
			if (RespostaLeitor == 0) {
				System.out.println("\033[H\033[2J");
				
				System.out.println("Data hora do retorno:");
				System.out.println("Dia :");				
				int DiaTmp1 = Leitor.nextInt();
				System.out.println("Mês :");
				int MesTmp1 = Leitor.nextInt();
				System.out.println("Ano :");
				int AnoTmp1 = Leitor.nextInt();
				
				LocalDate DataTmp1 = LocalDate.of(DiaTmp1, MesTmp1, AnoTmp1);

				System.out.println("estado devolvido do equipamento :");
				System.out.println("Novo ou bom - 0 \n Funcional - 1 \n Quebrado - 2");
				RespostaLeitor = Leitor.nextInt();

				switch (RespostaLeitor) {
					case 0:
						emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Novo ou bom");

					break;

					case 1:
						emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Funcional");
						
						break;
				
					case 2:
						emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setEstadoConservacao("Quebrado");
						emprestimoController.getEmprestimoPorIndex(RespostaLeitor).equipamento.setStatus("Quebrado");
				}


				System.out.println("Obs :");
				RespostaLeitorS = Leitor.nextLine();
				
				
				emprestimoController.getEmprestimoPorIndex(RespostaLeitor).confirmarRetorno(DataTmp1,RespostaLeitorS);
				
			}
		System.out.println("\033[H\033[2J");
	}
}