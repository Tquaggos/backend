//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CartãoCredito cartãoCredito = new CartãoCredito();
        cartãoCredito.pagar(1000);
    IO.println("============================");


    CartãoDebito cartãoDebito = new CartãoDebito();
        cartãoDebito.pagar(1000);
    IO.println("============================");


    PIX pix = new PIX();
    pix.pagar(280);
    IO.println("============================");


    Boleto boleto = new Boleto();
    boleto.pagar(3000);
    IO.println("============================");
}
