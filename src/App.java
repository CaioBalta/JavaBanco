public class App {
    public static void main(String[] args) throws Exception {
       contaBanco contaU0 = new contaBanco("Caio", 15000);
       contaBanco contaU1 = new contaBanco("Maria", 750);
       contaBanco contaU2 = new contaBanco("Baltazar", 2000);
       contaBanco contaU3 = new contaBanco("Nik", 20000);

       contaBanco[] contas = {contaU0,contaU1, contaU2, contaU3};

       Banco banco= new Banco("Itau", contas);
       banco.transf(contaU0, contaU1, 5000);
       banco.exibirConta();
    }
}
