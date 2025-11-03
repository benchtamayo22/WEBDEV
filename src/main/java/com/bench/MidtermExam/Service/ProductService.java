package com.bench.MidtermExam.Service;

import com.bench.MidtermExam.DTO.ProductDTO;
import com.bench.MidtermExam.Model.Product;
import com.bench.MidtermExam.Repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product save(ProductDTO dto) {
        Product newProduct = new Product();
        newProduct.setName(dto.getName());
        newProduct.setDescription(dto.getDescription());
        newProduct.setStock(dto.getStock());
        newProduct.setUnit(dto.getUnit());
        newProduct.setPrice(dto.getPrice());
        return repository.save(newProduct);
    }

    public Product updateProduct(Product product, ProductDTO dto) {
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setStock(dto.getStock());
        product.setUnit(dto.getUnit());
        product.setPrice(dto.getPrice());
        return repository.save(product);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }
}
