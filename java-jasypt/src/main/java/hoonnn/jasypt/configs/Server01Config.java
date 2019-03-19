package hoonnn.jasypt.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "server-01")
public class Server01Config {
    private String id;
    private String pw;
}
