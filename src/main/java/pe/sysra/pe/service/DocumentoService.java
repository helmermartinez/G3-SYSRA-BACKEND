package pe.sysra.pe.service;

/*Creado por: Helmer Martinez*/

import java.util.Map;

import pe.sysra.pe.entity.Documento;

public interface DocumentoService {
	int create(Documento d);
	int update(Documento d);
	int delete(int id);
	Map<String, Object>readAll();
	Map<String, Object>read(int id);

}
