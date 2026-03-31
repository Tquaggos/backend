//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cc cc = new Cc();
    cc.setSaldo(2500);
    cc.depositar(1000);
    IO.println( cc.sacar(200));
    cc.calcularTarifaMensal();


    Cp cp = new Cp();
    cp.setSaldo(3000);
    cp.depositar(2000);
    IO.println( cp.sacar(200));



    Pj pj = new Pj();
    pj.setSaldo(1500);
    pj.depositar(1000);
    IO.println( pj.sacar(200));




}
