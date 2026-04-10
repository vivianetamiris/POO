import java.util.*;

public class Logica {

    // Define o tamanho do jogo (4x4 = 16 cartas)
    public static final int TAMANHO = 16;

    // Guarda os valores das cartas (A, B, C...)
    public String[] valores = new String[TAMANHO];

    // Marca quais cartas já foram acertadas
    public boolean[] acertadas = new boolean[TAMANHO];

    // Guarda a posição das cartas escolhidas
    public int primeira = -1;
    public int segunda = -1;

    // Controle do jogo
    public int pontos = 0;
    public int chances = 3;
    public int acertosSeguidos = 0;
    public int paresEncontrados = 0;

    // Controla se a chance surpresa já foi usada
    public boolean usouChanceExtra = false;

    // Símbolos usados no jogo (8 pares)
    String[] simbolos = {
        "A","B","C","D","E","F","G","H"
    };

    // Inicializa e embaralha as cartas
    public void iniciarCartas() {

        ArrayList<String> lista = new ArrayList<>();

        // Cria pares de cada símbolo
        for (int i = 0; i < TAMANHO / 2; i++) {
            lista.add(simbolos[i]);
            lista.add(simbolos[i]);
        }

        // Embaralha a lista para deixar aleatório
        Collections.shuffle(lista);

        // Preenche o vetor de valores e reseta acertos
        for (int i = 0; i < TAMANHO; i++) {
            valores[i] = lista.get(i);
            acertadas[i] = false;
        }
    }

    // Verifica se as duas cartas escolhidas são iguais
    public boolean verificarPar() {
        return valores[primeira].equals(valores[segunda]);
    }

    // Executa quando o jogador acerta um par
    public void tratarAcerto() {

        // Marca as cartas como já acertadas
        acertadas[primeira] = true;
        acertadas[segunda] = true;

        // Aumenta o contador de acertos seguidos
        acertosSeguidos++;

        // Soma pontos com base no combo (10, 20, 30...)
        pontos += 10 * acertosSeguidos;

        // Ganha uma chance ao acertar (máximo 5)
        if (chances < 5) chances++;

        // Se fizer 3 acertos seguidos, ganha bônus de chance
        if (acertosSeguidos == 3 && chances < 5) {
            chances++;
        }

        // Conta quantos pares já foram encontrados
        paresEncontrados++;

        // Limpa seleção das cartas
        resetarJogada();
    }

    // Executa quando o jogador erra
    public void tratarErro() {

        // Perde uma chance
        chances--;

        // Evita que o valor fique negativo
        if (chances < 0) chances = 0;

        // Zera o combo de acertos
        acertosSeguidos = 0;
    }

    // Limpa as cartas selecionadas
    public void resetarJogada() {
        primeira = -1;
        segunda = -1;
    }

    // Verifica se o jogador venceu o jogo
    public boolean venceu() {
        return paresEncontrados == TAMANHO / 2;
    }

    // Verifica se pode ativar a chance surpresa
    public boolean podeUsarChanceExtra() {

        // Só ativa se:
        // - acabou as chances
        // - não acertou nenhum par
        // - ainda não usou a chance extra
        return chances <= 0 && paresEncontrados == 0 && !usouChanceExtra;
    }
}