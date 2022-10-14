package com.example.demo.crudRepository;

import com.example.demo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category,Integer>{
}


