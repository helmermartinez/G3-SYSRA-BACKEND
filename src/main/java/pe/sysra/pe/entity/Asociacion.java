package pe.sysra.pe.entity;

public class Asociacion {
	private int id_asociacion;
	private String nombre_asociacion;
	private String imformacion_adicional;
	private int denominacion_id_denominacion;
	private int numero_mienbros;
	private int ubicacion_id_ubi_hijo;
	private String fecha_constitucion;
	private int junta_vecinal_id_jd;
	private int id_solicitante;
	public Asociacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_asociacion() {
		return id_asociacion;
	}
	public void setId_asociacion(int id_asociacion) {
		this.id_asociacion = id_asociacion;
	}
	public String getNombre_asociacion() {
		return nombre_asociacion;
	}
	public void setNombre_asociacion(String nombre_asociacion) {
		this.nombre_asociacion = nombre_asociacion;
	}
	public String getImformacion_adicional() {
		return imformacion_adicional;
	}
	public void setImformacion_adicional(String imformacion_adicional) {
		this.imformacion_adicional = imformacion_adicional;
	}
	public int getDenominacion_id_denominacion() {
		return denominacion_id_denominacion;
	}
	public void setDenominacion_id_denominacion(int denominacion_id_denominacion) {
		this.denominacion_id_denominacion = denominacion_id_denominacion;
	}
	public int getNumero_mienbros() {
		return numero_mienbros;
	}
	public void setNumero_mienbros(int numero_mienbros) {
		this.numero_mienbros = numero_mienbros;
	}
	public int getUbicacion_id_ubi_hijo() {
		return ubicacion_id_ubi_hijo;
	}
	public void setUbicacion_id_ubi_hijo(int ubicacion_id_ubi_hijo) {
		this.ubicacion_id_ubi_hijo = ubicacion_id_ubi_hijo;
	}
	public String getFecha_constitucion() {
		return fecha_constitucion;
	}
	public void setFecha_constitucion(String fecha_constitucion) {
		this.fecha_constitucion = fecha_constitucion;
	}
	public int getJunta_vecinal_id_jd() {
		return junta_vecinal_id_jd;
	}
	public void setJunta_vecinal_id_jd(int junta_vecinal_id_jd) {
		this.junta_vecinal_id_jd = junta_vecinal_id_jd;
	}
	public int getId_solicitante() {
		return id_solicitante;
	}
	public void setId_solicitante(int id_solicitante) {
		this.id_solicitante = id_solicitante;
	}
	public Asociacion(int id_asociacion, String nombre_asociacion, String imformacion_adicional,
			int denominacion_id_denominacion, int numero_mienbros, int ubicacion_id_ubi_hijo, String fecha_constitucion,
			int junta_vecinal_id_jd, int id_solicitante) {
		super();
		this.id_asociacion = id_asociacion;
		this.nombre_asociacion = nombre_asociacion;
		this.imformacion_adicional = imformacion_adicional;
		this.denominacion_id_denominacion = denominacion_id_denominacion;
		this.numero_mienbros = numero_mienbros;
		this.ubicacion_id_ubi_hijo = ubicacion_id_ubi_hijo;
		this.fecha_constitucion = fecha_constitucion;
		this.junta_vecinal_id_jd = junta_vecinal_id_jd;
		this.id_solicitante = id_solicitante;
	}
	


}
