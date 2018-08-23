package appretangulo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class AppRetangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        boolean sair = true;
        do {
            System.out.println(painel());
            int botao = input.nextInt();

            switch (botao) {
                case 1:

                    System.out.println("Digite o medida do lado A do retângulo:");
                    retangulo.ladoA = input.nextInt();
                    System.out.println("Digite o medida do lado B do retângulo:");
                    retangulo.ladoB = input.nextInt();
                    System.out.println("Digite o medida da base do retângulo:");
                    retangulo.base = input.nextInt();
                    System.out.println("Digite o medida da altura do retângulo:");
                    retangulo.altura = input.nextInt();
                    break;
                case 2:
                    System.out.println("Digite as novas medidas para os lados A e B:");
                    int lA = input.nextInt();
                    int lB = input.nextInt();
                    retangulo.mudarValor(lA, lB);
                    break;
                case 3:
                    System.out.println(retangulo.valorLado()+ "\n");
                    break;
                case 0:
                    System.out.println(retangulo.imprimir());
                    sair = false;
                
            }
        } while (sair != false);
    }

    public static String painel() {
        return "Seja bem vindo!\n"
                + "=============================================="
                + "\n Digite 1 para informar as medidas do local."
                + "\n Digite 2 para mudar os valores dos lados."
                + "\n Digite 3 para retornar os valos dos lados."                
                + "\n digite 0 para sair. "
                + "\n ==============================================";
    }

}
