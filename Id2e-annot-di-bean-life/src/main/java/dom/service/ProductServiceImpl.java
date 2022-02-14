package dom.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dom.model.Product;
import dom.repository.ProductRepository;

@Component("productService")
@Scope("prototype")
//@Scope("singleton")
public class ProductServiceImpl implements ProductService {
	// the dependency is taken care by spring
	// spring injects the dependency through Field DI
	@Autowired
//	@Qualifier("mySQLProductRepository")
	@Qualifier("oracleProductRepository")
	private ProductRepository productRepository;

	@PostConstruct
	public void init() {
		System.out.println("bean INIT");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("bean CLEANUP");
	}
	// spring injects the dependency through constructor DI
//	@Autowired
//	public ProductServiceImpl(ProductRepository productRepository) {
//		super();
//		this.productRepository = productRepository;
//	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	// spring injects the dependency through setter DI
//	@Autowired
//	public void setProductRepository(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//		System.out.println("Setter based Di");
//	}

}
