package com.example.Spring.data;

import com.example.Spring.data.Model.Mesum;
import com.example.Spring.data.Repository.MusumRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		MusumRepository repo = context.getBean(MusumRepository.class);

		Mesum museum = new Mesum(null,"The Louvre");
		museum =repo.save(museum);
		List<Mesum> museums = repo.findAll();
		System.out.println(museums);
		Long id = museum.getId();
		Optional<Mesum> foundMuseum = repo.findById(id);
		if (foundMuseum.isPresent()){
			System.out.println(foundMuseum.get());
		}
		else {
			System.out.println("Museum not found");
		}
	}
}
