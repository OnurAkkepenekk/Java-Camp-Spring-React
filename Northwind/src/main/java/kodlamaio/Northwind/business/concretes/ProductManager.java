package kodlamaio.Northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Northwind.business.abstracts.ProductService;
import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;
import kodlamaio.Northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.Northwind.core.utilities.results.SuccessResult;
import kodlamaio.Northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.Northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	// Autowired ile Spring gidip arka planda buraya karşılık gelebilecek ProductDao
	// türünde bir sınıf üretip onu veriyor.
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductName(productName), "Data listelendi.");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, String categoryId) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory(productName, categoryId),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, String categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory(productName,categoryId), "Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByCategoryIn(categories), "Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName), "Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartWith(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName), "Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int category) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName,category), "Data listelendi.");
	}
}
