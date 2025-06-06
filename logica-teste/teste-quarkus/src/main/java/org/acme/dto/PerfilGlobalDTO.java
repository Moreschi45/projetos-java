package org.acme.dto;

import java.util.List;

public class PerfilGlobalDTO {

    private String id;
    private List<ClienteDTO> clientes;
    private List<ProfissionalDTO> profissionais;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ClienteDTO> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteDTO> clientes) {
        this.clientes = clientes;
    }
    
    public List<ProfissionalDTO> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<ProfissionalDTO> profissionais) {
        this.profissionais = profissionais;
    }

}
