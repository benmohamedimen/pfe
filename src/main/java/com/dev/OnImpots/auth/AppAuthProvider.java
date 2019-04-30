 package com.dev.OnImpots.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import com.dev.OnImpots.web.ContribuableRestService;


public class AppAuthProvider extends DaoAuthenticationProvider {
    @Autowired
ContribuableRestService userDetailsService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        String login = auth.getName();
        String password = auth.getCredentials()
                .toString();
        UserDetails user = userDetailsService.loadUserByUsername(login);
        if (user == null) {
            throw new BadCredentialsException("login/Password does not match for " + auth.getPrincipal());
        }
        return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    } 

}
