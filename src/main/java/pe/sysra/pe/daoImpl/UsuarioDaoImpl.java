package pe.sysra.pe.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.sysra.pe.dao.UsuarioDao;
import pe.sysra.pe.entity.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		return jdbcTemplate.queryForList("Select * from usuario");
	}
	

}
