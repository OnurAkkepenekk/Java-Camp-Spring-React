package kodlamaio.Northwind.business.abstracts;

import java.util.List;

import kodlamaio.Northwind.entities.concretes.Product;

public interface ProductService {
	List<Product>getAll();
}
