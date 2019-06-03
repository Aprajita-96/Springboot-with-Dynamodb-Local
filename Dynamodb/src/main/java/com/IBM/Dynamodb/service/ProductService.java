package com.IBM.Dynamodb.service;

import com.IBM.Dynamodb.Domain.ProductInfo;
import com.IBM.Dynamodb.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductInfoRepository productRepo;
    @Autowired
    public ProductService(ProductInfoRepository productRepo) {
        this.productRepo = productRepo;
    }
    public ProductInfo save(ProductInfo productInfo){
        return productRepo.save(productInfo);
    }
    public List<ProductInfo> getAll(){
    List<ProductInfo> list=(List) productRepo.findAll();
    System.out.println(list.size());
        System.out.println(list.isEmpty());

    return list;
    }
}
