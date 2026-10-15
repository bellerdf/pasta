# 🚗 FiapRide - Sistema de Gerenciamento de Veículos (POO)

Este repositório consolida a implementação prática dos pilares da **Programação Orientada a Objetos (POO)** em Java. O projeto simula o funcionamento de uma garagem/sistema de veículos e foi construído em etapas (microdesafios), garantindo segurança, estruturação e reutilização de código.

## 🌟 O que foi implementado?

O sistema foi evoluindo através da aplicação das seguintes regras de negócio e conceitos arquiteturais:

### 1️⃣ Encapsulamento e Proteção de Estado
Os atributos do `Carro` (como velocidade, cor e status) foram protegidos (`private`). As alterações só ocorrem através de métodos seguros (`acelerar()`, `ligar()`, `pintar()`) que contêm validações rigorosas (ex: um carro não pode acelerar se estiver desligado, nem ultrapassar 250 km/h). 
Criou-se também uma **Regra Especial no Setter**, onde a `capacidadeDoTanque` só aceita valores reais (entre 30 e 120 litros).

### 2️⃣ O Nascimento do Objeto (Construtores)
Para evitar que veículos "fantasmas" existam no sistema, implementamos um construtor obrigatório. Todo objeto `Carro` só é instanciado se receber as informações vitais no momento de sua criação (Marca, Modelo e Cor).

### 3️⃣ Conectando o Mundo (Associação)
No mundo real, os objetos não existem isolados. Criamos a classe `Motorista` e a associamos à classe `Carro`. Agora, o veículo depende da existência de um motorista responsável, e a injeção dessa dependência ocorre no próprio construtor.

### 4️⃣ Criando Herdeiros (Herança)
Para evitar repetição de código, a classe `Carro` tornou-se uma Superclasse (Mãe). A partir dela, estendemos duas novas subclasses especializadas usando `extends`:
* **`CarroEsportivo`**: Herda tudo do carro comum, mas possui o método exclusivo `ativarTurbo()`.
* **`CarroEletrico`**: Herda tudo do carro comum, mas gerencia `nivelDeBateria` e possui o método exclusivo `recarregarNaTomada()`.

## 🏗️ Estrutura do Projeto

* `br.com.fiapride.model` *(Regras de negócio e moldes)*
  * `Motorista.java`
  * `Carro.java` (Superclasse)
  * `CarroEsportivo.java` (Subclasse)
  * `CarroEletrico.java` (Subclasse)
* `br.com.fiapride.main` *(Execução e testes)*
  * `TesteCarro.java`

## 🚀 Como Executar

1. Clone o repositório em sua máquina.
2. Abra o projeto em sua IDE de preferência (IntelliJ IDEA, Eclipse, etc).
3. Navegue até o arquivo principal
