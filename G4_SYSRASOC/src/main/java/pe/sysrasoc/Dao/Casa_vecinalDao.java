package pe.sysrasoc.Dao;

import java.util.List;
import java.util.Map;

import pe.sysrasoc.Entity.Casa_vecinal;

public interface Casa_vecinalDao {
	public Casa_vecinal read(String nombre_cv);
	int create (Casa_vecinal c);
	int update (Casa_vecinal c);
	int delete (int id);
	Casa_vecinal read(int id);
	List<Map<String, Object>> readAll();

}
