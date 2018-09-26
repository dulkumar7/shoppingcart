package com.nttdata.pcf.dev.shopizer.shoppingcart;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.nttdata.pcf.dev.shopizer.shoppingcartservice.application.ShoppingcartServiceApplication;
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShoppingcartServiceApplication.class)
@DataJpaTest
@ActiveProfiles("test")
public class ShoppingcartServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
