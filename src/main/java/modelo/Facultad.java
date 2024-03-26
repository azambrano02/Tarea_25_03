package modelo;
import java.util.ArrayList;

public class Facultad {
	private String nombreFacultad;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Alumno> almunos = new ArrayList<Alumno>();

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}
}