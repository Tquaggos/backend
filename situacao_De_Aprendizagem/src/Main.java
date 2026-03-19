//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Personagem arqueiro = new Arqueiro("Verde",100,20,15);
    Personagem guerreiro = new Guerreiro("Claiton", 100,10,30);
    Personagem mago = new Mago("Merlin", 100,30,10);

    mago.mostrarStatus();

    arqueiro.receberDano(mago.atacar());

    arqueiro.mostrarStatus();

    mago.receberDano(arqueiro.atacar());
    mago.mostrarStatus();

    arqueiro.receberDano(arqueiro.defender());
    arqueiro.mostrarStatus();

    mago.receberDano(mago.defender());
    mago.mostrarStatus();
}
