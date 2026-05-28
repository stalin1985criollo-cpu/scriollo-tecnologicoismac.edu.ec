package com.distribuida.servicie;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteDAO clienteDAO
        return List.of();
    }

    @Override
    public List<Cliente>findAll() {
        Scanner clienteDAO;
        return clienteDAO.findAll();
    }

    @Override
    public Cliente find(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente save( Cliente cliente) {
        return  clienteDAO.save(cliente);
    }

    @Override
    public cliente update(int id, cliente cliente) {

    }
}
