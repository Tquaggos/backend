public abstract class Conta {
    private double numero;
    private String agencia;
    private String titular;
    private double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
        IO.println("Você depositou:" + valor);
    }

    public double exibirSaldo(){
        IO.println("Seu saldo é:");
        return saldo;

    }

    public abstract void calcularTarifaMensal();

    public double sacar(double valor){
      return   saldo = saldo - valor;
    }

    public Conta() {
    }

    public Conta(float numero, String agencia, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
