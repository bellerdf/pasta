package br.com.fiapride.main;

// Importando as duas classes necessárias do pacote model
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Motorista;

public class TesteCarro {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO O SISTEMA DA GARAGEM ===\n");

        // 1. NOVA REGRA: Precisamos criar o Motorista ANTES do carro
        Motorista motoristaIsabelle = new Motorista("Isabelle Ramos", "123456789-00");

        // 2. CORREÇÃO DO ERRO: Passando as 4 informações, incluindo o objeto motorista no final
        Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto", motoristaIsabelle);

        // 3. Testando os bloqueios (regras de negócio)
        System.out.println("--- TESTANDO AÇÕES BLOQUEADAS ---");
        meuCarro.acelerar(50);             // Inválido: Carro desligado
        meuCarro.tocarMusica("Playlist");  // Inválido: Carro desligado

        System.out.println(); // Quebra de linha para organizar o console

        // 4. Testando o fluxo ideal (ações permitidas)
        System.out.println("--- TESTANDO AÇÕES VÁLIDAS ---");
        meuCarro.ligar();                  // Válido
        meuCarro.tocarMusica("The Weeknd - Blinding Lights");

        meuCarro.pintar("Prata Metálico"); // Válido: Muda o estado da cor

        meuCarro.acelerar(60);             // Válido: Acelera normalmente
    }
}