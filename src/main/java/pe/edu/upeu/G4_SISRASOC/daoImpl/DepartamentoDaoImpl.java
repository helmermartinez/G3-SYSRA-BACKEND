package pe.edu.upeu.G4_SISRASOC.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.G4_SISRASOC.dao.DepartamentoDao;
import pe.edu.upeu.G4_SISRASOC.entity.Departamento;

@Repository
public class DepartamentoDaoImpl implements DepartamentoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Departamento d) {
		// TODO Auto-generated method stub
		String SQL = "insert into departamento(depart_name) values(?)";
				  
		return jdbcTemplate.update(SQL,d.getDepart_name()); 
}

	@Override
	public int update(Departamento d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from departamento where id_departamento=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Departamento read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_departamento") //nombre del paquete
				.withProcedureName("sp_listar_departamento") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("cursor_departamento", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();

	}

}
