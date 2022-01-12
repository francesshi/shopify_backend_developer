package com.example.shopify_backend_developer.service;

import com.example.shopify_backend_developer.dao.CustomerDao;
import com.example.shopify_backend_developer.entity.Cart;
import com.example.shopify_backend_developer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);
        customer.setEnabled(true);
        customerDao.signUp(customer);

    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }

}
