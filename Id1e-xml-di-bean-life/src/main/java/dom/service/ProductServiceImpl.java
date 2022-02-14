package dom.service;

import java.util.List;

import dom.model.Product;
import dom.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	// the dependency is taken care by spring
	private ProductRepository productRepository;
	private String location;
	private String domainName;

	public ProductServiceImpl() {

		super();
		// System.out.println("default constructor call");
		// TODO Auto-generated constructor stub
	}

	// spring injects the dependency through constructor DI
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public String getDomainName() {
		return domainName;
	}

	@Override
	public String getLocation() {
		return location;
	}

	// using properties from properties file
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	// using a literal from xml config.
	public void setLocation(String location) {
		this.location = location;
	}

// setter based di
	public void setProductRepository(ProductRepository productRepository) {
		// System.out.println("setter");
		this.productRepository = productRepository;
	}

}
