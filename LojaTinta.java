package lojatinta;
import java.util.Scanner;
public class LojaTinta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precoLitro = 4.44;
        double area;
        double lata = 18;
        
        System.out.println("Digite a tamanho da área a ser pintada em m².");
        area = input.nextDouble();
        
        double litroTinta = area * 0.33;
        lata = litroTinta / lata;
        precoLitro = litroTinta * precoLitro;
        
        System.out.println("A quantidae de latas de 18Lt de tinta a ser usada para pintar a área : " + lata
        + " e o preço é de: " + precoLitro);
        
        
    }
    
}
