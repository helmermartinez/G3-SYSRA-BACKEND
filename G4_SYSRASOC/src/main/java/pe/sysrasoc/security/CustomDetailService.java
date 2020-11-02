package pe.sysrasoc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.sysrasoc.Dao.Casa_vecinalDao;
import pe.sysrasoc.Entity.Casa_vecinal;



@Service
public class CustomDetailService implements UserDetailsService{
	@Autowired
	private Casa_vecinalDao casa_vecinaldao;

	@Override
	public UserDetails loadUserByUsername(String nombre_cv) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Casa_vecinal user = casa_vecinaldao.read(nombre_cv);
		if(user==null) {
			throw new UsernameNotFoundException(nombre_cv);
		}
		return User.withUsername(user.getNombre_cv()).password(user.getRepresentante_cv()).authorities("USER").build();
	}

}
