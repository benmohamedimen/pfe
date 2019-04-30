package com.dev.OnImpots.web;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dev.OnImpots.dao.ContribuableRepository;

import com.dev.OnImpots.entities.Contribuable;


@Service

public class ContribuableService implements UserDetailsService {
    private final ContribuableRepository contribuableRepository;
    @Autowired
    public ContribuableService(ContribuableRepository contribuableRepository) {
        this.contribuableRepository = contribuableRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Objects.requireNonNull(login);
        Contribuable user = contribuableRepository.findUserWithName(login);
        		
        return user;
    }
}