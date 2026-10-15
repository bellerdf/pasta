package br.com.fiapride.model;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private boolean ligado;
    private Motorista motorista;

    // Construtor da Superclasse
    public Carro(String marca, String modelo, String cor, Motorista motorista) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motorista = motorista;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("Erro: O carro já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Ignição acionada. O carro foi ligado!");
        }
    }

    public void acelerar(int incremento) {
        if (!this.ligado) {
            System.out.println("Erro: Não é possível acelerar com o carro desligado!");
            return;
        }
        if (incremento <= 0) {
            System.out.println("Erro: O valor de aceleração deve ser maior que zero!");
            return;
        }

        if (this.velocidadeAtual + incremento > 250) {
            System.out.println("Aviso: O carro atingiu o limite padrão de 250 km/h!");
            this.velocidadeAtual = 250;
        } else {
            this.velocidadeAtual += incremento;
        }
        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    // Getters para as filhas poderem aceder aos dados
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public Motorista getMotorista() { return motorista; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public boolean isLigado() { return ligado; }
}