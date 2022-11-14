import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente antonio = new Cliente("Antonio");

        Conta corrente = new ContaCorrente(antonio);
        Conta poupanca = new ContaPoupanca(antonio);

        Banco santander = new Banco("Santander");

        santander.cadastrarConta(corrente);
        santander.listarClientes();
    }
}
