import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente antonio = new Cliente("Antonio");

        Conta corrente = new ContaCorrente(antonio);
        Conta poupanca = new ContaPoupanca(antonio);

        corrente.depositar(100);
        poupanca.sacar(100);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
