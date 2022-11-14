package conta;

import cliente.Cliente;

public abstract class Conta implements ContaInterface
{
    protected static final String AGENCIA_PADRAO = "1";
    protected static int sequencial = 0;
    protected String agencia;
    protected String numero;
    protected double saldo = 0d;
    protected Cliente cliente;

    public Conta(Cliente cliente)
    {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = String.valueOf(sequencial++);
        this.cliente = cliente;
    }


    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato()
    {
        System.out.printf("<<<<<<<<<<< EXTRATO >>>>>>>>>>>\nTitular: %s\nAgencia: %s\nNumero: %s\nSaldo: %.2f\n<<<<<<<<<<<<< FIM >>>>>>>>>>>>>\n",
                this.cliente.getNome(), this.agencia, this.numero, this.saldo);
    }
}
