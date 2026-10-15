package br.com.fiapride.model;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private boolean ligado;
    private Motorista motorista;

    public Carro(String marca, String modelo, String cor, Motorista motorista) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motorista = motorista;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public void ligar() {
        if (this.ligado) System.out.println("Erro: O carro já está ligado!");
        else {
            this.ligado = true;
            System.out.println("Ignição acionada no " + modelo + "!");
        }
    }

    public void acelerar(int incremento) {
        if (!this.ligado) return;
        if (this.velocidadeAtual + incremento > 250) this.velocidadeAtual = 250;
        else this.velocidadeAtual += incremento;
    }

    // ==========================================
    // MÉTODO GENÉRICO PARA POLIMORFISMO
    // ==========================================
    public double calcularTaxaSeguro() {
        // Regra de negócio: Seguro base de um carro comum é R$ 1.500,00
        System.out.println("Calculando seguro Padrão...");
        return 1500.00;
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public Motorista getMotorista() { return motorista; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public boolean isLigado() { return ligado; }
}