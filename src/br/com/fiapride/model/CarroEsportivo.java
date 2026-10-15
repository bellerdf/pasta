package br.com.fiapride.model;

public class CarroEsportivo extends Carro {

    private boolean modoTurbo;

    public CarroEsportivo(String marca, String modelo, String cor, Motorista motorista) {
        super(marca, modelo, cor, motorista);
        this.modoTurbo = false;
    }

    public void ativarTurbo() {
        if (isLigado()) {
            this.modoTurbo = true;
            System.out.println("🔥 MODO TURBO ATIVADO no " + getModelo() + "!");
        }
    }

    // ==========================================
    // SOBRESCRITA (POLIMORFISMO)
    // ==========================================
    @Override
    public double calcularTaxaSeguro() {
        // Regra de negócio: Esportivos pagam o seguro base da mãe + uma taxa de risco de R$ 2.000
        System.out.println("Calculando seguro de Alto Risco (Esportivo)...");
        double seguroBase = super.calcularTaxaSeguro();
        return seguroBase + 2000.00;
    }
}