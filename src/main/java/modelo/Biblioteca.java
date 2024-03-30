package modelo;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {
	private List<Usuario> usuarios;
	private List<RecursoDigital> recursos;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public RecursoDigital buscarRecursoTitulo(String titulo) {
		for (RecursoDigital recurso : this.recursos){
			if(recurso.getTitulo().equals(titulo)){
				return recurso;
			}
		} return null;
	}
	public List<RecursoDigital> buscarRecursoAutor(String autor, Usuario usuario) {
		List<RecursoDigital> autores = new ArrayList<>();
		for (RecursoDigital recurso : this.recursos) {
			if (recurso.getAutor().equals(autor)) {
				if (recurso.getPrivilegio().equals("Privado") && usuario.getTipo().equals("Profesor")) {
					autores.add(recurso);
				}
				if (recurso.getPrivilegio().equals("Publico")) {
					autores.add(recurso);
				}
			}
		} return autores;
	}

	public RecursoDigital buscarRecursoAño(int año) {
		for (RecursoDigital recurso : this.recursos){
			if(recurso.getAño()==año){
				return recurso;
			}
		} return null;
	}
	public List<RecursoDigital> buscarRecursoClasificacion(String tematica) {
		List<RecursoDigital> tematicas = new ArrayList<>();
		for(RecursoDigital recurso : this.recursos){
			if(recurso.getTematica().equals(tematica)){
				tematicas.add(recurso);
			}
		}return tematicas;
	}
	public Prestamo realizarPrestamo(Usuario usuario, List<RecursoDigital> recursos) {
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = fechaInicio.plusDays(7);
		Prestamo prestamo = new Prestamo(fechaInicio, fechaFin, usuario, recursos);
		usuario.setPrestamo(prestamo);

		return prestamo;
	}
	public void aplazarFecha(Usuario usuario){
		usuario.getPrestamo().aplazarPlazo(5);
	}
	public void notificarUsuarios(Usuario usuario) {
		System.out.println("La fecha de devolucion es el dia " + usuario.getPrestamo().getFechaFin());
	}
	public List<RecursoDigital> recomendaciones(Usuario usuario){
		List<RecursoDigital> preferencias = new ArrayList<>();
		for(RecursoDigital recurso: this.recursos){
			if(usuario.getPreferencias().equals(recurso.getTematica())){
				preferencias.add(recurso);
			}
		}
		System.out.println("Recomendaciones en base a sus preferencias " + preferencias.toString());
        return preferencias;
    }
}
