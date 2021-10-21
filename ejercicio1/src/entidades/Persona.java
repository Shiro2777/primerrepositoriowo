package entidades;

public class Persona {
	protected long id = 0;
	protected String nombre;
	protected int edad;
	protected int npremios = 0;
	protected boolean vip = false;
	
	
	// private Asignatura asignaturaFav = new Asignatura();	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNpremios() {
		return npremios;
	}

	public void setNpremios(int npremios) {
		this.npremios = npremios;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	// public Asignatura getAsignaturafav() {
	//	return asignaturaFav;
	// }

	// public void setAsignaturafav(Asignatura asignaturaFav) {
	//	this.asignaturaFav = asignaturaFav;
	// }

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", el número total de premios que ha ganado es: " + npremios + ", ¿es vip? -> " + vip + "]";
				
		// + ", su asignatura preferida es: " + asignaturaFav;
	}
	
}
