package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    void save(Product product);

    void edit(int id,Product product);

    void remove(int id);

    Product findById(int id);

    List<Product> search(String searchName);

}
