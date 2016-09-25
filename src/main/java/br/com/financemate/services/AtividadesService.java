/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financemate.services;

import br.com.financemate.bean.AtividadesBean;
import br.com.financemate.model.Atividades;
import br.com.financemate.repository.AtividadesRepository;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Consumes("application/json")
    @Path("/listar")
    public List<AtividadesBean> listar(@PathParam("id") Integer id){
        String sql = "Select a from Atividades a where  a.situacao=" + 0 + " and a.usuario.idusuario=" + id+
                " order by a.prazo, a.prioridade, a.nome";
        List<Atividades> lista = atividadesRepository.list(sql);
        List<AtividadesBean> listaBean=new ArrayList<AtividadesBean>();
        if (lista!=null){
            for(int i=0;i<lista.size();i++){
                AtividadesBean atividade = new AtividadesBean();
                atividade.setNome(lista.get(i).getNome());
                atividade.setCliente(lista.get(i).getCliente().getNomefantasia());
                atividade.setPrazo(lista.get(i).getPrazo());
                atividade.setPrioridade(lista.get(i).getPrioridade());
                atividade.setSubDepartamento(lista.get(i).getSubdepartamento().getNome());
                listaBean.add(atividade);
            }
        }
        return listaBean;
    }
    
    @POST
    @Produces("application/json")
    @Path("/finalizar")
    public void finalizar(@PathParam("id") Integer id){
        Atividades atividades = atividadesRepository.find(id.longValue());
        if (atividades!=null){
            atividades.setSituacao(Boolean.TRUE);
            atividadesRepository.update(atividades);
        }
    }
    
}
