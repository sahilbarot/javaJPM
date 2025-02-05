package com.example.javaJPM.customer;


import com.example.javaJPM.Product.Productmodel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class customermodel
{
    @Id
    private int customerid;
    private String customername;
    private String customerphone;

    @ManyToOne
    Productmodel productmodel;

    public customermodel()
    {
    }

    public Productmodel getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(Productmodel productmodel) {
        this.productmodel = productmodel;
    }

    public customermodel(int Customerid, String Customername, String Customerphone ,int ProductId,int price)
    {
        this.customerid = Customerid;
        this.customername = Customername;
        this.customerphone = Customerphone;
        this.productmodel = new Productmodel(ProductId," "," ");
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }
}
