package com.mateen.restapi;

import com.mateen.restapi.model.Employee;
import com.mateen.restapi.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger logs = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){

        return args -> {
            logs.info("Preloading " + repository.save(new Employee("Ahad", "Mateen", "Software Engineer")));
            logs.info("Preloading " + repository.save(new Employee("Sara", "Mrabet", "Human Resource")));
        };
    }
}
