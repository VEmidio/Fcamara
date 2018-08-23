package aumentosalarial;

import java.text.DecimalFormat;
import java.util.Calendar;


public class AumentoSalarial {

    public static void main(String[] args) {
        double salarioInc = 1000;
        int dtInc = 2005;
        double aumento = 0.015;
        
        
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        
        
        while(dtInc <= ano){
            double total;
            total = salarioInc * aumento;
            salarioInc = salarioInc + total;
            
            aumento =+ aumento * 2;            
            DecimalFormat df = new DecimalFormat("#,###.00");
            System.out.println("Salário recebido com aumento no ano " + dtInc + ": " + df.format(salarioInc));
            ++dtInc;
        }
    }
    
}
