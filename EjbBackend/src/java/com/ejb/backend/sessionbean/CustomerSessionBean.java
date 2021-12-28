/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.backend.sessionbean;

import com.ejb.backend.controller.CustomerController;
import com.exersice.ejb.interfaces.CustomerRemote;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author dcarvajals
 */
@Stateless
@LocalBean
public class CustomerSessionBean implements CustomerRemote{

    CustomerController ccon;
    
    public CustomerSessionBean () {
        ccon = new CustomerController();
    }

    @Override
    public boolean insertCustomer(String lastname, String name, String email, String address) {
        return ccon.insertCustomer(lastname, name, email, address);
    }

    @Override
    public boolean updateCustomer(String lastname, String name, String email, String address, String id_customer) {
        return ccon.updateCustomer(lastname, name, email, address, id_customer);
    }

    @Override
    public boolean deleteCustomer(String id_customer) {
        return ccon.deleteCustomer(id_customer);
    }

    @Override
    public String listCusomter() {
        return ccon.listCusomter();
    }
    
    
   
}
