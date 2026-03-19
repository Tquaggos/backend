public class Guerreiro extends Personagem {

    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void receberDano(int defesa){
        IO.println("Seu Guerreiro foi atacado!");
        defesa = defesa * 2;
    }
}
