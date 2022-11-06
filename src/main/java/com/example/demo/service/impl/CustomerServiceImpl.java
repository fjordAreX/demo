package com.example.demo.service.impl;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
   private Map<Integer,CustomerDTO>  dataBase = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        dataBase.put(id,new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return dataBase.get(id);
    }
}
