package pe.sysra.pe.service;

import java.util.Map;

import pe.sysra.pe.entity.Asociacion;

public interface AsociacionService {
	int create(Asociacion d);
	int update(Asociacion d);
	int delete(int id);
	Map<String, Object>readAll();
	Map<String, Object>read(int id);
}
