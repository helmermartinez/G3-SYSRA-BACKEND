package pe.sysrasoc.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.sysrasoc.Dao.Casa_vecinalDao;
import pe.sysrasoc.Entity.Casa_vecinal;
import pe.sysrasoc.Service.Casa_vecinalService;

@Service
public class Casa_vecinalServiceImpl implements Casa_vecinalService {
	@Autowired
	private Casa_vecinalDao casa_vecinaldao;
	
	
	@Override
	public int create(Casa_vecinal c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Casa_vecinal d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Casa_vecinal read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return casa_vecinaldao.readAll();
	}
}
