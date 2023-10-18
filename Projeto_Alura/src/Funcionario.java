import java.util.Scanner;

public class Funcionario {

    //Variáveis principais com caracteristicas de um funcionario
        private String nome;
        private int idade;
        private String cargo;
        private double salario;
        private double saldo;

        Scanner auxiliar = new Scanner(System.in);

void calculaSaldo() {
    System.out.println("Quanto você ganha por mês? ");
        double salario = auxiliar.nextDouble();
    System.out.println("Quanto você paga de contas fixas ao mês? ");
        double despesas = auxiliar.nextDouble();
        saldo = salario - despesas;

        System.out.println("Seu saldo na conta é de: R$" + saldo + ".");
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

