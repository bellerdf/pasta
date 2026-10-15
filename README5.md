# 🚗 FiapRide - Sistema de Gerenciamento de Veículos (POO)

Este projeto é uma simulação de um sistema de veículos desenvolvido em **Java**, focado na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**. O sistema demonstra como classes interagem entre si e como podemos reutilizar código através de hierarquias.

## 📌 Conceitos de POO Aplicados

* **Associação:** A classe `Carro` possui uma dependência direta da classe `Motorista`. Um carro não é instanciado sem um motorista responsável.
* **Herança:** Criação de uma classe mãe (`Carro`) genérica, que compartilha seus atributos e métodos básicos com classes filhas mais especializadas (`CarroEsportivo` e `CarroEletrico`), utilizando a palavra-chave `extends`.
* **Encapsulamento:** Proteção do estado dos objetos com modificadores `private`, garantindo que alterações (como acelerar ou ligar) passem por regras de negócio e validações lógicas.

## 🏗️ Estrutura do Projeto

O projeto está dividido em duas camadas principais: o pacote de **modelo (model)** para as regras de negócio e o pacote **principal (main)** para a execução.

### Classes de Modelo (`br.com.fiapride.model`)

1. **`Motorista`:**
   * Representa o usuário do sistema.
   * Atributos: `nome`, `cnh`.
2. **`Carro` (Superclasse / Classe Mãe):**
   * Representa a base de qualquer veículo do sistema.
   * Atributos: `marca`, `modelo`, `cor`, `velocidadeAtual`, `ligado`, `motorista`.
   * Métodos: `ligar()`, `acelerar(int)`, `pintar(String)`, `tocarMusica(String)`.
3. **`CarroEsportivo` (Subclasse / Classe Filha):**
   * Herda de `Carro`.
   * Atributo exclusivo: `modoTurbo` (boolean).
   * Método exclusivo: `ativarTurbo()`.
4. **`CarroEletrico` (Subclasse / Classe Filha):**
   * Herda de `Carro`.
   * Atributo exclusivo: `nivelDeBateria` (int).
   * Método exclusivo: `recarregarNaTomada()`.

### Classe de Execução (`br.com.fiapride.main`)

* **`TesteCarro`:**
  * Ponto de entrada (`main`) do programa.
  * Responsável por instanciar os motoristas, criar os veículos (Esportivo e Elétrico) e testar os métodos herdados da classe mãe combinados com as ações exclusivas de cada filha.

## 🚀 Como Executar

1. Clone o repositório ou baixe os arquivos fonte.
2. Abra o projeto em sua IDE (IntelliJ IDEA, Eclipse, etc.).
3. Certifique-se de que a estrutura de pacotes (`br.com.fiapride.model` e `br.com.fiapride.main`) está correta.
4. Navegue até o arquivo `TesteCarro.java`.
5. Execute a classe (Run `TesteCarro.main()`).
6. Acompanhe a saída no console para ver o comportamento do encapsulamento e da herança em tempo real.

## 💻 Exemplo de Código (Herança)

```java
// Instanciando a classe filha com parâmetros exigidos pela mãe (super) + parâmetros exclusivos
Motorista lucas = new Motorista("Lucas Silva", "987654321-11");
CarroEletrico tesla = new CarroEletrico("Tesla", "Model 3", "Branco", lucas, 15);

tesla.ligar();                // Método herdado da classe Carro
tesla.recarregarNaTomada();   // Método exclusivo da classe CarroEletrico
