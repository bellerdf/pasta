package br.com.fiapride.model;

public class CarroEsportivo extends Carro {

    // Atributo exclusivo desta classe filha
    private boolean modoTurbo;

    // Construtor
    public CarroEsportivo(String marca, String modelo, String cor, Motorista motorista) {
        // O super() envia os dados obrigatorios para o construtor da classe Mãe (Carro)
        super(marca, modelo, cor, motorista);

        // Atributo exclusivo inicia desligado
        this.modoTurbo = false;
    }

    // Método exclusivo desta classe filha
    public void ativarTurbo() {
        if (!isLigado()) {
            System.out.println("Erro: Não é possível ativar o turbo com o carro desligado!");
            return;
        }
        this.modoTurbo = true;
        System.out.println("🔥 MODO TURBO ATIVADO no " + getModelo() + "! Potência máxima liberada.");
    }
}