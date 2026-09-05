void main() {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> notas = new ArrayList<>();
    double media = 0.00;
    int aprovados = 0;
    int reprovados = 0;

    for (int i = 0; i < 10; i++) {

        while (true) {
            try {
                System.out.print("Digite a " + (i + 1) + "° Nota: ");
                double nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Digite um valor entre 0 e 10!");
                    continue;
                }

                if (nota > 4) {
                    aprovados++;
                    media += nota;
                } else {
                    reprovados++;
                    media += nota;
                }

                notas.add(nota);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor Invalido!");
                scanner.nextLine();

            }
        }
    }

    System.out.println(" ");
    System.out.println("Notas: " + notas);
    System.out.printf("Média: %.2f%n", (media / 10));
    System.out.println("Aprovados: " + aprovados);
    System.out.println("Reprovados: " + reprovados);

}

