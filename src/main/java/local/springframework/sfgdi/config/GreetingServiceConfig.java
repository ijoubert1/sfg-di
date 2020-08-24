package local.springframework.sfgdi.config;

import local.springframework.sfgdi.services.GreetingService;
import local.springframework.sfgdi.services.I18nEnglishGreetingService;
import local.springframework.sfgdi.services.I18nSpanishGreetingService;
import local.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    GreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean("i18nService")
    @Profile({"ES","default"})
    GreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Bean("i18nService")
    @Profile("EN")
    GreetingService i18nEnglishGreetingService(){
        return new I18nEnglishGreetingService();
    }
}
