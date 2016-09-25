/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financemate.repository;

import br.com.financemate.model.Atividades;
import javax.ejb.Stateless;

/**
 *
 * @author Wolverine
 */
@Stateless
public class AtividadesRepository extends AbstractRepository<Atividades>{
    
    public AtividadesRepository() {
        super(Atividades.class);
    }
    
    
}
