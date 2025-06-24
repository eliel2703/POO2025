public class Livro {
    private String titulo;
    private Categoria categoria;

    public Livro() {
        this.titulo = null;
        this.categoria = null;
    }

    public Livro(String titulo, Categoria categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}