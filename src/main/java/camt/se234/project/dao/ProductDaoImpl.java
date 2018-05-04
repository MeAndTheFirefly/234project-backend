package camt.se234.project.dao;

import camt.se234.project.entity.Product;
import camt.se234.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
        		// StreamSupport.stream(productRepository.findAll().spliterator(),false)
                // .collect(Collectors.toList());
    }
}
