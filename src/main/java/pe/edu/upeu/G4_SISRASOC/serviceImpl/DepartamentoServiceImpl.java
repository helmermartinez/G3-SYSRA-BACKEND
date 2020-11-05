package pe.edu.upeu.G4_SISRASOC.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.G4_SISRASOC.dao.DepartamentoDao;
import pe.edu.upeu.G4_SISRASOC.entity.Departamento;
import pe.edu.upeu.G4_SISRASOC.service.DepartamentoService;
@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	@Autowired
	private DepartamentoDao departamentodao;
	@Override
	public int create(Departamento d) {
		// TODO Auto-generated method stub
		return departamentodao.create(d);
	}

	@Override
	public int update(Departamento d) {
		// TODO Auto-generated method stub
		return departamentodao.update(d);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return departamentodao.delete(id);
	}

	@Override
	public Departamento read(int id) {
		// TODO Auto-generated method stub
		return departamentodao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return departamentodao.readAll();
	}

	
	
	

}
