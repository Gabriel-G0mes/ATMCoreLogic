public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    double saldo = 1000.00;
    int resp;
    double deposito;
    double saque;

    do {
        System.out.println("===== MENU =====");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        resp = input.nextInt();

        if (resp == 1) {
            System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
        }

        else if (resp == 2) {
            System.out.print("Quanto você quer depositar ? ");
            deposito = input.nextDouble();

            if (deposito <= 0) {
                System.out.println("Valor inválido para depósito.");
            } else {
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }

        else if (resp == 3) {
            System.out.println("Quanto você quer sacar ?");
            saque = input.nextDouble();

            if (saque <= 0) {
                System.out.println("Valor inválido");
            } else if(saque > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso");
            }

        }

        else if (resp != 4) {
            System.out.println("Opção inválida. Tente novamente.");
        }

    } while (resp != 4);

    System.out.println("Obrigado por usar o sistema.");

    input.close();
}
