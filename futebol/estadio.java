package futebol;

public class estadio {
    private String nome;
    private String cor;
    private int capacidade;
    private int anoFundacao;
    private String gramado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getGramado() {
        return gramado;
    }

    public void setGramado(String gramado) {
        this.gramado = gramado;
    }
}
