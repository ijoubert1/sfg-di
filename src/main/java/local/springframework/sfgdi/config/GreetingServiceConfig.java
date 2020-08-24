package local.springframework.sfgdi.config;

import local.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    GreetingService primaryGreetingService(){
        return greetingServiceFactory().getGreetingService("default");
    }

    @Bean("i18nService")
    @Profile({"ES","default"})
    GreetingService i18nSpanishGreetingService(){
        return greetingServiceFactory().getGreetingService("ES");
    }

    @Bean("i18nService")
    @Profile("EN")
    GreetingService i18nEnglishGreetingService(){
        return greetingServiceFactory().getGreetingService("EN");
    }
}
