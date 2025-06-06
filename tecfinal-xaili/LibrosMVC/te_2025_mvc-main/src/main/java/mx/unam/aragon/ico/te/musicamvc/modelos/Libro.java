package mx.unam.aragon.ico.te.musicamvc.modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    private String autor;
    private String genero;
    private Integer anioPublicacion;
    private String descripcion;
    private String imagen;

    public Libro() {
    }

    public Libro(String descripcion, Integer anioPublicacion, String genero, int id, String imagen, String autor) {
        this.descripcion = descripcion;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.id = id;
        this.imagen = imagen;
        this.autor = autor;
        this.titulo = "Sin título"; // Por defecto
    }

    public Libro(String titulo, String autor, String genero, Integer anioPublicacion, String descripcion, String imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id)
                && Objects.equals(titulo, libro.titulo)
                && Objects.equals(autor, libro.autor)
                && Objects.equals(genero, libro.genero)
                && Objects.equals(anioPublicacion, libro.anioPublicacion)
                && Objects.equals(descripcion, libro.descripcion)
                && Objects.equals(imagen, libro.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, genero, anioPublicacion, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
