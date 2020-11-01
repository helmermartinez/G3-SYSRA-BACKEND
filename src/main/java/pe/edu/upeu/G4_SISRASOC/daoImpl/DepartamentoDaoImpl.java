package pe.edu.upeu.G4_SISRASOC.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.G4_SISRASOC.dao.DepartamentoDao;
import pe.edu.upeu.G4_SISRASOC.entity.Departamento;
@Repository
public class DepartamentoDaoImpl implements DepartamentoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Departamento d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Departamento d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Departamento read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from departamento");
	}

}
