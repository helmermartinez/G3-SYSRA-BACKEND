package pe.sysrasoc.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.sysrasoc.dao.SolicitanteDao;
import pe.sysrasoc.entity.Solicitante;

@Repository

public class SolicitanteDaoImpl implements SolicitanteDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Solicitante s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Solicitante s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Solicitante read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from solicitante") ;
	}

}
