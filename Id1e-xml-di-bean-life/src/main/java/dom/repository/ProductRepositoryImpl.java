package dom.repository;

import java.util.ArrayList;
import java.util.List;

import dom.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	public ProductRepositoryImpl() {
		System.out.println("ProductRepositoryImpl()");
	}

	public void init() {
		System.out.println("bean initialization");
	}

	public void destroy() {
		System.out.println("bean clean up operation");
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product("P01", "Man's Search for Meaning", 300));
		products.add(new Product("P02", "Awaken the Giant Within", 500));
		return products;
	}

}
