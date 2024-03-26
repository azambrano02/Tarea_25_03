package modelo;
public class Profesor extends Usuario {
	private Facultad facultad;
	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	public Profesor(String nombre, String direccion, String preferencias, int rut, int numTelfono, Prestamo prestamo, Facultad facultad) {
		super(nombre, direccion, preferencias, rut, numTelfono, prestamo);
		this.facultad = facultad;
	}

	public String getTipo() {
		return "Profesor";
	}
}