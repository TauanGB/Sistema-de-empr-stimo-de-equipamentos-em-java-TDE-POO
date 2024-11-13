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
import java.util.ArrayList;

public class MenuOganizado {
	static ArrayList<Funcionario> Funcionarios;
	static ArrayList<Equipamento> Equipamentos;
	static ArrayList<Emprestimo> Emprestimos;

	MenuOganizado(){
	}

	public static void exemplos(){
		int[] DataTmp = {3, 10, 2024};

		//FUNCIONARIOS FICTICIOS--------------------------------FUNCIONARIOS FICTICIOS------------------------FUNCIONARIOS FICTICIOS----------------------FUNCIONARIOS FICTICIOS
		Funcionario TmpFun1 = new Funcionario(Funcionarios.size() + 1, "Tindo", "extelionatario", DataTmp);
		Funcionario TmpFun4 = new Funcionario(Funcionarios.size() + 1, "Luis", "Patrão", DataTmp);
		Funcionario TmpFun2 = new Funcionario(Funcionarios.size() + 1, "Carlos Souza", "Técnico de TI", DataTmp);
		Funcionario TmpFun3 = new Funcionario(Funcionarios.size() + 1, "Mariana Silva", "Coordenadora", DataTmp);
		Funcionario TmpFun = new Funcionario(Funcionarios.size() + 1, "joselindo", "Mercenario", DataTmp);
		
		Equipamento TmpEquip1 = new Equipamento(Equipamentos.size() + 1, "Impressora", DataTmp, 5.5, 40, 50, "Bom");
		Equipamento TmpEquip2 = new Equipamento(Equipamentos.size() + 1, "Monitor", DataTmp, 3.2, 60, 30, "Novo");
		Equipamento TmpEquip3 = new Equipamento(Equipamentos.size() + 1, "Projetor", DataTmp, 2.0, 25, 15, "Novo");
		Equipamento TmpEquip4 = new Equipamento(Equipamentos.size() + 1, "Cadeira de Escritório", DataTmp, 8.0, 60, 60, "Bom");
		Equipamento TmpEquip = new Equipamento(Equipamentos.size() + 1, "Nootbook", DataTmp, 12, 123, 1211, "Novo");


		
		Funcionarios.add(TmpFun1);
		Funcionarios.add(TmpFun2);
		Funcionarios.add(TmpFun3);
		Funcionarios.add(TmpFun4);
		Funcionarios.add(TmpFun);

		Equipamentos.add(TmpEquip1);		
		Equipamentos.add(TmpEquip2);		
		Equipamentos.add(TmpEquip3);		
		Equipamentos.add(TmpEquip4);		
		Equipamentos.add(TmpEquip);
	}
	
	public static void main( String[] args) {
		int[] DataTmp = {04, 10, 2024};
		Funcionarios = new ArrayList<>();
		Equipamentos = new ArrayList<>();
		Emprestimos = new ArrayList<>();
		
		MenuOganizado.exemplos();

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
					cadastro(Leitor, DataTmp);
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
	public static void  cadastro(Scanner Leitor, int[] DataTmp) {
		int RespostaLeitor;
		do {
			System.out.println("\033[H\033[2J");
			System.out.println(" -----Funcionarios----- ");
			System.out.println(" 1 - Cadastrar Funcionario \n 2 - Cadastrar Equipamento \n 3 - Sair");
			RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");

			switch (RespostaLeitor) {
				case 1:
					cadastrarFuncionario(Leitor, DataTmp);
					break;
				case 2:
					cadastrarEquipamento(Leitor, DataTmp);
					break;
			}
		} while (RespostaLeitor <= 2);
	}

	public static void cadastrarFuncionario(Scanner Leitor, int[] DataTmp) {
		System.out.println(" -----Cadastro Funcionario----- ");
		System.out.println("Nome :");
		String scanNome = Leitor.next();
		System.out.println("Função :");
		String scanFuncao = Leitor.next();
		System.out.println("__Data de admissão__");
		System.out.println("Dia :");
		DataTmp[0] = Leitor.nextInt();
		System.out.println("Mês :");
		DataTmp[1] = Leitor.nextInt();
		System.out.println("Ano :");
		DataTmp[2] = Leitor.nextInt();

		Funcionario TmpFuncionarios = new Funcionario(Funcionarios.size() + 1, scanNome, scanFuncao, DataTmp);
		Funcionarios.add(TmpFuncionarios);
	}

	public static void cadastrarEquipamento(Scanner Leitor, int[] DataTmp) {
		System.out.println(" -----Cadastro Equipamento----- ");
		System.out.println("Descrição :");
		String scanDescricao = Leitor.next();
		System.out.println("Peso :");
		double scanPeso = Leitor.nextDouble();
		System.out.println("Largura :");
		double scanLargura = Leitor.nextDouble();
		System.out.println("Comprimento :");
		double scanComprimento = Leitor.nextDouble();
		System.out.println("__Data de admissão__");
		System.out.println("Dia :");
		DataTmp[0] = Leitor.nextInt();
		System.out.println("Mês :");
		DataTmp[1] = Leitor.nextInt();
		System.out.println("Ano :");
		DataTmp[2] = Leitor.nextInt();

		Equipamento tmpEquipamentos = new Equipamento(Equipamentos.size() + 1, scanDescricao, DataTmp, scanPeso, scanLargura, scanComprimento, "Novo");
		Equipamentos.add(tmpEquipamentos);
	}

	// Função para gerenciar dados de funcionários e equipamentos
	public static void gerenciarDados(Scanner Leitor) {
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
		public static void gerenciarFuncionarios(Scanner Leitor) {
			System.out.println(" -----Funcionarios----- ");
			System.out.println(" 0 - Sair");
			for (Funcionario TmpFuncionarioF : Funcionarios) {
				System.out.println((TmpFuncionarioF.id) + " - " + TmpFuncionarioF.nome);
		}
		int RespostaLeitor = Leitor.nextInt();
		System.out.println("\033[H\033[2J");
		
		if (RespostaLeitor <= Funcionarios.size() && RespostaLeitor != 0) {
			String tmpNovoDado;
			int Funcescolhido = RespostaLeitor - 1;
			System.out.println("\033[H\033[2J");
			System.out.println(" -----" + Funcionarios.get(Funcescolhido).nome + "----- ");
			System.out.println("0 - Expandir dados ");
			System.out.println("1 - Alterar nome ");
			System.out.println("2 - Alterar funcao ");
			System.out.println("3 - Sair ");
			RespostaLeitor = Leitor.nextInt();
			
			switch (RespostaLeitor) {
				case 0:
					System.out.println(" ---------- ");
					System.out.println(Funcionarios.get(Funcescolhido).toString());
					System.out.println("--- 0 - Sair ---");
					Leitor.nextInt();
					System.out.println("\033[H\033[2J");
					break;
					case 1:
					System.out.println("Novo dado :");
					tmpNovoDado = Leitor.next();
					Funcionarios.get(Funcescolhido).setNome(tmpNovoDado);
					break;
					case 2:
					System.out.println("Nova função :");
					tmpNovoDado = Leitor.next();
					Funcionarios.get(Funcescolhido).setFuncao(tmpNovoDado);
					break;
				}
			}
		}

		// gerenciamento de equipamentos no total
		public static void gerenciarEquipamentos(Scanner Leitor) {
			System.out.println(" -----Equipamentos----- ");
			System.out.println(" 0 - Sair");
			for (Equipamento TmpEquipamentoF : Equipamentos) {
				System.out.println((TmpEquipamentoF.id) + " - " + TmpEquipamentoF.descricao);
			}
			int RespostaLeitor = Leitor.nextInt();
			System.out.println("\033[H\033[2J");
			
			if (RespostaLeitor <= Equipamentos.size() && RespostaLeitor != 0) {
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
					System.out.println(" -----" + Equipamentos.get(EquipamentoEscolhido).descricao + "----- ");
					System.out.println(Equipamentos.get(EquipamentoEscolhido).toString());
					System.out.println("--- 0 - Sair ---");
					Leitor.nextInt();
					System.out.println("\033[H\033[2J");
					break;
					case 1:
					System.out.println("Nova descrição :");
					tmpNovoDado = Leitor.next();
					Equipamentos.get(EquipamentoEscolhido).setDescricao(tmpNovoDado);
					break;
					case 2:
					System.out.println("Novo estado :");
					tmpNovoDado = Leitor.next();
					System.out.println("Novo ou bom - 0 \n Funcional - 1 \n Quebrado - 2");
					RespostaLeitor = Leitor.nextInt();

					switch (RespostaLeitor) {
						case 0:
							Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Novo ou bom");

						break;

						case 1:
							Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Funcional");
							
							break;
					
						case 2:
							Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Quebrado");
							Emprestimos.get(RespostaLeitor).equipamento.setStatus("Quebrado");
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
						Equipamentos.get(EquipamentoEscolhido).setStatus("Funcional");
						break;
						
						case 1:
						Equipamentos.get(EquipamentoEscolhido).setStatus("Quebrado");
						break;
					}
					break;
				}
			}
		}

		//lista todos os items do historico
		public static void HistoricoManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			System.out.println(Equipamentos.get(Equipamentoescolhido) + " Historico ");
			Equipamento equipTmp = Equipamentos.get(Equipamentoescolhido);
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
		public static void saidaParaManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			String RespostaLeitors;
			if (Equipamentos.get(Equipamentoescolhido).status =="Disponivel" || Equipamentos.get(Equipamentoescolhido).status =="Quebrado"){
				System.out.println("Data de retirada (dd/mm/aaaa)");
				RespostaLeitors = Leitor.next();
				Equipamentos.get(Equipamentoescolhido).adicionarHistoricoManutencao("Retirado para manutenção dia " + RespostaLeitors);
				Equipamentos.get(Equipamentoescolhido).status = "Manutenção";

				System.out.println("\033[H\033[2J");
				for (String items : Equipamentos.get(Equipamentoescolhido).historicoManutencao ) {
					System.err.println(items);
				}
			}
			else{
				
				System.out.println("Objeto imcapacitado de reitrar pois esta emprestado ou em manutenção!");

			}
			System.out.println("--- 0 - Sair ---");
			RespostaLeitor = Leitor.nextInt();
		}
		
		public static void retornoDeManutencao(int Equipamentoescolhido, Scanner Leitor){
			int RespostaLeitor;
			String RespostaLeitors;

			if (Equipamentos.get(Equipamentoescolhido).status =="Manutenção"){
				System.out.println("Data de retirada (dd/mm/aaaa)");
				RespostaLeitors = Leitor.next();
				Equipamentos.get(Equipamentoescolhido).adicionarHistoricoManutencao("Retornado de manutenção dia " + RespostaLeitors);
				Equipamentos.get(Equipamentoescolhido).status = "Disponivel";
				System.out.println("\033[H\033[2J");
				for (String items : Equipamentos.get(Equipamentoescolhido).historicoManutencao ) {
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
	public static void gerenciarEmprestimos(Scanner Leitor) {
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

	public static void verEmprestimos(Scanner Leitor) {
		System.out.println(" -----Lista----- ");
		for (Emprestimo TmpEmprestimos : Emprestimos) {
			System.out.println(TmpEmprestimos.toString());
		}
		System.out.println("--- 0 - Sair ---");
		Leitor.nextInt();
	}

	public static void gerarEmprestimo(Scanner Leitor) {
		System.out.println(" -----Novo Empréstimo----- ");
		System.out.println("__Data do Emprestimo__");

		int[] DataTmp = new int[3];
		System.out.println("Dia :");
		DataTmp[0] = Leitor.nextInt();
		System.out.println("Mês :");
		DataTmp[1] = Leitor.nextInt();
		System.out.println("Ano :");
		DataTmp[2] = Leitor.nextInt();

		System.out.println("Funcionários disponíveis:");
		for (Funcionario tmpFuncionario : Funcionarios) {
			System.out.println(tmpFuncionario.id + " - " + tmpFuncionario.nome);
		}
		System.out.println("Escolha um funcionário pelo ID:");
		int idFuncionario = Leitor.nextInt();
		Funcionario tmpFuncionario = Funcionarios.get(idFuncionario - 1);

		System.out.println("Equipamentos disponíveis:");
		for (Equipamento tmpEquipamento : Equipamentos) {
			if (tmpEquipamento.status != "Emprestado" &&  tmpEquipamento.status != "Manutenção" &&  tmpEquipamento.status != "Quebrado" )
				System.out.println(tmpEquipamento.id + " - " + tmpEquipamento.descricao);
		}
		System.out.println("Escolha um equipamento pelo ID:");

		int idEquipamento = Leitor.nextInt();
		Equipamento tmpEquipamento = Equipamentos.get(idEquipamento - 1);

		Equipamentos.get(idEquipamento).setStatus("Emprestado");


		System.out.println("Data hora prevista de retorno:");
		int[] DataTmp1 = new int[3];
		System.out.println("Dia :");
		DataTmp1[0] = Leitor.nextInt();
		System.out.println("Mês :");
		DataTmp1[1] = Leitor.nextInt();
		System.out.println("Ano :");
		DataTmp1[2] = Leitor.nextInt();

		System.out.println("Observações:");
		String observacoes = Leitor.next();

		Emprestimo novoEmprestimo = new Emprestimo(DataTmp, tmpFuncionario, tmpEquipamento, observacoes, DataTmp1);
		novoEmprestimo.setStatus("A Retornar");
		Emprestimos.add(novoEmprestimo);
		System.out.println("Empréstimo gerado com sucesso!");
	}

	//ADICIIONANDO RETORNO A LISTA DO EQUIPAMENTO
	public static void validarRetorno(Scanner Leitor) {
		int RespostaLeitor;
		String RespostaLeitorS;
		System.out.println(" -----Validar Retorno----- ");
		for (Emprestimo TmpEmprestimos : Emprestimos) {
			if (TmpEmprestimos.status != "Retornado")
				System.out.println(Emprestimos.indexOf(TmpEmprestimos) + " --"+TmpEmprestimos.equipamento.descricao+" para "+TmpEmprestimos.funcionario.nome);
		}
		System.out.println("--- Selecione o emprestimo ---");
		RespostaLeitor = Leitor.nextInt();
		System.out.println("\033[H\033[2J");

		if (Emprestimos.get(RespostaLeitor).status != "Retornado")
			System.out.println(Emprestimos.get(RespostaLeitor).toString());
			Emprestimos.get(RespostaLeitor).toString();
			System.out.println("--- Confirmar ? (Sim = 0,Não = 1) ---");
			RespostaLeitor = Leitor.nextInt();
			if (RespostaLeitor == 0) {
				System.out.println("\033[H\033[2J");
				System.out.println("Data hora do retorno:");
				int[] DataTmp1 = new int[3];
				System.out.println("Dia :");
				DataTmp1[0] = Leitor.nextInt();
				System.out.println("Mês :");
				DataTmp1[1] = Leitor.nextInt();
				System.out.println("Ano :");
				DataTmp1[2] = Leitor.nextInt();

				System.out.println("estado devolvido do equipamento :");
				System.out.println("Novo ou bom - 0 \n Funcional - 1 \n Quebrado - 2");
				RespostaLeitor = Leitor.nextInt();

				switch (RespostaLeitor) {
					case 0:
						Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Novo ou bom");

					break;

					case 1:
						Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Funcional");
						
						break;
				
					case 2:
						Emprestimos.get(RespostaLeitor).equipamento.setEstadoConservacao("Quebrado");
						Emprestimos.get(RespostaLeitor).equipamento.setStatus("Quebrado");
				}


				System.out.println("Obs :");
				RespostaLeitorS = Leitor.nextLine();
				
				
				Emprestimos.get(RespostaLeitor).confirmarRetorno(DataTmp1,RespostaLeitorS);
				
			}
		System.out.println("\033[H\033[2J");
	}
}