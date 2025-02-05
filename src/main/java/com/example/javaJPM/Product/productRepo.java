package com.example.javaJPM.Product;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface productRepo extends CrudRepository<Productmodel,Integer>
{
    ArrayList<Productmodel> findByName(String name);
}
