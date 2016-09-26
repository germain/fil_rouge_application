package fr.dta.mediatheque.application.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import fr.dta.mediatheque.application.model.Usr;
import fr.dta.mediatheque.application.service.UsrService;


@Component
public class AuthenticationService implements UserDetailsService {

	@Autowired
	private UsrService service;

	@Override
	public UserDetails loadUserByUsername(final String username) {
		Usr usr = service.findUsrByLogin(username);
		
		if (usr != null) {
			List<GrantedAuthority> rules = this.getUserCredentials(usr);
			return new User(usr.getLogin(), usr.getPassword(), rules);
		} else {
			throw new UsernameNotFoundException("username.not.found");
		}

	}

	public List<GrantedAuthority> getUserCredentials(Usr user) {
		List<GrantedAuthority> userCredentials = new ArrayList<GrantedAuthority>();
		
		userCredentials.add(new SimpleGrantedAuthority(user.getRules()));
		
		return userCredentials;
	}

}