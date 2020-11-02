package pe.sysra.pe.daoImpl;

/*Creado por: Helmer Martinez*/

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.sysra.pe.dao.DocumentoDao;
import pe.sysra.pe.entity.Documento;

@Repository
public class DocumentoDaoImpl implements DocumentoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Documento d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call CRUD_DOCUMENTO.SP_INS_DOC(?,?,?,?)",
				d.getNombre_documento(),d.getFecha_registro(), d.getEstado_documento(), d.getId_solicitante());
	}

	@Override
	public int update(Documento d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
