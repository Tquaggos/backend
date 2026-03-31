public class Cc extends Conta {
    public Cc(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Cc() {
    }

    @Override
    public void calcularTarifaMensal() {


        setSaldo(getSaldo() - 12);
        IO.println("Apos a tarifa, seu saldo é:" + exibirSaldo());

    }

}



