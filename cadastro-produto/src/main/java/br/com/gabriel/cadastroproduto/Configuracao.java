package br.com.gabriel.cadastroproduto;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackageClasses=ProdutoController.class)
public class Configuracao {
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Configuracao.class, args);
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/teste?autoReconnect=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
}
