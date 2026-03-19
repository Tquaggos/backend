public class Arqueiro extends Personagem {

    public Arqueiro() {
    }

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void disparoPreciso() {
    }

    public void atacar(int ataque) {
        ataque = ataque * 2;
    }

    public int defender(int defesa){
        return super.defender() - 5;
    }


    public void receberDano(int defesa) {
        IO.println("Seu arqueiro foi atacado!");
        super.receberDano(defesa);
    }

}