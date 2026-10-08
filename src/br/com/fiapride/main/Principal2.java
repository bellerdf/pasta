package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class Principal2 {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO O SISTEMA DA GARAGEM ===\n");

        // 1. Instanciando o objeto usando a classe Carro que criamos
        Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto");

        // 2. Testando os bloqueios (regras de negócio)
        System.out.println("--- TESTANDO AÇÕES BLOQUEADAS ---");
        meuCarro.acelerar(50);             // Inválido: Carro desligado
        meuCarro.tocarMusica("Playlist");  // Inválido: Carro desligado
        meuCarro.pintar("Preto");          // Inválido: Já tem essa cor

        System.out.println(); // Quebra de linha para organizar o console

        // 3. Testando o fluxo ideal (ações permitidas)
        System.out.println("--- TESTANDO AÇÕES VÁLIDAS ---");
        meuCarro.ligar();                  // Válido
        meuCarro.tocarMusica("The Weeknd - Blinding Lights");

        meuCarro.pintar("Prata Metálico"); // Válido: Muda o estado da cor

        meuCarro.acelerar(60);             // Válido: Acelera normalmente
        meuCarro.acelerar(200);            // Válido: Vai bater no limite de 250km/h
        meuCarro.acelerar(50);             // Inválido: Sistema não deixa passar do máximo
    }
}
