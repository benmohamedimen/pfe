package com.dev.OnImpots;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dev.OnImpots.dao.ContribuableRepository;

import com.dev.OnImpots.entities.Contribuable;



@SpringBootApplication
@EnableJpaRepositories("com.dev.OnImpots.dao")
public class OnImpotsApplication implements CommandLineRunner {
@Autowired 
    private ContribuableRepository contribuableRepository; 

	public static void main(String[] args) {
		SpringApplication.run(OnImpotsApplication.class, args);
	}
	@Override
	public void run(String... arg) throws Exception { 
		/* DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		contribuableRepository.save(new Contribuable((long) 0, "BENmoHAMED","yakine",df.parse("01/01/2000"),"yakine@gmail.com",(long) 0222222,0, "", null ));
		contribuableRepository.save(new Contribuable((long) 1, "BENmoHAMED","yakine",df.parse("01/01/2000"),"yakine@gmail.com",(long) 0222222,1, "", null ));
		contribuableRepository.save(new Contribuable((long) 2, "BENmoHAMED","seif",df.parse("01/01/1988"),"seif@gmail.com",(long) 0222222,2, "", null )); */
	}
}

