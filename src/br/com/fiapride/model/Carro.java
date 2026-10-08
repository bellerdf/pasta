package br.com.fiapride.model;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    // Novos atributos de estado
    private int velocidadeAtual;
    private boolean ligado;

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        // O carro sempre nasce desligado e parado
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    // Método que altera o estado 'ligado'
    public void ligar() {
        if (this.ligado) {
            // Regra de negócio: não pode ligar um carro que já está ligado
            System.out.println("Erro: O carro já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Ignição acionada. O carro foi ligado!");
        }
    }

    // Método que altera o estado 'velocidadeAtual'
    public void acelerar(int incremento) {
        // Regra de negócio 1: Não pode acelerar desligado
        if (!this.ligado) {
            System.out.println("Erro: Não é possível acelerar com o carro desligado!");
            return;
        }

        // Regra de negócio 2: O incremento não pode ser negativo ou zero
        if (incremento <= 0) {
            System.out.println("Erro: O valor de aceleração deve ser maior que zero!");
            return;
        }

        // Regra de negócio 3: Limite máximo de velocidade (ex: 250 km/h)
        if (this.velocidadeAtual + incremento > 250) {
            System.out.println("Aviso: O carro atingiu a velocidade máxima!");
            this.velocidadeAtual = 250;
        } else {
            this.velocidadeAtual += incremento;
        }

        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    // Método que altera o estado 'cor'
    public void pintar(String novaCor) {
        // Regra de negócio 1: A cor não pode ser vazia ou nula
        if (novaCor == null || novaCor.trim().isEmpty()) {
            System.out.println("Erro: A nova cor fornecida é inválida!");
            return;
        }

        // Regra de negócio 2: Não faz sentido pintar com a mesma cor
        if (novaCor.equalsIgnoreCase(this.cor)) {
            System.out.println("Erro: O carro já é " + this.cor + ". Escolha uma cor diferente!");
            return;
        }

        this.cor = novaCor;
        System.out.println("Carro pintado com sucesso! A nova cor é: " + this.cor);
    }

    // Método sem alteração de estado, mas dependente do estado 'ligado'
    public void tocarMusica(String nomeDaMusica) {
        if (!this.ligado) {
            System.out.println("Erro: O painel está sem energia. Ligue o carro primeiro para tocar música.");
        } else {
            System.out.println("O sistema de som está tocando: " + nomeDaMusica);
        }
    }

    // --- MAIN PARA TESTES ---
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Porsche", "911 Carrera", "Preto");

        System.out.println("--- TESTANDO VALORES INVÁLIDOS / AÇÕES BLOQUEADAS ---");
        meuCarro.acelerar(50);             // Inválido: Carro desligado
        meuCarro.tocarMusica("Playlist");  // Inválido: Carro desligado
        meuCarro.pintar("");               // Inválido: Cor vazia
        meuCarro.pintar("Preto");          // Inválido: Já é preto

        System.out.println("\n--- TESTANDO VALORES VÁLIDOS ---");
        meuCarro.ligar();                  // Válido
        meuCarro.ligar();                  // Inválido: Tentar ligar de novo (Tratado pelo IF)

        meuCarro.tocarMusica("The Weeknd - Blinding Lights"); // Válido
        meuCarro.pintar("Prata Metálico"); // Válido: Mudança de estado (Cor)

        meuCarro.acelerar(60);             // Válido: Mudança de estado (Velocidade)
        meuCarro.acelerar(-20);            // Inválido: Incremento negativo (Tratado pelo IF)
        meuCarro.acelerar(200);            // Válido: Chega no limite de 250 km/h
        meuCarro.acelerar(50);             // Inválido: Não passa de 250 km/h (Tratado pelo IF)
    }
}