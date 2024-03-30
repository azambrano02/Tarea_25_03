package modelo;
public class Alumno extends Usuario {
	private Facultad facultad;

	public Facultad getFacultad(){
		return this.facultad;
	}
	public void setFacultad(Facultad facultad){
		this.facultad = facultad;
	}
	public Alumno(String nombre, String direccion, String preferencias, int rut, int numTelfono, Prestamo prestamo, Facultad facultad) {
		super(nombre, direccion, preferencias, rut, numTelfono, prestamo);
		this.facultad = facultad;
	}

	public String getTipo() {
		return "Alumno";
	}
}