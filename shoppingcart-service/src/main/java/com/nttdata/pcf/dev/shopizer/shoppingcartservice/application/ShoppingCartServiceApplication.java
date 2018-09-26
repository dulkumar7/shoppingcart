package com.nttdata.pcf.dev.shopizer.shoppingcartservice.application;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.jta.JtaTransactionManager;

@SpringBootApplication
@EnableAutoConfiguration
@PropertySource({"classpath:application.properties"})
public class ShoppingcartServiceApplication extends JpaBaseConfiguration{

	protected ShoppingcartServiceApplication(DataSource dataSource, JpaProperties properties,
			ObjectProvider<JtaTransactionManager> jtaTransactionManager,
			ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
		super(dataSource, properties, jtaTransactionManager, transactionManagerCustomizers);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartServiceApplication.class, args);
	}

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
		 return new HibernateJpaVendorAdapter();
	}

	@Override
	protected Map<String, Object> getVendorProperties() {
		Map<String, Object> vendorProperties = new LinkedHashMap<>();
        vendorProperties.putAll(getProperties().getHibernateProperties(getDataSource()));
        return vendorProperties;
	}
}
