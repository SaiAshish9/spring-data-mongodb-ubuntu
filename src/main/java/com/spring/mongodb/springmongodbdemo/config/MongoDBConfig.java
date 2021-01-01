package com.spring.mongodb.springmongodbdemo.config;
import com.spring.mongodb.springmongodbdemo.document.Users;
import com.spring.mongodb.springmongodbdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(
                    new Users(1, "sai", "sai9@gmail.com", 3000L)
            );

        };
    }
}
