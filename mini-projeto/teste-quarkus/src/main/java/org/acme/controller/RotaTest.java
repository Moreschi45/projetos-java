package org.acme.controller;

import org.acme.dto.PerfilGlobalDTO;
import org.acme.service.LogicaControleCliente;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/teste")
public class RotaTest {
   @Inject
    LogicaControleCliente logicaControlePerfil;
    
    @Path("/rota/perfil/cliente")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response teste(PerfilGlobalDTO perfil) {
        return logicaControlePerfil.logicaControlePerfil(perfil);
    }
}