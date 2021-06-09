package kodlamaio.Northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;
import kodlamaio.Northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategory(String productName, String categoryId);

	DataResult<List<Product>> getByProductNameOrCategory(String productName, String categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartWith(String productName);

	DataResult<List<Product>> getByNameAndCategory(String productName, int category);
}
