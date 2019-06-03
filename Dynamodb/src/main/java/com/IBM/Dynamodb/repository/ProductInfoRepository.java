package com.IBM.Dynamodb.repository;

import com.IBM.Dynamodb.Domain.ProductInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
public interface ProductInfoRepository extends CrudRepository<ProductInfo,String> {
//List<ProductInfo> findById(String id);
}
