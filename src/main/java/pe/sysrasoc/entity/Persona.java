package pe.sysrasoc.entity;

public class Persona {
	private int id_persona;
	private String nombre_persona;
	private String apell_pat;
	private String apell_mat;
	private String dni;
	private String correo;
	private int telefono;
	private String fecha_nac;
	private String sexo;
	public Persona() {
		super();
	}
	public Persona(int id_persona, String nombre_persona, String apell_pat, String apell_mat, String dni, String correo,
			int telefono, String fecha_nac, String sexo) {
		super();
		this.id_persona = id_persona;
		this.nombre_persona = nombre_persona;
		this.apell_pat = apell_pat;
		this.apell_mat = apell_mat;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre_persona() {
		return nombre_persona;
	}
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	public String getApell_pat() {
		return apell_pat;
	}
	public void setApell_pat(String apell_pat) {
		this.apell_pat = apell_pat;
	}
	public String getApell_mat() {
		return apell_mat;
	}
	public void setApell_mat(String apell_mat) {
		this.apell_mat = apell_mat;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
