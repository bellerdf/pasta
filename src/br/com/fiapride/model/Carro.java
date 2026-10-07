package br.com.fiapride.model;

public class Carro {
    // Atributos privados para garantir o encapsulamento
    private String marca;
    private String modelo;
    private String cor;

    // Construtor para inicializar o objeto com suas características
    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos (Comportamentos)
    public void acelerar() {
        System.out.println("O " + marca + " " + modelo + " está acelerando!");
    }

    public void tocarMusica(String nomeDaMusica) {
        System.out.println("O sistema de som está tocando: " + nomeDaMusica);
    }

    // Getters e Setters para acessar e modificar os atributos de forma segura
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método principal (main) para instanciar e testar a classe
}