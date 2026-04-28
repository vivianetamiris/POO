import java.util.ArrayList;
import java.util.List;

public class EstacaoClimatica {
    private List<ObservadorClima> observadores = new ArrayList<>();
    private float temperatura;
    private float umidade;
    private float pressao;

    public void adicionarObservador(ObservadorClima obs) {
        observadores.add(obs);
    }

    public void removerObservador(ObservadorClima obs) {
        observadores.remove(obs);
    }

    public void atualizarMedicoes(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificar();
    }

    private void notificar() {
        for (ObservadorClima obs : observadores) {
            obs.atualizarMedidas(temperatura, umidade, pressao);
        }
    }
}