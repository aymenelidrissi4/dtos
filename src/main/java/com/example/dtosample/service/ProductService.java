package com.example.dtosample.service;


import com.example.dtosample.dtos.ProductDto;
import com.example.dtosample.entities.Product;
import com.example.dtosample.mapper.ProductMapper;
import com.example.dtosample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    private final ProductMapper productMapper;


    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    public void saveProduct(ProductDto productDto) {
        Product product = productMapper.fromDto(productDto);
        productRepository.save(product);
    }
}