package com.example.javaJPM.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controller
{
    @Autowired
    customerservice Service;

    @RequestMapping("/products/{id}/customers")
    public ArrayList<customermodel>  getCourceList(@PathVariable("id") int id)
    {
        return Service.GetAllCustomerByProduct(id);
    }

    @RequestMapping("/Customer/name/{name}")
    public ArrayList<customermodel> getCourceListByName(@PathVariable("name") String name)
    {
        return Service.getCustomerByName(name);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/customer")
    public ArrayList<customermodel> ViewAll()
    {
       return Service.ViewAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/customer")
    public String AddCustomer(@RequestBody customermodel c)
    {
        Service.addCustomer(c);
        return "Customer Added Successfully";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/customer")
    public String UpdateCustomer(@RequestBody customermodel c)
    {
        Service.updateCustomer(c);
        return "Customer Updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/customer")
    public String DeleteCustomer(@RequestBody customermodel c)
    {
        Service.DeleteCustomer(c);
        return "Customer Deleted Successfully";
    }


}
