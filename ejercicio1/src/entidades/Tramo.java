package entidades;

public class Tramo {
	private long id;
	private int puntodeInicio;
	private int puntodeFin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPuntodeInicio() {
		return puntodeInicio;
	}

	public void setPuntodeInicio(int puntodeInicio) {
		this.puntodeInicio = puntodeInicio;
	}

	public int getPuntodeFin() {
		return puntodeFin;
	}

	public void setPuntodeFin(int puntodeFin) {
		this.puntodeFin = puntodeFin;
	}

	@Override
	public String toString() {
		return "Tramo [id=" + id + ", puntodeInicio=" + puntodeInicio + ", puntodeFin=" + puntodeFin + "]";
	}

}
