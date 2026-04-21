public class FabricaForma {

    public static FormaGeometrica criarForma(String tipo) {

        if (tipo.equalsIgnoreCase("circulo")) {
            return new Circulo();
        } 
        else if (tipo.equalsIgnoreCase("quadrado")) {
            return new Quadrado();
        } 
        else if (tipo.equalsIgnoreCase("triangulo")) {
            return new Triangulo();
        } 
        else {
            return null;
        }
    }
}