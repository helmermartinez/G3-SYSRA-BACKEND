package pe.edu.upeu.G4_SISRASOC.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.G4_SISRASOC.entity.Departamento;

public interface DepartamentoDao {
	int create (Departamento d);
	int update (Departamento d);
	int delete (int id);
	Map<String, Object>read (int id);
	Map<String, Object> readAll();

}
