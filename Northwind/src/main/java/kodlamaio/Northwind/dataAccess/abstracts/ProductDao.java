package kodlamaio.Northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductName(String productName);

	Product getByProductNameAndCategory(String productName, String categoryId);

	List<Product> getByProductNameOrCategory(String productName, String categoryId);

	List<Product> getByCategoryIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where ProductName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int category);
}
