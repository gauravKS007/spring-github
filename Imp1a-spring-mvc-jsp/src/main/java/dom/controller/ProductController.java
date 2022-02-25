package dom.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dom.model.Product;
import dom.repository.ProductRepository;

@Controller
@RequestMapping("/")
public class ProductController {
//
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//	Product product = (Product) applicationContext.getBean("product");
//	ProductRepository productRepository = (ProductRepository) applicationContext.getBean("productRepository");
    @GetMapping
	public String getAllProducts() {
       return "index";
	}
}
