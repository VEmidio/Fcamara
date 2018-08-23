package appretangulo;

/**
 *
 * @author vinicius
 */
public class Retangulo {
    
    int ladoA, ladoB;
    int base, altura;
    
    public Retangulo(){}
    
    public String valorLado(){
        return "\n Lado A: " + ladoA
                + "\n Lado B: " + ladoB ;
    }
    public void mudarValor(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public int calcularArea(){
        int area = base * ladoA;
        return area;
    }
    public int perimetro(){
        int perimetro = ladoA + ladoB + base + altura;
        return perimetro;
    }
    public String imprimir(){
        return "valores da área:"
                + "\n ==============================================="
                +  valorLado()
                + "\n base e altura: " + base + "m" + ", " + altura + "m"
                + "\n tamanho da área em m²: " + calcularArea() + "m²"
                + "\n tamanho do perímetro em m: " + perimetro() + "m"
                +"\n ===============================================";
    }
    
    
}
