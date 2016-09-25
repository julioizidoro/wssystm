/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financemate.bean;

import java.util.Date;

/**
 *
 * @author Wolverine
 */
public class AtividadesBean {
    
    private String nome;
    private String subDepartamento;
    private String cliente;
    private Date prazo;
    private String prioridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubDepartamento() {
        return subDepartamento;
    }

    public void setSubDepartamento(String subDepartamento) {
        this.subDepartamento = subDepartamento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    
    
}
