package pe.sysra.pe.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.sysra.pe.dao.UsuarioDao;
import pe.sysra.pe.entity.Usuario;
import pe.sysra.pe.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDao UsuarioDao;

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return UsuarioDao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return UsuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return UsuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return UsuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		
		return UsuarioDao.readAll();
	}
	

}
