package modelo;
public class Libros extends RecursoDigital {
    public Libros(String titulo, String autor, int año, String tematica, Prestamo prestamo, String privilegio) {
        super(titulo, autor, año, tematica, prestamo, privilegio);
    }
}