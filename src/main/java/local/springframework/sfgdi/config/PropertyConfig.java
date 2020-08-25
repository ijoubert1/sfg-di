package local.springframework.sfgdi.config;

import local.springframework.sfgdi.exampleBean.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Value("${local.user}")
    String user;

    @Value("${local.pass}")
    String pass;

    @Value("${local.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPass(pass);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
}