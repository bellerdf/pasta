package br.com.fiapride.main;

// Importamos o List e o ArrayList para o "Teste de Fogo"
import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.CarroEsportivo;
import br.com.fiapride.model.Motorista;

public class TesteCarro {

    public static void main(String[] args) {
        System.out.println("=== FIAPRIDE: O PODER DO POLIMORFISMO ===\n");

        // 1. Criando os Motoristas
        Motorista isabelle = new Motorista("Isabelle", "111");
        Motorista lucas = new Motorista("Lucas", "222");
        Motorista ana = new Motorista("Ana", "333");

        // 2. Criando objetos de tipos diferentes (Mãe e Filhas)
        Carro carroComum = new Carro("Toyota", "Corolla", "Prata", isabelle);
        CarroEsportivo porsche = new CarroEsportivo("Porsche", "911 Turbo S", "Preto", lucas);
        CarroEletrico tesla = new CarroEletrico("Tesla", "Model 3", "Branco", ana, 100);

        // 3. O TESTE DE FOGO: A Lista Tipada com a Superclasse
        // Como o Esportivo e o Elétrico "são" um Carro, eles cabem na mesma lista!
        List<Carro> frota = new ArrayList<>();
        frota.add(carroComum);
        frota.add(porsche);
        frota.add(tesla);

        // 4. O Laço FOR Polimórfico
        System.out.println("--- CALCULANDO SEGURO DA FROTA ---");

        for (Carro veiculo : frota) {
            System.out.println("\nVeículo: " + veiculo.getMarca() + " " + veiculo.getModelo());

            // A Mágica: O Java descobre sozinho qual método chamar de acordo com o tipo real do objeto criado!
            double valorSeguro = veiculo.calcularTaxaSeguro();

            System.out.println("Proprietário: " + veiculo.getMotorista().getNome());
            System.out.println("Valor a pagar: R$ " + valorSeguro);
            System.out.println("------------------------------------");
        }
    }
}