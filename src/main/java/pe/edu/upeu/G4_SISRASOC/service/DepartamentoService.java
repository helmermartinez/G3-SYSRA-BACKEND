package pe.edu.upeu.G4_SISRASOC.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.G4_SISRASOC.entity.Departamento;

public interface DepartamentoService {
	int create (Departamento d);
	int update (Departamento d);
	int delete (int id);
	Departamento read (int id);
	Map<String, Object> readAll();

}
