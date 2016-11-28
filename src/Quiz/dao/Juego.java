package Quiz.dao;
public abstract class Juego {
    private String title;
    private String descripcion;
    private String autor;
    public final static char victoria = 'V';
    public final static char derrota = 'D';
    public final static char enJuego = 'G';

    public Juego(String title, String descripcion, String autor) {
        this.title = title;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
 