package hoonnn.jasypt;

import hoonnn.jasypt.configs.Server01Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JasyptApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptApplication.class, args);
	}

	@Autowired
	private Server01Config server01Config;

	@PostConstruct
	public void asd() {
        System.out.println(server01Config.getId());
        System.out.println(server01Config.getPw());
    }

}
