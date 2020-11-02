package pe.sysra.pe.dao;

import java.util.Map;

import pe.sysra.pe.entity.Asociacion;

public interface AsociacionDao {
int create(Asociacion r);
int update(Asociacion r);
int delete(int id);
Map<String, Object> read(int id);
Map<String, Object> readAll();
}
