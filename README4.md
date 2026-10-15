# 🔗 FiapRide - Associação de Objetos (POO)

Este repositório documenta a implementação do **Microdesafio: Conectando seu Mundo**. O objetivo principal foi aplicar o conceito de **Associação** da Programação Orientada a Objetos (POO), demonstrando que objetos no mundo real não existem isolados, mas sim conectados a outros objetos.

## 🌍 O que foi implementado?

Anteriormente, a classe `Carro` existia de forma solitária no sistema. Agora, o sistema reflete uma regra de negócio mais realista: **Todo carro precisa de um motorista responsável.**

Para resolver isso, criamos uma nova classe (`Motorista`) e a conectamos ao objeto principal (`Carro`).

### 📌 Conceitos de POO Aplicados

* **Associação:** A classe `Carro` agora possui um atributo do tipo `Motorista`. Dizemos que o Carro "tem um" Motorista.
* **Injeção de Dependência (via Construtor):** O construtor da classe `Carro` foi atualizado para exigir um objeto `Motorista` no momento de sua criação. Não é mais possível instanciar um carro "fantasma" sem dono.
* **Navegação de Objetos:** Demonstramos como acessar dados de um objeto através de outro (ex: `meuCarro.getMotorista().getNome()`).

## 🏗️ Estrutura das Classes

1. **`Motorista.java` (A Nova Classe Associada)**
   * Representa a pessoa física.
   * Contém atributos próprios como `nome` e `cnh`.

2. **`Carro.java` (A Classe Principal Atualizada)**
   * Representa o veículo.
   * Recebeu o atributo `private Motorista motorista;`.
   * O construtor foi modificado: `public Carro(String marca, String modelo, String cor, Motorista motorista)`.

3. **`SistemaPrincipal.java` (O Teste)**
   * Responsável por "dar vida" ao Motorista primeiro.
   * Instancia o Carro passando o Motorista no construtor.
   * Testa a associação imprimindo os dados de ambas as classes juntas.

## 💻 Exemplo de Uso

No método `main`, a associação acontece desta forma:

```java
// 1. Criamos a classe associada primeiro
Motorista motoristaIsabelle = new Motorista("Isabelle Ramos", "123456789-00");

// 2. Criamos a classe principal passando o objeto associado no construtor
Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto", motoristaIsabelle);

// 3. Navegando entre as classes para acessar a informação
System.out.println("Veículo: " + meuCarro.getModelo());
System.out.println("Motorista responsável: " + meuCarro.getMotorista().getNome());
