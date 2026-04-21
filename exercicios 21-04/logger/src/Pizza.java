public class Pizza {

    private String tamanho;
    private boolean queijoExtra;
    private boolean bordaRecheada;
    private boolean molhoEspecial;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijoExtra = builder.queijoExtra;
        this.bordaRecheada = builder.bordaRecheada;
        this.molhoEspecial = builder.molhoEspecial;
    }

    public void mostrar() {
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Queijo extra: " + queijoExtra);
        System.out.println("Borda recheada: " + bordaRecheada);
        System.out.println("Molho especial: " + molhoEspecial);
    }

    public static class Builder {

        private String tamanho;
        private boolean queijoExtra;
        private boolean bordaRecheada;
        private boolean molhoEspecial;

        public Builder(String tamanho) {
            this.tamanho = tamanho;
        }

        public Builder setQueijoExtra(boolean valor) {
            this.queijoExtra = valor;
            return this;
        }

        public Builder setBordaRecheada(boolean valor) {
            this.bordaRecheada = valor;
            return this;
        }

        public Builder setMolhoEspecial(boolean valor) {
            this.molhoEspecial = valor;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}