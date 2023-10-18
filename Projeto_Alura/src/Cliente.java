import java.util.Scanner;

public class Cliente {

    Scanner auxiliar = new Scanner(System.in);

    private String nome_completo;
    private int idade_cliente;
    private String endereco;
    private long cpf_cliente;
    private String cargo_cliente;

    //Método que realiza o cadastro completo e analisa os dados do cliente
    void registraCliente() {
        System.out.println("Olá, sou o assistente virtual da TechCompany e vou ajudar você a se registrar!");
        System.out.println("Para começar, qual é o seu nome?");
         nome_completo = auxiliar.nextLine();

        System.out.println("Agora me diga qual é a sua idade:");
            idade_cliente = auxiliar.nextInt();
                auxiliar.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite seu endereço:");
         endereco = auxiliar.nextLine();

        System.out.println("Muito bem, qual é o seu CPF?");
            cpf_cliente = auxiliar.nextLong();
                auxiliar.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Para qual cargo você deseja concorrer?");
         cargo_cliente = auxiliar.nextLine();
    }
    void coletaDados() {
        System.out.println("Muito bem! Coletei seus dados e foi isso que consegui: " +
                "\nNome: " + nome_completo + "\nIdade: " + idade_cliente + " anos" +
                "\nEndereço: " + endereco + "\nCPF: " + cpf_cliente + "\nCargo de interesse: " + cargo_cliente +
                "\nEsses dados estão corretos? \n1)Sim  2)Não");
        String questao = auxiliar.nextLine();

        switch (questao) {
            case "1":
                System.out.println("Registro concluído! Seja bem vindo " + nome_completo + " à TechCompany! " +
                        "\nO que deseja fazer agora? 1)Retornar ao menu  2)Fechar o app");
                String retorna_app = auxiliar.nextLine();
        }
    }
}
