package dom.service;

import java.util.List;

import dom.model.Product;
import dom.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	// the dependency is taken care by spring
	private ProductRepository productRepository;

//   spring injects the dependency through constructor DI
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

}
