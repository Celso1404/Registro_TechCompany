import java.util.Scanner;

public class Interface extends Funcionario {
    public static void main(String[] args) {

        System.out.println("*-----------------------------*");
        System.out.println("|        Seja bem vindo       |");
        System.out.println("|              à              |");
        System.out.println("|         TechCompany!        |");
        System.out.println("*-----------------------------*");

            Scanner auxiliar = new Scanner(System.in);

        Menu estagiario = new Menu();

        estagiario.iniciar();
        }
    }

