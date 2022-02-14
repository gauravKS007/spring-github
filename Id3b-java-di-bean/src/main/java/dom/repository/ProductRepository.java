package dom.repository;

import java.util.List;

import dom.model.Product;

public interface ProductRepository {
	public List<Product> findAll();
}
