package org.acme.util.logicadevalidacao;

import java.util.List;

import org.acme.conf.LogConfig;
import org.acme.dto.ClienteDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LogicaDeDadosCliente {
    @Inject
    LogConfig log;
    @Inject
    LogicaDeCadastro logicaDeCadastro;
    
    public void logicaDadosCliente(List<ClienteDTO> cliente){
        /* Verifica se a lista de clientes é nula ou vazia */
        if (cliente == null || cliente.isEmpty()) {
            log.logError("Lista de clientes está vazia ou nula.");
            throw new IllegalArgumentException("Lista de clientes não pode ser nula ou vazia.");
        }
        /* Itera sobre a lista de clientes */
        for(int i = 0; i < cliente.size(); i++){
            ClienteDTO clienteDTO = cliente.get(i);
            logicaDeCadastro.validarNome(clienteDTO.getNome());
            logicaDeCadastro.validarEmail(clienteDTO.getEmail());
        }
    }
}