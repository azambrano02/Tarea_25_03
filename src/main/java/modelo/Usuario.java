package modelo;
import java.util.List;
public abstract class Usuario {
	protected String nombre,direccion,preferencias;
	protected int rut,numTelfono;
	protected Prestamo prestamo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPreferencias(){
		return this.preferencias;
	}
	public void setPreferencias(String preferencias){
		this.preferencias = preferencias;
	}
	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public int getNumTelfono() {
		return numTelfono;
	}

	public void setNumTelfono(int numTelfono) {
		this.numTelfono = numTelfono;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Usuario(String nombre, String direccion, String preferencias, int rut, int numTelfono, Prestamo prestamo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.preferencias = preferencias;
		this.rut = rut;
		this.numTelfono = numTelfono;
		this.prestamo = prestamo;
	}
	public abstract String getTipo();
}