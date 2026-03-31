public class Pj extends Conta{
    public Pj(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Pj() {

    }


    @Override
    public void calcularTarifaMensal() {
        IO.println("Seu saldo atual é:" + exibirSaldo());
        setSaldo(getSaldo() - 20);
        IO.println("Seu saldo após a tarifa é" + exibirSaldo());
    }

//    @Override
//    public double sacar(double valor) {
//        super.sacar(valor + 1.50);
//       return calcularTarifaMensal();
//    }
}
