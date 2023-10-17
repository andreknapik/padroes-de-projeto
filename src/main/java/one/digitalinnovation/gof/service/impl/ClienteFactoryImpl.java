package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteFactory;

public class ClienteFactoryImpl implements ClienteFactory {
    @Override
    public Cliente criarCliente() {
        // Lógica para criar uma instância de Cliente
        return new Cliente();
    }
}