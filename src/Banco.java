public class Banco {
    public String nome;
    public contaBanco[] contas;

    public Banco(String nome, contaBanco[] contas){
        this.nome = nome;
        this.contas = contas;
    }

    public void exibirConta(){
        for(contaBanco conta: contas){
            System.out.println(conta);
        }
    }

    public void calculoConta(){
        double saldoTotal = 0;
        for(contaBanco cs: contas){
            saldoTotal += cs.saldo;
        }
        System.out.println("O saldo geral é: " + saldoTotal);
    }

    public void transf(contaBanco contaOrigem, contaBanco contaDestino, double valor) {
            if (contaOrigem.sacar(valor)) {
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$ " + valor + " realizada da conta " + contaOrigem.nome + " para a conta " + contaDestino.nome + "\n" +"\n");
            }

    }
}
