public class Boleto extends Pagamento{

    @Override
    void pagar(double valor) {
        IO.println("Seu boleto de :" + valor + "foi realizado com sucesso");
    }
}
