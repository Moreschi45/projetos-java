package org.acme.service;

import org.acme.conf.LogConfig;
import org.acme.dto.PerfilGlobalDTO;
import org.acme.util.logicadecontrole.LogicaDeControleCliente;
import org.acme.util.logicadecontrole.LogicaDeControleProfissional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class LogicaControleProfissional {
    @Inject
    LogConfig log;
    @Inject
    LogicaDeControleCliente logicaDeControleCliente;
    @Inject
    LogicaDeControleProfissional logicaDeControleProfissional;
    
    public Response logicaControlePerfil(PerfilGlobalDTO profissional) {
        try{
                /* Iterar os perfis */
                logicaDeControleProfissional.logicaDeControleProfissional(profissional.getProfissionais());
                return Response.ok().build();
        } 
        catch (IllegalArgumentException e) {
            log.logError(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}