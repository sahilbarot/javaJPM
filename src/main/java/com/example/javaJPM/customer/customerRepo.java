package com.example.javaJPM.customer;


import com.example.javaJPM.Product.Productmodel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface customerRepo extends CrudRepository <customermodel,Integer>
{
    ArrayList<customermodel> findByName(String name);
    ArrayList<customermodel> findByProductmodelId(int id);
}
