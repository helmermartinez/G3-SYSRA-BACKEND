package pe.sysrasoc.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import pe.sysrasoc.dao.PersonaDao;
import pe.sysrasoc.entity.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		
		String SQL = "delete from persona where id_persona=?";
		return jdbcTemplate.update(SQL, id); 

	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from persona");
	}

}
