package dom.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dom.model.Product;
import dom.repository.ProductRepository;
import dom.repository.OracleProductRepository;
import dom.service.ProductService;

public class App {
	public static void main(String[] args) {
		constructorBasedDI();
	}

	private static void constructorBasedDI() {
		// performIOC();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-ctx.xml");
		ProductService productService = applicationContext.getBean("productService", ProductService.class);
		productService.findAll().forEach(System.out::println);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

	private static void performIOC() {
		System.out.println("Starter Enterprise setup");
		// traditionalWay();
		/*
		 * central Interface to provide configuration for an application . this is read
		 * only while application is running applicationContext .
		 */
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ProductRepository productRepository = (ProductRepository) applicationContext.getBean("productRepository");
//		productRepository.findAll().forEach(System.out::println);
//		((ClassPathXmlApplicationContext) applicationContext).close();
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ProductRepository productRepository = (ProductRepository) applicationContext.getBean("productRepository");
		productRepository.findAll().forEach(System.out::println);
		applicationContext.close();
	}

	private static void traditionalWay() {
		ProductRepository productRepository = null;
		productRepository = new OracleProductRepository();
		List<Product> products = productRepository.findAll();
		// oldest method
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
		// Enhance for loop
		/*
		 * for (Product product : products) { System.out.println(product); }
		 */
		// Java 8 Lambda Expression
		// products.forEach((product) -> System.out.println(product));
		// Java 8 way with method reference
		// products.forEach(System.out::println);
	}
}
