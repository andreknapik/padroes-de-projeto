package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.ClienteFactory;
import one.digitalinnovation.gof.service.impl.ClienteServiceImpl;

public class ClienteServiceFactory {
    public static ClienteService criarClienteService(ClienteFactory factory) {
        // Adicione lógica para criar diferentes implementações do ClienteService
        return new ClienteServiceImpl(factory);
    }
}