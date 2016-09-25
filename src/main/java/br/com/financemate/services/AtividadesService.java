/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financemate.services;

import br.com.financemate.model.Atividades;
import br.com.financemate.repository.AtividadesRepository;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


/**
 *
 * @author Wolverine
 */



@Path("/atividades")
public class AtividadesService {
    
    @EJB
    private  AtividadesRepository atividadesRepository;
    
    @GET
    @Produces("application/json")
    @Path("/listar")
    //@PathParam("idusuario") Integer idusuairo
    public List<Atividades> listar(){
        String sql = "Select a from Atividades a where  a.situacao=" + 0 + " and a.usuario.idusuario=" + 1 +
                " order by a.prazo, a.prioridade, a.nome";
        List<Atividades> lista = atividadesRepository.list(sql);
        if (lista==null){
            lista = new ArrayList<Atividades>();
        }
        return lista;
    }
    
}
