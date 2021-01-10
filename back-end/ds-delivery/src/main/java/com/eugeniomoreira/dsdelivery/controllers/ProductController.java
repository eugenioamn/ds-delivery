package com.eugeniomoreira.dsdelivery.controllers;

import com.eugeniomoreira.dsdelivery.dto.ProductDTO;
import com.eugeniomoreira.dsdelivery.entities.Product;
import com.eugeniomoreira.dsdelivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
}
