public class Pedido {
    private int id;
    private String cliente;
    private StatusPedidos status;

    public Pedido() {
    }

    public Pedido(int id, String cliente, StatusPedidos status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedidos getStatus() {
        return status;
    }

    public void setStatus(StatusPedidos status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }

    public void avancarStatus(Pedido pedido) {
        IO.println("Status do Pedido");
        if (pedido.getStatus() == StatusPedidos.AGUARDANDO_PAGAMENTO) {
            pedido.setStatus(StatusPedidos.PROCESSANDO);
        } else if (pedido.getStatus() == StatusPedidos.PROCESSANDO) {
            pedido.setStatus(StatusPedidos.ENVIADO);
        } else if (pedido.getStatus() == StatusPedidos.ENVIADO){
            pedido.setStatus(StatusPedidos.ENTREGUE);
        }else{
        IO.println("O pedido não pode ser alterado");
    }
}


public void cancelarPedido(Pedido pedido) {
    if (pedido.getStatus() != StatusPedidos.ENVIADO) {
        IO.println("Status do Pedido");
        pedido.setStatus(StatusPedidos.CANCELADO);
    } else {
        IO.println("O pedido ja foi enviado, impossivel cancelar");
    }
}



}
