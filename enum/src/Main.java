//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Pedido pedido = new Pedido(1, "Igor", Status.AGUADNDO_PAGAMENTO);

    IO.println(pedido);

    pedido.setStatus(Status.CANCELADO);
}
