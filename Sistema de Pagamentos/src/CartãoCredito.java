import java.util.Scanner;

public class CartãoCredito extends Pagamento{

    @Override
    void pagar(double valor) {
        Scanner sc = new Scanner(System.in);
        IO.println("Escolha uma opção");
        IO.println("1 - Pagamento a vista");
        IO.println("2 - 2x sem juros");
        IO.println("3 - 3x sem juros");
        int escolha = sc.nextInt();
        if (escolha == 1){
            IO.println("Seu pagamento" + valor + " foi realizado a vista ");
        } else if (escolha == 2) {
            IO.println("Seu pagamento" + valor + " foi realizado em 2x sem juros");
        }else{
            IO.println("Seu pagamento" + valor + " foi realizado em 3x sem juros");
        }
    }
}
