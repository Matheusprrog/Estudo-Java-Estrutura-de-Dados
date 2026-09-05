package ex1CadastroNomes;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1cadastroNomes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("jonas");
        nomes.add("jonatha");
        nomes.add("leo");
        nomes.add("murilo");
        nomes.add("maria");
        nomes.add("joana");
        nomes.add("claudio");

        System.out.println("Digite o nome que deseja pesquisar: ");
        String escolha = scanner.nextLine();

        if(nomes.contains(escolha)) {
            System.out.println("aluno encontrado");
        } else {
            System.out.println("aluno nao encontrado");
        }

    }
}