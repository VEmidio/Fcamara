package appconta;

public class Conta {

    private int numeroConta;
    private String nomePessoa;
    private double saldo;

    public Conta(int numeroConta, String nomePessoa) {
        this.numeroConta = numeroConta;
        this.nomePessoa = nomePessoa;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alterarNome(String nome) {
        setNomePessoa(nome);
    }

    public double deposito(double valor) {
        if (valor > 0) {
            setSaldo(valor);
            return getSaldo();
        }else
            return -1;
    }
    public void saque(double valor){
        if (valor > 0) {
            double x = getSaldo();
            x = x - valor;
            setSaldo(x);
        }
        
    }
    public String imprimir(){
        return "================================="
                +  "\n Nome correntista: " + getNomePessoa()
                + "\n Número da conta: " + getNumeroConta()
                + "\n Saldo Disponível: " + getSaldo()
                + "\n =================================";
    }

}
