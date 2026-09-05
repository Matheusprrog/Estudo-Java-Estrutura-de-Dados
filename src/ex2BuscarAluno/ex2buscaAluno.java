package ex2BuscarAluno;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2buscaAluno
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        for(int i = 1; i <= 3; i++) {

            System.out.println("digite o " + i + " nome:");

            nomes.add(scanner.nextLine());

        }

        System.out.println(" ");

        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}