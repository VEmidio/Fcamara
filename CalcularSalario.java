package calcularsalario;

/**
 *
 * @author vinicius
 */
import java.util.Scanner;

public class CalcularSalario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double hrTraMes;
        double vlrSalarioMes;
        
        System.out.println("Digite o nÃºmero de horas trabalhadas em um mês:");
        hrTraMes = input.nextDouble();
        
        System.out.println("Digite o valor do salÃ¡rio minimo: ");
        vlrSalarioMes = input.nextDouble();
        
        double valorHr = vlrSalarioMes * 0.1;
        
        double salarioBruto = valorHr * hrTraMes;
        
        double imposto = salarioBruto * 0.03;
        double salarioLi = salarioBruto - imposto; 
        System.out.println("SalÃ¡rio a receber: " + salarioLi);
        
        
    }
    
}