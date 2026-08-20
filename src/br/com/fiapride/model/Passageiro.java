package br.com.fiap.model;

public class Passageiro {

    public String nome;
    public String cpf;
    public double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    //  Aplica um cupom de bonus no saldo (porcentagem)
    public void darDesconto(double percentual) {
        if (percentual > 0 && percentual <= 50) {
            double bonus = saldo * (percentual / 100);
            saldo = saldo + bonus;
            System.out.println("Bonus de " + percentual + "% aplicado!");
        } else {
            System.out.println("Percentual de desconto invalido.");
        }
    }

    // Transfere saldo para outro passageiro
    public void transferirSaldo(Passageiro destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transferencia realizada com sucesso.");
        } else {
            System.out.println("Nao foi possivel transferir. Saldo insuficiente ou valor invalido.");
        }
    }
}