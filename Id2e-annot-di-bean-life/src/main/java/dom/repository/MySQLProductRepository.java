package dom.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dom.model.Product;

@Component("mySQLProductRepository")
public class MySQLProductRepository implements ProductRepository {

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product("P01", "Man's Search for Meaning", 300));
		products.add(new Product("P02", "Awaken the Giant Within", 500));
		return products;
	}

}
