package br.com.fiap.main;

import br.com.fiap.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando os passageiros
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        passageiro1.saldo = 50.0; // Definindo saldo inicial para teste

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        passageiro2.saldo = 10.0;

        System.out.println(" Sistema FiapRide");
        System.out.println("Passageiro 1: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo);
        System.out.println("Passageiro 2: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo);

        //  Aplicando bônus no passageiro 1
        System.out.println("\nAplicando bonus para passageiro 1:");
        passageiro1.darDesconto(10); // Dá 10% de bônus sobre os 50 reais

        //  Transferindo saldo do passageiro 1 para o passageiro 2
        System.out.println("\nTransferindo saldo do passageiro 1 para o passageiro 2:");
        passageiro1.transferirSaldo(passageiro2, 15.0);

        System.out.println("\n Saldo Final");
        System.out.println("Passageiro 1: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo);
        System.out.println("Passageiro 2: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo);
    }
}