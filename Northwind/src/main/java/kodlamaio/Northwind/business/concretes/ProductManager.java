package kodlamaio.Northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Northwind.business.abstracts.ProductService;
import kodlamaio.Northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.Northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	// Autowired ile Spring gidip arka planda buraya karşılık gelebilecek ProductDao türünde bir sınıf üretip onu veriyor.
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
