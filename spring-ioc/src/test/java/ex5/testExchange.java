package ex5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex5.ExchangeService;

public class testExchange {

	@Test
	public void testExchange() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ExchangeConfig.class);
		
		ExchangeService ex = (ExchangeService) ctx.getBean("xe");
		ex.convert();
		
	}
}