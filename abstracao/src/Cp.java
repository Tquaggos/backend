public class Cp extends Conta{
    public Cp(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Cp() {
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("Sua conta não tem tarifa. Seu saldo é:" + exibirSaldo());

    }


}
