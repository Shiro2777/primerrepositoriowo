package entidades;

public class Doctor extends Persona {

	protected long id = 1;
	protected String nºColegiado;
	protected String nºDespacho;

	public Doctor() {
		super();
		this.vip = true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNºColegiado() {
		return nºColegiado;
	}

	public void setNºColegiado(String nºColegiado) {
		this.nºColegiado = nºColegiado;
	}

	public String getNºDespacho() {
		return nºDespacho;
	}

	public void setNºDespacho(String nºDespacho) {
		this.nºDespacho = nºDespacho;
	}

	@Override
	public String toString() {
		return "Doctor [nºColegiado=" + this.nºColegiado + ", nºDespacho=" + this.nºDespacho + ", id=" + id
				+ ", nombre=" + nombre + ", edad=" + edad + ", npremios=" + npremios + ", vip=" + vip + "]";
	}

}
