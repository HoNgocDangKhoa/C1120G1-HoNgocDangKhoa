package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository= new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
      productRepository.save(product);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id,product);

    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> search(String searchName) {
        return productRepository.search(searchName);
    }


}
