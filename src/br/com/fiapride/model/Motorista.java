package br.com.fiapride.model;

public class Motorista {
    private String nome;
    private String cnh;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }

}
