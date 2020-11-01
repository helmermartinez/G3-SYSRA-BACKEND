package pe.sysra.pe.entity;

/*Creado por: Helmer Martinez*/

public class Documento {
	private int id_documento;
	private String nombre_documento;
	private String fecha_registro;
	private String estado_documento;
	private int id_solicitante;
	
	
	
	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Documento(int id_documento, String nombre_documento, String fecha_registro, String estado_documento,
			int id_solicitante) {
		super();
		this.id_documento = id_documento;
		this.nombre_documento = nombre_documento;
		this.fecha_registro = fecha_registro;
		this.estado_documento = estado_documento;
		this.id_solicitante = id_solicitante;
	}







	public int getId_solicitante() {
		return id_solicitante;
	}



	public void setId_solicitante(int id_solicitante) {
		this.id_solicitante = id_solicitante;
	}



	public int getId_documento() {
		return id_documento;
	}



	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}



	public String getNombre_documento() {
		return nombre_documento;
	}



	public void setNombre_documento(String nombre_documento) {
		this.nombre_documento = nombre_documento;
	}



	public String getFecha_registro() {
		return fecha_registro;
	}



	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}



	public String getEstado_documento() {
		return estado_documento;
	}



	public void setEstado_documento(String estado_documento) {
		this.estado_documento = estado_documento;
	}

}
