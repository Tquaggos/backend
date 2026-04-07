public class CartãoDebito extends Pagamento{
    @Override
    void pagar(double valor) {
        IO.println("Seu pagamento de :" + valor + "foi realizado com sucesso");
    }
}
