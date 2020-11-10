package pe.edu.upeu.G4_SISRASOC;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.upeu.G4_SISRASOC.dao.DepartamentoDao;
import pe.edu.upeu.G4_SISRASOC.entity.Departamento;
@RunWith(SpringRunner.class)

@SpringBootTest
class G4SysrasocApplicationTests {
@Autowired
	
	DepartamentoDao dao;
@Test
	void contextLoads() {
	Departamento d = new Departamento();
	d.setId_departamento(61);
	d.setDepart_name("junta");
	System.out.println (dao.update(d));
	}

}
