package pe.sysrasoc.dao;

import java.util.List;
import java.util.Map;

import pe.sysrasoc.entity.Solicitante;

public interface SolicitanteDao {
	int create (Solicitante s);
	int update (Solicitante s);
	int delete (int id);
	Solicitante read(int id);
	List<Map<String, Object>> readAll();

}
