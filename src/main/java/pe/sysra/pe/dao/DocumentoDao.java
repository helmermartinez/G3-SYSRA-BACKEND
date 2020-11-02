package pe.sysra.pe.dao;

/*Creado por: Helmer Martinez*/

import java.util.Map;

import pe.sysra.pe.entity.Documento;

public interface DocumentoDao {
	int create(Documento d);
	int update(Documento d);
	int delete(int id);
	Map<String, Object>readAll();
	Map<String, Object>read(int id);

}
