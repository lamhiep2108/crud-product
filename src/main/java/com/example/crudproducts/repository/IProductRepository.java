package com.example.crudproducts.repository;

import com.example.crudproducts.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product,Long> {
}
