package com.example.demo.crudRepository;

import com.example.demo.model.Messages;
import org.springframework.data.repository.CrudRepository;

public interface MessagesCrudRepository extends CrudRepository<Messages,Integer> {
}

