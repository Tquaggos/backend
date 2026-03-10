public class Torta extends Doce{
    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Limão");
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Massa Podre");
    }
}
