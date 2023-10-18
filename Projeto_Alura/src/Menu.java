public class Menu extends Funcionario {

    Funcionario estagiario = new Funcionario();
    Cliente cliente = new Cliente();

public void iniciar() {
    System.out.println("\n*-Qual seu nome?-*");
    String nome = auxiliar.nextLine();

    System.out.println("Olá " + nome + "!");
    boolean sair = false;
        while (!sair) {
            System.out.println("Me diga sua relação com a empresa: " +
                            "\n1)Sou funcionário\n2)Sou cliente\n3)Sair");
        String pergunta = auxiliar.nextLine();

        switch (pergunta) {
            case "1":
                while (true) {
                    System.out.println("Muito bem! O que deseja escolher agora?" +
                            "\n1)Visualizar saldo \n2)Registrar horário de chegada" +
                            "\n3)Registrar horário de saída");
                    String escolha = auxiliar.nextLine();

                    switch (escolha) {
                        case "1":
                            estagiario.calculaSaldo();
                            System.out.println("Deseja retornar ao menu ou fechar o app? " +
                                    "\n1)Retornar 2)Fechar");
                            pergunta = auxiliar.nextLine(); //pergunta pare retornar ao menu principal
                            //IF e Else para voltar ao menu
                            if (pergunta.equals("2")) {
                                return; // Sai do menu de funcionário e volta ao menu principal
                            }
                            break;
                        case "2":
                            System.out.println("Em qual horário você chegou? ");
                            String horario_entrada = auxiliar.nextLine();
                            System.out.println("Registro do funcionário " +
                                    nome + " que chegou " + "" + horario_entrada + "" + " horas da manhã.");                            System.out.println("Deseja retornar ao menu ou fechar o app? " +
                                    "\n1)Retornar 2)Fechar");
                            pergunta = auxiliar.nextLine();

                            if (pergunta.equals("2")) {
                                return; // Sai do menu de funcionário e volta ao menu principal
                            }
                            break;
                        case "3":
                            System.out.println("Em qual horário você saiu? ");
                            int horario_saida = auxiliar.nextInt();
                            if (horario_saida <= 20) { //parâmetro de horário do funcionário
                                System.out.println("Registro do funcionario " +
                                        nome + " que saiu " + horario_saida + " horas da tarde.");
                            } if (horario_saida > 20) { //parâmetro de horário do funcionário
                            System.out.println("Registro do funcionario " +
                                    nome + " que saiu " + horario_saida + " horas da noite.");
                        }
                            System.out.println("Deseja retornar ao menu ou fechar o app? " +
                                    "\n1)Retornar 2)Fechar");
                            pergunta = auxiliar.nextLine();

                            if (pergunta.equals("2")) {
                                return; // Sai do menu de funcionário e volta ao menu principal
                            }
                            break;
                    }
                    break;
                }
            case "2":
                System.out.println("Selecione a opção desejada: \n1)Registrar  2)Voltar");
                   String pergunta_cliente = auxiliar.nextLine();

                    switch (pergunta_cliente) {
                        case "1":
                        cliente.registraCliente();
                        cliente.coletaDados();
                    }
                break;
            case "3":
                System.out.println("---Encerrando programa, muito obrigado pelo interesse!---");
                sair = true;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
        }
    }
        auxiliar.close();
}
}