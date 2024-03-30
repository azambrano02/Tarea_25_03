package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Prestamo {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Usuario usuario;
	private ArrayList<RecursoDigital> recursos;

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<RecursoDigital> getRecursos() {
		return recursos;
	}
	public void setRecursos(ArrayList<RecursoDigital> recursos) {
		this.recursos = recursos;
	}

	public Prestamo(LocalDate fechaInicio, LocalDate fechaFin, Usuario usuario, List<RecursoDigital> recursos) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.usuario = usuario;
		this.recursos = new ArrayList<>();
	}
	public void aplazarPlazo(int dias) {
		LocalDate fechaActual = LocalDate.now();
        this.fechaFin = this.fechaFin.plusDays(dias);
	}

}