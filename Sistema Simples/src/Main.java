//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //  List<Pessoa> banco: representa o banco de dados.
// List<Pessoa> cache: representa os dados mais acessados recentemente.
    List<Pessoa> banco = new ArrayList<>();
    banco.add(new Pessoa(1, "Igor", 20));
    banco.add(new Pessoa(2, "Camily", 19));
    banco.add(new Pessoa(3, "Gabrielle", 20));
    banco.add(new Pessoa(4, "Alice", 19));
    banco.add(new Pessoa(5, "Guilherme", 17));

    List<Pessoa> cache = new ArrayList<>();
//    Funcionalidade:
//    Peça para o usuário digitar um ID de pessoa.
    cache.add(new Pessoa());
    Scanner sc = new Scanner(System.in);
    IO.println("Digite o ID");
    int id = sc.nextInt();
    boolean encontrada = false;

//    Primeiro verifique se a pessoa já está no cache.
//    Se estiver, imprima: Pessoa encontrada no cache: ...
    while (true) {
        for (Pessoa pessoa : cache) {
            if (id == pessoa.getId()) {
                IO.println("Pessoa encontrada no cache: " + pessoa);
                encontrada = true;
                //    Se não estiver, busque no banco:
            }
        }
//    Se encontrar, adicione ao cache e imprima: Pessoa buscada no banco e adicionada ao cache: ...
        if (!encontrada) {
            for (Pessoa pessoa : banco) {
                if (id == pessoa.getId()) {
                    IO.println("Pessoa buscada no banco e adicionada ao cache" + pessoa);
                    cache.add(pessoa);
                }
            }
        }
        IO.println("Digite outro ID");
        id = sc.nextInt();
    }

}