import java.util.ArrayList;
import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> produto = new ArrayList<>();

    while (true) {

        System.out.println("[1] - Adcionar Produto ");
        System.out.println("[2] - Listar Produto ");
        System.out.println("[3] - Pesquisar Produto ");
        System.out.println("[4] - Remover Produto ");
        System.out.println("[5] - Sair ");
        System.out.println(" ");
        System.out.print("Escolha: ");

        try {
            int escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    adcionarProduto(scanner, produto);
                    break;


                case 2:
                    listarProduto(scanner, produto);
                    break;

                case 3:
                    pesquisarProdutos(scanner, produto);
                    break;

                case 4:
                    removerProdutos(scanner, produto);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("valor invalido!");
            }

        } catch (InputMismatchException e) {
            System.out.println("valor invalido! Tente Novamente");
            scanner.nextLine();

        }

    }

}

public void adcionarProduto(Scanner scanner, ArrayList<String> produto) {

    System.out.print("Qual Produto Deseja Adcionar: ");
    scanner.nextLine();
    String newProduct = scanner.nextLine();
    produto.add(newProduct);
    System.out.println("Produto Adcionado!");

    System.out.println(" ");
    System.out.println("Deseja adcionar mais produtos? ");
    System.out.println("[1] Sim");
    System.out.println("[0] não");


    while (true) {

        try {
            int escolhaAddProduto = scanner.nextInt();

            if (escolhaAddProduto > 1 || escolhaAddProduto < 0) {
                System.out.println("valor invalido! tente novamente!");
                continue;

            } else if (escolhaAddProduto == 1) {
                adcionarProduto(scanner, produto);
                continue;

            } else {
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor invalido! Tente Novamente!");
            scanner.nextLine();
        }

    }

}

public void listarProduto(Scanner scanner, ArrayList<String> produto) {

    if (produto.isEmpty()) {
        System.out.println("Nenhum Produto Cadastrado!");
        return;
    }

    for (int i = 0; i < produto.size(); i++) {

        System.out.println((i + 1) + " - " + produto.get(i));
    }

    System.out.println(" ");
}


public void pesquisarProdutos(Scanner scanner, ArrayList<String> produto) {

    while (true) {
        System.out.println("Digite o Produto que deseja pesquisar: ");
        scanner.nextLine();
        String pesquisaProduto = scanner.nextLine();

        if (produto.contains(pesquisaProduto)) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto nao encontrado!");
        }

        System.out.println("Deseja pesquisar outro produto?");
        System.out.println("[1] - Sim ");
        System.out.println("[2] - Não ");

        try {
            int escolha = scanner.nextInt();
            if (escolha == 2) {
                return;
            } else if (escolha != 1) {
                System.out.println("Valor Invalido! Tente Novamente!");

            }

        } catch (InputMismatchException e) {
            System.out.println("Valor invalido! Tente novamente!");
            scanner.nextLine();
        }
    }
}

public void removerProdutos(Scanner scanner, ArrayList<String> produto) {

    if (produto.isEmpty()) {
        System.out.println("Nenhum Produto Cadastrado!");
        return;
    }

    System.out.println("Qual produto deseja remover?");
    scanner.nextLine();
    String escolha = scanner.nextLine();

    if (produto.remove(escolha)) {
        System.out.println("Produto removido!");
    } else {
        System.out.println("Produto não encontrado!");
    }

}