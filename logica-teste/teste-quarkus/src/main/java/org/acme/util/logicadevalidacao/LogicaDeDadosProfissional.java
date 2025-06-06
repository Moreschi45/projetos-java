package org.acme.util.logicadevalidacao;

import java.util.List;

import org.acme.conf.LogConfig;
import org.acme.dto.ProfissionalDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LogicaDeDadosProfissional {
    @Inject
    LogConfig log;
    @Inject
    LogicaDeCadastro logicaDeCadastro;
    public void logicaDeDadosProfissional(List<ProfissionalDTO> profissional){
        /* Verifica se a lista de profissionais é nula ou vazia */
        if (profissional == null || profissional.isEmpty()) {
            log.logError("Lista de profissionais está vazia ou nula.");
            throw new IllegalArgumentException("Lista de profissionais não pode ser nula ou vazia.");
        }
        /* Itera sobre a lista de profissionais */
        for(int i = 0; i < profissional.size(); i++){
            ProfissionalDTO profissionalDTO = profissional.get(i);
            logicaDeCadastro.validarNome(profissionalDTO.getNome());
            logicaDeCadastro.validarEmail(profissionalDTO.getEmail());
        }
    }
}
