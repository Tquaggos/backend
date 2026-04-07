public class PIX extends Pagamento{
    @Override
    void pagar(double valor) {
        IO.println("Seu PIX de:" + valor + "Foi realizado com sucesso");
    }
}
