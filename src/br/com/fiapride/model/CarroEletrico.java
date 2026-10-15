package br.com.fiapride.model;

public class CarroEletrico extends Carro {

    private int nivelDeBateria;

    public CarroEletrico(String marca, String modelo, String cor, Motorista motorista, int nivelDeBateria) {
        super(marca, modelo, cor, motorista);
        this.nivelDeBateria = nivelDeBateria;
    }

    public void recarregarNaTomada() {
        this.nivelDeBateria = 100;
    }

    // ==========================================
    // SOBRESCRITA (POLIMORFISMO)
    // ==========================================
    @Override
    public double calcularTaxaSeguro() {
        // Regra de negócio: Elétricos têm um desconto ecológico de 20% sobre a base
        System.out.println("Calculando seguro Ecológico (Elétrico)...");
        double seguroBase = super.calcularTaxaSeguro();
        return seguroBase - (seguroBase * 0.20); // Tira 20%
    }
}