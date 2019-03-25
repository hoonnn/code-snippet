package hoonnn.jasypt.configs;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@EnableConfigurationProperties(ServerConfig.class)
@Configuration
@ConfigurationProperties(prefix = "server")
@Setter
public class ServerConfig {
    private String id;
    private String pw;

    @Bean
    public String asdasd() {
        log.info("=== server id: {} ===", id);
        log.info("=== server pw: {} ===", pw);
        return null;
    }
}