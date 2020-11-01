package pe.edu.upeu.G4_SISRASOC.entity;

public class Departamento {
	private int id_departamento;
	private String depart_name;
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departamento(int id_departamento, String depart_name) {
		super();
		this.id_departamento = id_departamento;
		this.depart_name = depart_name;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getDepart_name() {
		return depart_name;
	}
	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}
	

}
