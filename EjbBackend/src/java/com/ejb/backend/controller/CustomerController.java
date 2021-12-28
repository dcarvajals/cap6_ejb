/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ejb.backend.controller;

import com.ejb.backend.dao.CustomerDao;
import com.ejb.backend.model.Customer;
import com.exersice.ejb.interfaces.CustomerRemote;

/**
 * 
 * @author dcarvajals
 */
public class CustomerController implements CustomerRemote{
    
    CustomerDao cdao;
    
    public CustomerController () { } 

    @Override
    public boolean insertCustomer(String lastname, String name, String email, String address) {
        cdao = new CustomerDao();
        Customer c = new Customer(lastname, name, email, address);
        return cdao.insertCustomer(c);
    }

    @Override
    public boolean updateCustomer(String lastname, String name, String email, String address, String id_customer) {
        cdao = new CustomerDao();
        Customer c = new Customer(lastname, name, email, address);
        c.setId_customer(id_customer);
        return cdao.updateCustomer(c);
    }

    @Override
    public boolean deleteCustomer(String id_customer) {
        cdao = new CustomerDao();
        Customer c = new Customer();
        c.setId_customer(id_customer);
        return cdao.updateCustomer(c);
    }

    @Override
    public String listCusomter() {
        cdao = new CustomerDao();
        return cdao.listCustomer();
    }
    
    

}
