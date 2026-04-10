import javax.swing.*;
import java.awt.*;

public class Interface {

    JFrame frame = new JFrame("Jogo da Memória");

    JButton[] botoes = new JButton[Logica.TAMANHO];

    JLabel status = new JLabel("Encontre os pares!");

    Logica logica;
    Ranking ranking;

    boolean podeJogar = true;

    // Cores mais vivas
    Color fundo = new Color(210, 220, 255);
    Color padrao = new Color(180, 200, 255);
    Color acerto = new Color(120, 200, 255);
    Color erro = new Color(255, 140, 160);
    Color texto = new Color(60, 40, 120);

    public Interface(Logica logica, Ranking ranking) {

        this.logica = logica;
        this.ranking = ranking;

        logica.iniciarCartas();

        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(fundo);

        status.setHorizontalAlignment(SwingConstants.CENTER);
        status.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        status.setForeground(texto);
        frame.add(status, BorderLayout.NORTH);

        JPanel painel = new JPanel(new GridLayout(4,4));
        painel.setBackground(fundo);

        for (int i = 0; i < botoes.length; i++) {

            int index = i;

            botoes[i] = new JButton("?");
            botoes[i].setFont(new Font("Comic Sans MS", Font.BOLD, 18));
            botoes[i].setBackground(padrao);

            botoes[i].addActionListener(e -> clicar(index));

            painel.add(botoes[i]);
        }

        frame.add(painel, BorderLayout.CENTER);

        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void clicar(int i) {

        if (!podeJogar) return;
        if (logica.acertadas[i]) return;
        if (!botoes[i].getText().equals("?")) return;

        botoes[i].setText(logica.valores[i]);
        botoes[i].setBackground(acerto);

        if (logica.primeira == -1) {
            logica.primeira = i;
        } else {
            logica.segunda = i;
            verificar();
        }
    }

    void verificar() {

        if (logica.verificarPar()) {

            int p1 = logica.primeira;
            int p2 = logica.segunda;

            logica.tratarAcerto();

            botoes[p1].setBackground(acerto);
            botoes[p2].setBackground(acerto);

            atualizarStatus();

            if (logica.venceu()) {
                JOptionPane.showMessageDialog(frame, "🎉 Você venceu!");
                ranking.salvar(logica.pontos);
                JOptionPane.showMessageDialog(frame, ranking.getRanking());
            }

        } else {

            int p1 = logica.primeira;
            int p2 = logica.segunda;

            logica.tratarErro();

            botoes[p1].setBackground(erro);
            botoes[p2].setBackground(erro);

            podeJogar = false;

            Timer timer = new Timer(1000, e -> {

                botoes[p1].setText("?");
                botoes[p2].setText("?");

                botoes[p1].setBackground(padrao);
                botoes[p2].setBackground(padrao);

                logica.resetarJogada();
                podeJogar = true;

                atualizarStatus();
            });

            timer.setRepeats(false);
            timer.start();
        }

        // Chance surpresa ou fim (CORRIGIDO)
        if (logica.chances <= 0) {

    if (logica.podeUsarChanceExtra()) {

        logica.chances = 1;
        logica.usouChanceExtra = true;

        JOptionPane.showMessageDialog(frame,
                "✨ Chance surpresa! Você ganhou mais uma tentativa!");

        atualizarStatus();

    } else {

        JOptionPane.showMessageDialog(frame, "💀 Fim de jogo!");
        
        ranking.salvar(logica.pontos);
        
        JOptionPane.showMessageDialog(frame, ranking.getRanking());

        // 🔴 FECHA O JOGO
        frame.dispose();
    }
        }
    }

    // Atualiza o texto do topo
    void atualizarStatus() {
        status.setText("Pontos: " + logica.pontos + " | Chances: " + logica.chances);
    }
}