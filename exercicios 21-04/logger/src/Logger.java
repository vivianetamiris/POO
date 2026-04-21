import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;

    // construtor privado
    private Logger() {
        // valores padrão (opcional, mas deixa igual ao slide)
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String mensagem) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(mensagem + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
    }
}