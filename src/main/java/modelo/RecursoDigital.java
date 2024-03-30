package modelo;
public class RecursoDigital {
	protected String titulo;
	protected String autor;
	protected int año;
	protected String tematica;

	protected String privilegio;
	private Prestamo prestamo;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public String getTematica() {
		return this.tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public RecursoDigital(String titulo, String autor, int año, String tematica, Prestamo prestamo, String privilegio) {
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.tematica = tematica;
		this.prestamo = prestamo;
		this.privilegio = privilegio;
	}
	public String toString() {
		return "Título: " + this.titulo;
	}
}
