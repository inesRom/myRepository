package com.ems.main.controller;


import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ems.main.model.Product;
import com.ems.main.repository.ProductRepository;

import java.util.List;
@Scope (value = "session")
@Component (value = "productList")
@ELBeanName(value = "productList")
@Join(path = "/TEST", to = "/product-lista.jsf")
public class ProductListController {
    @Autowired
    private ProductRepository productRepository;
    private List<Product> products;
    private Product product = new Product();
    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        products = productRepository.findAll();
    }
    public List<Product> getProducts() {
        return products;
    }
    public Product geFirsrtProducts() {
    	product = products.get(0);
        return product;
    }
}