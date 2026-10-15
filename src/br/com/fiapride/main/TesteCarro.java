package br.com.fiapride.main;

// Importando as classes do pacote model
import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.CarroEsportivo;
import br.com.fiapride.model.Motorista;

public class TesteCarro {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA FIAPRIDE: TESTE DE HERANÇA ===\n");

        // 1. Criando os Motoristas
        Motorista isabelle = new Motorista("Isabelle Ramos", "123456789-00");
        Motorista lucas = new Motorista("Lucas Silva", "987654321-11");

        // ====================================================================
        // TESTE 1: CARRO ESPORTIVO
        // ====================================================================
        System.out.println("--- DADOS DO CARRO ESPORTIVO ---");
        CarroEsportivo porsche = new CarroEsportivo("Porsche", "911 Turbo S", "Preto", isabelle);

        // Exibindo dados herdados da classe Mãe
        System.out.println("Veículo: " + porsche.getMarca() + " " + porsche.getModelo());
        System.out.println("Piloto: " + porsche.getMotorista().getNome());

        // Usando método herdado da classe Mãe
        porsche.ligar();
        porsche.acelerar(100);

        // Usando o método EXCLUSIVO da classe Filha
        porsche.ativarTurbo();

        System.out.println("\n------------------------------------------------\n");

        // ====================================================================
        // TESTE 2: CARRO ELÉTRICO
        // ====================================================================
        System.out.println("--- DADOS DO CARRO ELÉTRICO ---");
        // Nota que o construtor do elétrico exige um 5º parâmetro (Nível de Bateria)
        CarroEletrico tesla = new CarroEletrico("Tesla", "Model 3", "Branco", lucas, 15);

        // Exibindo dados herdados da classe Mãe e dados Exclusivos
        System.out.println("Veículo: " + tesla.getMarca() + " " + tesla.getModelo());
        System.out.println("Motorista: " + tesla.getMotorista().getNome());
        System.out.println("Bateria atual: " + tesla.getNivelDeBateria() + "%");

        // Usando método herdado da classe Mãe
        tesla.ligar();
        tesla.acelerar(40);

        // Usando o método EXCLUSIVO da classe Filha
        tesla.recarregarNaTomada();
    }
}