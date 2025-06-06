package org.acme.util.logicadecontrole;

import java.util.List;

import org.acme.conf.LogConfig;
import org.acme.dto.ClienteDTO;
import org.acme.util.logicadevalidacao.LogicaDeDadosCliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LogicaDeControleCliente {
    @Inject
    LogConfig log;
    @Inject
    LogicaDeDadosCliente logicaDeDadosCliente;
    
    public void logicaControleCliente(List<ClienteDTO> cliente) {
        /* Criando uma validação na lista, para verificar se está null */
        if(cliente == null || cliente.isEmpty()){
            log.logError("Lista de clientes está vazia ou nula.");
            throw new IllegalArgumentException("Lista de clientes não pode ser nula ou vazia.");
        }
        /* Lógica para validar os dados do cliente */
        logicaDeDadosCliente.logicaDadosCliente(cliente);
        /* Iterando sobre a lista */
        for(int i = 0; i < cliente.size(); i++){
            ClienteDTO clienteDTO = cliente.get(i);
            /* Verifica se o id do cliente é nulo ou vazio */
            if(clienteDTO.getId() == null || clienteDTO.getId().isEmpty()){
                log.logError("ID não encontrado");
                throw new IllegalArgumentException("ID do cliente não pode ser nulo ou vazio.");
            }
            else{
                clienteDTO.setId(clienteDTO.getId());
                log.logInfo("ID do cliente: " + clienteDTO.getId());
            }
            /* Verificando se o nome do cliente é nulo ou vazio */
            if(clienteDTO.getNome() == null || clienteDTO.getNome().isEmpty()){
                log.logError("Nome do cliente não encontrado");
                throw new IllegalArgumentException("Nome do cliente não pode ser nulo ou vazio.");
            }
            else{
                clienteDTO.setNome(clienteDTO.getNome());
                log.logInfo("Nome do cliente: " + clienteDTO.getNome());
            }
            /* Verificando se o email do cliente é nulo ou vazio */
            if(clienteDTO.getEmail() == null || clienteDTO.getEmail().isEmpty()){
                log.logError("Email do cliente não encontrado");
                throw new IllegalArgumentException("Email do cliente não pode ser nulo ou vazio.");
            }
            else{
                clienteDTO.setEmail(clienteDTO.getEmail());
                log.logInfo("Email do cliente: " + clienteDTO.getEmail());
            }
        }
    }
}
