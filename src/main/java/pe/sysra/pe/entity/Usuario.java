package pe.sysra.pe.entity;

public class Usuario {
	private String password;
	private String tipo;
	private String nom_usuario;
	private int persona_id_persona;
	private int id_usuario;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String password, String tipo, String nom_usuario, int persona_id_persona, int id_usuario) {
		super();
		this.password = password;
		this.tipo = tipo;
		this.nom_usuario = nom_usuario;
		this.persona_id_persona = persona_id_persona;
		this.id_usuario = id_usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNom_usuario() {
		return nom_usuario;
	}
	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}
	public int getPersona_id_persona() {
		return persona_id_persona;
	}
	public void setPersona_id_persona(int persona_id_persona) {
		this.persona_id_persona = persona_id_persona;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	
}
