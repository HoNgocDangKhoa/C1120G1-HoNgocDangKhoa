package repository;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Đông", 1000000, 5));
        productMap.put(2, new Product(2, "Sang", 2000000, 6));
        productMap.put(3, new Product(3, "Xuân", 3000000, 4));
        productMap.put(4, new Product(4, "Lại", 400000, 2));
        productMap.put(5, new Product(5, "Đến", 5000000, 1));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void edit(int id, Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> search(String searchName) {
        List<Product> productList = new ArrayList<>(productMap.values());
        List<Product> searchList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getNameProduct().contains(searchName)) {
                searchList.add(product);
            }
        }
        return searchList;
    }


}
