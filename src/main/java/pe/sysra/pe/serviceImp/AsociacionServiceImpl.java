package pe.sysra.pe.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.sysra.pe.dao.AsociacionDao;

import pe.sysra.pe.entity.Asociacion;

import pe.sysra.pe.service.AsociacionService;

@Service
public class AsociacionServiceImpl implements AsociacionService {
	@Autowired
	AsociacionDao asociaciondao;

	@Override
	public int create(Asociacion d) {
		// TODO Auto-generated method stub
		return asociaciondao.create(d);
	}

	@Override
	public int update(Asociacion d) {
		// TODO Auto-generated method stub
		return asociaciondao.update(d);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return asociaciondao.delete(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return asociaciondao.readAll();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return asociaciondao.read(id);
	}

}
