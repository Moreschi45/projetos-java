package org.acme.util.logicadevalidacao;

import org.acme.conf.LogConfig;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LogicaDeCadastro {
    @Inject
    LogConfig log;
    /* Metodo para validar o nome */
    public boolean validarNome(String nome){
        if(nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]{5,150}$")) {
            log.logInfo("Nome válido: " + nome); 
            return true;
        }
        else {
            log.logError("Nome inválido, caracteres inválidos ou quantidade inválida: " + nome);
            return false;
            }
        }
    /* Metodo para validar o email */
    public boolean validarEmail(String email) {
        if(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,100}$")) {
            log.logInfo("Email válido: " + email);
            return true;
        } else {
            log.logError("Email inválido: " + email);
            return false;
        }
    }
}