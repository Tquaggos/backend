public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;


    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Personagem(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int defender(){
        return 5;
    }

    public int atacar(){
        return getAtaque();
    }

    public void receberDano(int dano) {

        if (defesa < dano) {
            vida = vida + defesa - dano;
            IO.println("A vida é " + vida);
        }else {
            IO.println("Ataque neutralizado");
    }


    }

    public void mostrarStatus() {
        IO.println(nome +" A vida é " + vida + " O ataque é " + ataque + " A defesa é " +  defesa);
    }


}
