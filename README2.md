# 🚗 Simulador de Carro em Java (POO)

Este projeto é uma demonstração prática dos conceitos fundamentais de Programação Orientada a Objetos (POO) em Java. Ele foca na implementação de **Encapsulamento**, **Controle de Estado** e validação de **Regras de Negócio**.

## 🌍 O que o objeto representa no mundo real?

A classe `Carro` é uma abstração de um veículo físico do mundo real. Assim como um automóvel de verdade, o nosso objeto possui:

*   **Características (Atributos fixos):** Uma marca, um modelo e uma cor original de fábrica.
*   **Estado (Atributos mutáveis):** Ele sabe se o motor está ligado ou desligado e qual é a sua velocidade exata em um dado momento.
*   **Comportamentos (Métodos):** Ações que o carro pode realizar, como dar a partida, acelerar, ligar o sistema de som ou passar por uma funilaria para mudar de cor.

## ⚙️ Funcionamento da Classe e Regras de Negócio

Para garantir que o nosso carro virtual se comporte como um carro real, o estado do objeto foi protegido. Não é possível alterar os atributos diretamente, e todos os métodos possuem validações rigorosas (regras de negócio):

*   `ligar()`: Dá a partida no motor.
    *   *Validação:* Impede que o usuário tente ligar um carro que já está com o motor funcionando.
*   `acelerar(int incremento)`: Aumenta a velocidade do veículo.
    *   *Validação 1:* O carro obrigatoriamente precisa estar ligado.
    *   *Validação 2:* Não é permitido acelerar com valores negativos ou zero.
    *   *Validação 3:* Existe um limitador de velocidade física fixado em 250 km/h.
*   `pintar(String novaCor)`: Altera a cor atual do veículo.
    *   *Validação 1:* A cor fornecida não pode estar vazia ou nula.
    *   *Validação 2:* O sistema bloqueia a pintura se a nova cor for idêntica à cor atual.
*   `tocarMusica(String nomeDaMusica)`: Aciona o sistema de entretenimento.
    *   *Validação:* O rádio depende da bateria do carro, portanto, só funciona se o veículo estiver ligado.

## 🚀 Como utilizar

O projeto está dividido em duas classes:
1.  `Carro.java`: Contém a estrutura do objeto, seus atributos e regras lógicas.
2.  `Principal.java`: É o ponto de entrada do programa, onde instanciamos (criamos) o objeto e testamos suas funções.

### Exemplo de uso:

```java
// 1. Criando um novo carro
Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto");

// 2. Tentativa de acelerar (Vai falhar, pois está desligado)
meuCarro.acelerar(50); 

// 3. Ligando o carro corretamente
meuCarro.ligar();

// 4. Utilizando os sistemas e acelerando
meuCarro.tocarMusica("The Weeknd - Blinding Lights");
meuCarro.acelerar(60);

// 5. Mudando a cor na funilaria
meuCarro.pintar("Prata Metálico");