package ex3CadastroRemovido;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3cadastroRemovido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Lista inicial: " + numeros);
        System.out.println("Digite o numero que deseja tirar da lista: ");
        int valorRemove = Integer.parseInt(scanner.nextLine());

        if(numeros.remove(Integer.valueOf(valorRemove))){
            System.out.println("Valor removido com sucesso");
        }
        else
            System.out.println("Valor nao existe");

        System.out.println(numeros);
    }
}