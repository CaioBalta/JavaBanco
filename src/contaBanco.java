import java.util.Random;

public class contaBanco {
    Random random = new Random();
    public String nome; 
    public int nc = random.nextInt(10000);
    public double saldo;
   

    public contaBanco( String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: \n" +"Olá " + nome + " Numero da conta: "+ nc + "\n" + "Seu saldo é: " + saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente na conta " + nc);
            return false;
        }
    }
}
