package pe.sysrasoc.Entity;

public class Casa_vecinal {
	private int id_casa_vecinal;
	private String nombre_cv;
	private String representante_cv;
	private int telefono_cv;
	public Casa_vecinal() {
		super();
	}
	public Casa_vecinal(int id_casa_vecinal, String nombre_cv, String representante_cv, int telefono_cv) {
		super();
		this.id_casa_vecinal = id_casa_vecinal;
		this.nombre_cv = nombre_cv;
		this.representante_cv = representante_cv;
		this.telefono_cv = telefono_cv;
	}
	public int getId_casa_vecinal() {
		return id_casa_vecinal;
	}
	public void setId_casa_vecinal(int id_casa_vecinal) {
		this.id_casa_vecinal = id_casa_vecinal;
	}
	public String getNombre_cv() {
		return nombre_cv;
	}
	public void setNombre_cv(String nombre_cv) {
		this.nombre_cv = nombre_cv;
	}
	public String getRepresentante_cv() {
		return representante_cv;
	}
	public void setRepresentante_cv(String representante_cv) {
		this.representante_cv = representante_cv;
	}
	public int getTelefono_cv() {
		return telefono_cv;
	}
	public void setTelefono_cv(int telefono_cv) {
		this.telefono_cv = telefono_cv;
	}

}