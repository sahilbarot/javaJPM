package com.example.javaJPM.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Productcontroller
{

    @Autowired
    productService service;

    @RequestMapping(method = RequestMethod.GET,value = "/Product")
    public ArrayList<Productmodel> ViewAll()
    {
        return service.ViewAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Product")
    public String AddProduct(@RequestBody Productmodel product)
    {
        service.AddProduct(product);
        return "Product Added Successfully";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/Product")
    public String UpdateProduct(@RequestBody Productmodel product)
    {
        service.UpdateProduct(product);
        return "Product Updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Product")
    public String DeleteProduct(@RequestBody Productmodel product)
    {
        service.DeleteProduct(product);
        return "Product Deleted Successfully";
    }

}
