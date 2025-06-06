package org.acme.util.logicadecontrole;

import java.util.List;

import org.acme.conf.LogConfig;
import org.acme.dto.ProfissionalDTO;
import org.acme.util.logicadevalidacao.LogicaDeDadosProfissional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LogicaDeControleProfissional {
    @Inject
    LogConfig log;
    @Inject
    LogicaDeDadosProfissional logicaDeDadosProfissional;

    public void logicaDeControleProfissional(List<ProfissionalDTO> profissional) {
        /* Criando uma validação na lista, para verificar se está null */
        if(profissional == null || profissional.isEmpty()){
            log.logError("Lista de profissionais está vazia ou nula.");
            throw new IllegalArgumentException("Lista de profissionais não pode ser nula ou vazia.");
        }
        /* Lógica para validar os dados do profissional */
        logicaDeDadosProfissional.logicaDeDadosProfissional(profissional);
        /* Iterando sobre a lista */
        for(int i = 0; i < profissional.size(); i++){
            ProfissionalDTO profissionalDTO = profissional.get(i);
            /* Verifica se o id do profissional é nulo ou vazio */
            if(profissionalDTO.getId() == null || profissionalDTO.getId().isEmpty()){
                log.logError("ID não encontrado");
                throw new IllegalArgumentException("ID do profissional não pode ser nulo ou vazio.");
            } else {
                profissionalDTO.setId(profissionalDTO.getId());
                log.logInfo("ID do profissional: " + profissionalDTO.getId());
            }
            /* Verificando se o nome do profissional é nulo ou vazio */
            if(profissionalDTO.getNome() == null || profissionalDTO.getNome().isEmpty()){
                log.logError("Nome não encontrado");
                throw new IllegalArgumentException("Nome do profissional não pode ser nulo ou vazio.");
            } else {
                profissionalDTO.setNome(profissionalDTO.getNome());
                log.logInfo("Nome do profissional: " + profissionalDTO.getNome());
            }
            /* Verificando se o email do profissional é nulo ou vazio */
            if(profissionalDTO.getEmail() == null || profissionalDTO.getEmail().isEmpty()){
                log.logError("Email não encontrado");
                throw new IllegalArgumentException("Email do profissional não pode ser nulo ou vazio.");
            } else {
                profissionalDTO.setEmail(profissionalDTO.getEmail());
                log.logInfo("Email do profissional: " + profissionalDTO.getEmail());
            }
        }
    }
}
