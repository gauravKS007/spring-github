package dom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dom.model.Product;
import dom.repository.ProductRepository;

@Component("productService")
public class ProductServiceImpl implements ProductService {
	// the dependency is taken care by spring
	// spring injects the dependency through Field DI
	@Autowired
	private ProductRepository productRepository;

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
