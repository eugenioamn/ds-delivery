package com.eugeniomoreira.dsdelivery.services;

import com.eugeniomoreira.dsdelivery.dto.ProductDTO;
import com.eugeniomoreira.dsdelivery.entities.Product;
import com.eugeniomoreira.dsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();

        return list
                .stream()
                .map(x -> new ProductDTO(x))
                .collect(Collectors.toList());
    }
}
