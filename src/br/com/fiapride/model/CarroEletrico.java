package br.com.fiapride.model;

public class CarroEletrico extends Carro {

    // Atributo exclusivo desta classe filha
    private int nivelDeBateria;

    // Construtor
    public CarroEletrico(String marca, String modelo, String cor, Motorista motorista, int nivelDeBateria) {
        // O super() envia os dados obrigatorios para a Mãe
        super(marca, modelo, cor, motorista);

        // Define o atributo exclusivo
        this.nivelDeBateria = nivelDeBateria;
    }

    // Método exclusivo desta classe filha
    public void recarregarNaTomada() {
        this.nivelDeBateria = 100;
        System.out.println("⚡ Bateria do " + getModelo() + " completamente recarregada (100%).");
    }

    public int getNivelDeBateria() {
        return nivelDeBateria;
    }
}