package appconta;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class AppConta {

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStg = new Scanner(System.in);
        String nome;
        double contaCorrente;

        Conta conta = new Conta(123456, "Vinicius emidio");
        boolean sair = true;

        do {
            System.out.println(painel());
            int botao = inputInt.nextInt();
            switch (botao) {
                case 1:
                    System.out.println("Digite o novo nome: ");
                    conta.alterarNome(nome = inputStg.next());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    conta.saque(contaCorrente = inputInt.nextDouble());
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado na conta: ");
                    conta.deposito(contaCorrente = inputInt.nextDouble());
                    break;
                case 4:
                    System.out.println(conta.imprimir());
                case 0:
                    sair = false;
                    break;
                default:
                    System.out.println("Essa não é uma opção válida!");
            }

        } while (sair  != false);

    }

    public static String painel() {
        return "Seja bem vindo!\n"
                + "=============================================="
                + "\n Digite 1 para alterar o nome do correntista."
                + "\n Digite 2 para saque na conta corrente."
                + "\n Digite 3 para deposito na conta corrente."
                + "\n Digite 4 para dados da conta corrente."
                + "\n digite 0 para sair. "
                + "\n ==============================================";
    }

}
