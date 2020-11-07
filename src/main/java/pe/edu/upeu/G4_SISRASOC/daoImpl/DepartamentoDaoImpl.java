package pe.edu.upeu.G4_SISRASOC.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
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
		
				  
		return jdbcTemplate.update("call pk_departamento.sp_create_departamento(?)", d.getDepart_name()); 
}

	@Override
	public int update(Departamento d) {
		// TODO Auto-generated method stub
		System.out.print(d.getDepart_name());
		return jdbcTemplate.update("call pk_departamento.sp_update_departamento(?,?)",d.getId_departamento(),d.getDepart_name());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from departamento where id_departamento=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Map<String, Object>read(int id) {
		System.out.println(id); 
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)			
		.withCatalogName("pk_departamento") //nombre del paquete
		.withProcedureName("sp_read_departamento") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("t_departamento", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlParameter("iddep", OracleTypes.NUMBER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("iddep", id);

		return simpleJdbcCall.execute(in);
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
