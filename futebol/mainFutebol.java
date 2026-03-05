package futebol;

public class mainFutebol {
    static void main() {


        clube palmeiras = new clube();
        palmeiras.setNome("Palmeiras");

        estadio allianz = new estadio();
        allianz.setNome("Allianz Parque");

        jogador FernandoPrass = new jogador();
        FernandoPrass.setNome("Fernado Prass");

        presidente Galiotte = new presidente();
        Galiotte.setNome("Mauricio Galiotte");

        treinador Abel = new treinador();
        Abel.setNome("Abel Ferreira");

        torcida ManchaVerde = new torcida();
        ManchaVerde.setNome("Mancha Verde");

        IO.println(palmeiras.getNome() + allianz.getNome() + FernandoPrass.getNome() + Galiotte.getNome() + Abel.getNome()  + ManchaVerde.getNome());
    }
}
