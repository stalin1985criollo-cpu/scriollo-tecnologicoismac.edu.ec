package com.distribuida.servicie;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente findOne(int id) {
        return null;
    }

    @Override
    public Cliente find(Cliente cliente) {
        return clienteDAO.findById(cliente.getId()).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente update(int id, Cliente cliente) {
        cliente.setId(id);
        return clienteDAO.save(cliente);
    }

    @Override
    public void delete(int id) {

    }
}