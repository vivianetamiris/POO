public abstract class RelatorioTemplate {

    public final void gerar() {
        abrirConexao();
        extrairDados();
        formatarDados();
        fecharConexao();
    }

    protected void abrirConexao() {
        System.out.println("Abrindo conexão...");
    }

    protected abstract void extrairDados();
    protected abstract void formatarDados();

    protected void fecharConexao() {
        System.out.println("Fechando conexão...");
    }
}