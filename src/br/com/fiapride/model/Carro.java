package br.com.fiapride.model;

public class Carro {
    // Atributos de identificação
    private String marca;
    private String modelo;
    private String cor;

    // Atributos de estado e associação
    private int velocidadeAtual;
    private boolean ligado;
    private int capacidadeDoTanque;
    private Motorista motorista;

    // Construtor atualizado para exigir o Motorista no momento da criação
    public Carro(String marca, String modelo, String cor, Motorista motorista) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motorista = motorista;

        // O carro sempre nasce desligado e parado
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    // ==========================================
    // MÉTODOS DE COMPORTAMENTO E REGRAS DE NEGÓCIO
    // ==========================================

    public void ligar() {
        if (this.ligado) {
            System.out.println("Erro: O carro já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Ignição acionada. O carro foi ligado!");
        }
    }

    public void acelerar(int incremento) {
        // Regra 1: Precisa estar ligado
        if (!this.ligado) {
            System.out.println("Erro: Não é possível acelerar com o carro desligado!");
            return;
        }

        // Regra 2: Incremento válido (não pode ser negativo)
        if (incremento <= 0) {
            System.out.println("Erro: O valor de aceleração deve ser maior que zero!");
            return;
        }

        // Regra 3: Limite físico de velocidade
        if (this.velocidadeAtual + incremento > 250) {
            System.out.println("Aviso: O carro atingiu a velocidade máxima de 250 km/h!");
            this.velocidadeAtual = 250;
        } else {
            this.velocidadeAtual += incremento;
        }

        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    public void pintar(String novaCor) {
        if (novaCor == null || novaCor.trim().isEmpty()) {
            System.out.println("Erro: A nova cor fornecida é inválida!");
            return;
        }

        if (novaCor.equalsIgnoreCase(this.cor)) {
            System.out.println("Erro: O carro já é " + this.cor + ". Escolha uma cor diferente!");
            return;
        }

        this.cor = novaCor;
        System.out.println("Carro pintado com sucesso! A nova cor é: " + this.cor);
    }

    public void tocarMusica(String nomeDaMusica) {
        if (!this.ligado) {
            System.out.println("Erro: O painel está sem energia. Ligue o carro primeiro para tocar música.");
        } else {
            System.out.println("O sistema de som está tocando: " + nomeDaMusica);
        }
    }

    // ==========================================
    // GETTERS E SETTERS
    // ==========================================

    public void setCapacidadeDoTanque(int litros) {
        // Regra de negócio especial no Setter
        if (litros < 30 || litros > 120) {
            System.out.println("Erro: Capacidade inválida! O tanque deve ter entre 30 e 120 litros.");
        } else {
            this.capacidadeDoTanque = litros;
        }
    }

    public int getCapacidadeDoTanque() { return capacidadeDoTanque; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public boolean isLigado() { return ligado; }

    // Getters e Setters da Associação com Motorista
    public Motorista getMotorista() { return motorista; }
    public void setMotorista(Motorista motorista) { this.motorista = motorista; }
}