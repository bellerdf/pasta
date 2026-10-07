package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class Principal2{
    public static void main(String[] args) {
        // Criando o objeto (instanciando a classe)
        Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto");

        System.out.println("Carro criado: " + meuCarro.getMarca() + " " + meuCarro.getModelo() + " - Cor: " + meuCarro.getCor());

        // Chamando os métodos do objeto
        meuCarro.acelerar();
        meuCarro.tocarMusica("The Weeknd - Blinding Lights");
    }
}

