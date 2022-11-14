package banco;

import conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco
{
    private String nome;
    private List<Conta> contasFiliadas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void cadastrarConta(Conta conta)
    {
        this.contasFiliadas.add(conta);
    }

    public void listarClientes()
    {
        System.out.printf("<<<<<<<<<<< %s >>>>>>>>>>>\n", this.nome.toUpperCase());
        for (Conta conta : contasFiliadas)
        {
            System.out.printf(conta.getCliente().getNome() + "\n");
        }
        System.out.printf("<<<<<<<<<<< FIM >>>>>>>>>>>\n");

    }


}
