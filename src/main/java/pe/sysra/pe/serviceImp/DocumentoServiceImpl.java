package pe.sysra.pe.serviceImp;

/*Creado por: Helmer Martinez*/

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.sysra.pe.dao.DocumentoDao;
import pe.sysra.pe.entity.Documento;
import pe.sysra.pe.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService{
	@Autowired
	DocumentoDao documentoDao;

	@Override
	public int create(Documento d) {
		// TODO Auto-generated method stub
		return documentoDao.create(d);
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
