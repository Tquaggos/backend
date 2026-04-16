public class Pedido {

    private int id;
    private String nomeCliente;
    private Status status;

    public Pedido() {}

    public Pedido(int id, String nomeCliente, Status status) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeClietne() {
        return nomeCliente;
    }

    public void setNomeClietne(String nomeClietne) {
        this.nomeCliente = nomeClietne;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{ " +
                "id=" + id +
                ", nomeClietne='" + nomeCliente + '\'' +
                ", status=" + status +
                '}';
    }
}
