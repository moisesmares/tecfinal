package mx.unam.aragon.ico.tec.librosmvc.modelos;

import java.util.Objects;

public class Libro {
    private int id;
    private String titulo;
    private String descripcion;
    private String autor;
    private String editora;
    private String isbn;
    private String img;

    public Libro(String titulo, String descripcion, String autor, String editora, String isbn, String img) {
    }

    public Libro(int id, String titulo, String descripcion, String autor, String editora, String isbn, String img) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return id == libro.id && Objects.equals(titulo, libro.titulo) && Objects.equals(descripcion, libro.descripcion) && Objects.equals(autor, libro.autor) && Objects.equals(editora, libro.editora) && Objects.equals(isbn, libro.isbn) && Objects.equals(img, libro.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descripcion, autor, editora, isbn, img);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", isbn='" + isbn + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
