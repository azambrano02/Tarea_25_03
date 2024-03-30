package modelo;
public class RevistaAcademica extends RecursoDigital {
    public RevistaAcademica(String titulo, String autor, int año, String tematica, Prestamo prestamo, String privilegio) {
        super(titulo, autor, año, tematica, prestamo, privilegio);
    }
}