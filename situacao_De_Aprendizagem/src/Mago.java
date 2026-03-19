public class Mago extends Personagem{

    public Mago() {

    }

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public int lancarMagia(){
        return super.atacar() + 15;
    }

    public int atacar(int ataque){
        return super.atacar();
    }

    public int defender(int defesa){
        return super.defender() - 5;
    }

    public void receberDano(int defesa){
        IO.println("Seu Mago foi atacado!");
        setVida(getVida()-20);
    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();

    }
}
