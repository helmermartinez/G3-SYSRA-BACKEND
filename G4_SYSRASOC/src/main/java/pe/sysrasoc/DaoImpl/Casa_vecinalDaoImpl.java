package pe.sysrasoc.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.sysrasoc.Dao.Casa_vecinalDao;
import pe.sysrasoc.Entity.Casa_vecinal;

@Repository
public class Casa_vecinalDaoImpl implements Casa_vecinalDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Casa_vecinal c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Casa_vecinal c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Casa_vecinal read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from casa_vecinal");
	}

	@Override
	public Casa_vecinal read(String nombre_cv) {
		// TODO Auto-generated method stub
		return null;
	}

}