package pe.sysra.pe.daoImpl;

import java.sql.Types;
import java.util.Map;
import oracle.jdbc.internal.OracleTypes;
import pe.sysra.pe.dao.AsociacionDao;
import pe.sysra.pe.entity.Asociacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class AsociacionDaoImpl implements AsociacionDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
@Override
public int create(Asociacion r) {
	// TODO Auto-generated method stub
	return  jdbcTemplate.update("call crud_asociacion.sp_create_asc(?,?,?,?,?,?,?,?)", 
			r.getNombre_asociacion(),
			r.getImformacion_adicional(),
			r.getDenominacion_id_denominacion(),
			r.getNumero_mienbros(),
			r.getUbicacion_id_ubi_hijo(),
			r.getFecha_constitucion(),
			r.getJunta_vecinal_id_jd(),
			r.getId_solicitante()		
			
			
			);
}
@Override
public int update(Asociacion r) {
	// TODO Auto-generated method stub
	return  jdbcTemplate.update("call crud_asociacion.sp_update_asc(?,?,?,?,?,?,?,?,?)", 
			r.getId_asociacion(),
			r.getNombre_asociacion(),
			r.getImformacion_adicional(),
			r.getDenominacion_id_denominacion(),
			r.getNumero_mienbros(),
			r.getUbicacion_id_ubi_hijo(),
			r.getFecha_constitucion(),
			r.getJunta_vecinal_id_jd(),
			r.getId_solicitante()		
			)
	;
}
@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return jdbcTemplate.update("call crud_asociacion.sp_delete_asc(?)", id);
}
@Override
public Map<String, Object> read(int id) {
	System.out.println(id);
	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	.withCatalogName("crud_asociacion") //nombre del paquete
	.withProcedureName("sp_listar_asc") //nombre del procedimiento
	.declareParameters(new SqlOutParameter("cursor_asociacion", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idasociacion", Types.INTEGER));
	SqlParameterSource in = new MapSqlParameterSource().addValue("idasociacion", id);
	return simpleJdbcCall.execute(in);
}
@Override
public Map<String, Object> readAll() {
	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("crud_asociacion") //nombre del paquete
			.withProcedureName("sp_listar_asc") //nombre del procedimiento
			.declareParameters(new SqlOutParameter("cursor_asociacion", OracleTypes.CURSOR, new ColumnMapRowMapper()));
			return simpleJdbcCall.execute();

}


}
