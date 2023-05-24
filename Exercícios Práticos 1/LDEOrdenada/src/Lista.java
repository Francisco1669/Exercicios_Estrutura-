public interface Lista {
    public void insereInicio(No info);
    public void insereFim(No info);
    public boolean isVazia();
    public boolean remove(No info);
    public No tamanho();
    public No add_ordenado(No info);

    // Retorna uma String que representa a lista a partir do inicio até o fim
    public String getListaInicio();

    // Retorna uma String que representa a lista a partir do fim até o inicio
    public String getListaFim();
}