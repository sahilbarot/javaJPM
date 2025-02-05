package com.example.javaJPM.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class productService
{
    @Autowired
    productRepo repo;

    public ArrayList<Productmodel> ViewAll()
    {
        ArrayList<Productmodel> productmodels = new ArrayList<>();

        for (Productmodel product:repo.findAll())
        {
            productmodels.add(product);
        }
        return productmodels;
    }

    public String AddProduct(@RequestBody Productmodel product)
    {
        repo.save(product);
        return "Product Added";
    }

    public String UpdateProduct(@RequestBody Productmodel product)
    {
        repo.save(product);
        return "Product Updated";
    }

    public String DeleteProduct(@RequestBody Productmodel product)
    {
        repo.delete(product);
        return "Product Deleted";
    }

}
