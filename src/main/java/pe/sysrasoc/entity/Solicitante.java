package pe.sysrasoc.entity;

public class Solicitante {
	private int id_solicitante;
	private int id_persona;
	private int id_casa_vecinal;
	public Solicitante() {
		super();
	}
	public Solicitante(int id_solicitante, int id_persona, int id_casa_vecinal) {
		super();
		this.id_solicitante = id_solicitante;
		this.id_persona = id_persona;
		this.id_casa_vecinal = id_casa_vecinal;
	}
	public int getId_solicitante() {
		return id_solicitante;
	}
	public void setId_solicitante(int id_solicitante) {
		this.id_solicitante = id_solicitante;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getId_casa_vecinal() {
		return id_casa_vecinal;
	}
	public void setId_casa_vecinal(int id_casa_vecinal) {
		this.id_casa_vecinal = id_casa_vecinal;
	}


}
