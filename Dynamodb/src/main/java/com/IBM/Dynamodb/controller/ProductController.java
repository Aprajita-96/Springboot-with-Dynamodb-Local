package com.IBM.Dynamodb.controller;

import com.IBM.Dynamodb.Domain.ProductInfo;
import com.IBM.Dynamodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProductInfo productInfo){
        return new ResponseEntity<ProductInfo>(productService.save(productInfo), HttpStatus.OK);
    }
    @GetMapping("/getSaved")
    public ResponseEntity<?> getSaved(){
        return new ResponseEntity<List<ProductInfo>>(productService.getAll(), HttpStatus.OK);
    }
}
