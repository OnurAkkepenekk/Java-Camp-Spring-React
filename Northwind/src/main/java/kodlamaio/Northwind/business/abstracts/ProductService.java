package kodlamaio.Northwind.business.abstracts;

import java.util.List;


import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;
import kodlamaio.Northwind.entities.concretes.Product;
import kodlamaio.Northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();

	DataResult<List<Product>> getAllSorted();

	DataResult<List<Product>> getAll(int pageNo, int pageSize);

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, String categoryId);

	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartWith(String productName);

	DataResult<List<Product>> getByNameAndCategory(String productName, int category);

	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
