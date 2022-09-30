package annas.shopband;

import annas.shopband.need.NeedService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(NeedService needService){
        return args -> {needService.createNeed();};
    }
}
