package modelo;
public class RecursoDigital {
	protected String titulo;
	protected String autor;
	protected int año;
	protected String tematica;
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

	public String getTematica() {
		return this.tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
}