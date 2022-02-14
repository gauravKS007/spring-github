package dom.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dom.model.Product;
import dom.repository.ProductRepository;
import dom.repository.ProductRepositoryImpl;
import dom.service.ProductService;

public class App {
	public static void main(String[] args) {
		setterBasedDI();

	}

	private static void setterBasedDI() {
		// performIOC();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//      the traditional way
//		ProductRepository productReposirory = (ProductRepository) applicationContext.getBean("applicatioContext.xml");
//		The Spring way
		ProductService productService = applicationContext.getBean("productService", ProductService.class);
		productService.findAll().forEach(System.out::println);
		// fetching string literal from config file.
		System.out.println(productService.getLocation());
		// fetching value from properties file
		System.out.println(productService.getDomainName());
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
		productRepository = new ProductRepositoryImpl();
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
