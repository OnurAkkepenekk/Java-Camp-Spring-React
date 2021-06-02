package kodlamaio.Northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
