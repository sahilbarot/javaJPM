package com.example.javaJPM.customer;

//import com.example.javaJPM.employee.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Service
public class customerservice
{
    @Autowired
    private customerRepo repo;

    public ArrayList<customermodel> GetAllCustomerByProduct(int id)
    {
        ArrayList<customermodel> customerlist = new ArrayList<>();
        repo.findByProductmodelId(id).forEach(customerlist::add);
        return customerlist;
    }

   public ArrayList<customermodel> getCustomerByName(String customername)
   {
       return repo.findByName(customername);
   }

    public ArrayList<customermodel> ViewAll()
    {
        ArrayList<customermodel> customer = new ArrayList<>();

        for(customermodel c : repo.findAll())
        {
            customer.add(c);
        }
        return customer;
    }

    public String addCustomer(@RequestBody customermodel c)
    {
        repo.save(c);
        return "customer added successfully";
    }

    public String updateCustomer(@RequestBody customermodel c)
    {
        repo.save(c);
        return "customer updated successfully";
    }

    public String DeleteCustomer(@RequestBody customermodel c)
    {
        repo.delete(c);
        return "customer deleted successfully";
    }

}

