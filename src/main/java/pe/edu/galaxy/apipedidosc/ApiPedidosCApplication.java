package pe.edu.galaxy.apipedidosc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiPedidosCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPedidosCApplication.class, args);
	}

}
