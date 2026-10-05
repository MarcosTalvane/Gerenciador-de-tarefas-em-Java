//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int opcao = -1;


    while (opcao != 0) {
        System.out.println("---- GERENCIADOR DE TAREFAS ----");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Concluir Tarefa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("--- ADICIONAR TAREFA ---");
                sc.nextLine();
                System.out.println("Adicione a descrição da tarefa: ");
                String descricao = sc.nextLine();

                Tarefa tarefa = new Tarefa(descricao);
                tarefas.add(tarefa);

                System.out.println("Tarefa adicionada com sucesso!");
                System.out.println();
                break;
            case 2:
                System.out.println("--- SUAS TAREFAS ---");
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada");
                    System.out.println();
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + " - " + tarefas.get(i));
                    }
                }
                System.out.println();
                break;
            case 3:
                System.out.println("--- CONCLUIR TAREFA ---");
                if (tarefas.isEmpty()) {
                    System.out.println("Você não possui tarefas para concluir");
                }
                System.out.println("Digite o número da tarefa que deseja concluir: ");
                int indice = sc.nextInt();
                if (indice < 0 || indice >= tarefas.size()) {
                    System.out.println("Número de tarefa inválido");
                }
                Tarefa tarefaEscolhida = tarefas.get(indice);
                if (tarefaEscolhida.isStatus() == true) {
                    System.out.println("Essa tarefa já está marcada");
                } else {
                    tarefaEscolhida.marcarComoConcluido();
                    System.out.println("Tarefa marcada como concluída!");
                    System.out.println();
                }
                break;
            case 0:
            System.out.println("Saindo...");
        }
    }
}
