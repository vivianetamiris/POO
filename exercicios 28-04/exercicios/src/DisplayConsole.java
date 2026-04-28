public class DisplayConsole implements ObservadorClima {

    public void atualizarMedidas(float temperatura, float umidade, float pressao) {
        System.out.println("Temp: " + temperatura +
                           " Umidade: " + umidade +
                           " Pressao: " + pressao);
    }
}