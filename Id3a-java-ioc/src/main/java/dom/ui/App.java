package dom.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dom.configuration.AppConfig;
import dom.model.Product;
import dom.repository.ProductRepository;
import dom.repository.ProductRepositoryImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Starter Enterprise setup");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductRepository productRepository = (ProductRepository) applicationContext.getBean("productRepository");
		productRepository.findAll().forEach(System.out::println);
		((AnnotationConfigApplicationContext)applicationContext).close();
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
