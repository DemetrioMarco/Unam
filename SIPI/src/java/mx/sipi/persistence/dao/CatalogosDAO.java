/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.persistence.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.sipi.persistence.entity.CatRol;
 

/**
 *
 * @author Demetrio
 */
@Stateless
public class CatalogosDAO implements CatalogosInterface {
    
@PersistenceContext
private EntityManager em;

private String msg;


    @Override
    public boolean insertRol(CatRol rol){
    boolean var = false;
    try {
        em.persist(rol);
        var = true;
    } catch (Exception e) {
        msg = e.getMessage();
    }
    return var;
}

    @Override
    public boolean updateRol(CatRol rol){
    boolean var = false;
    try {
        em.merge(rol);
        var = true;
    } catch (Exception e) {
        msg = e.getMessage();
    }
    return var;
}

    @Override
    public boolean deleteRol(CatRol rol){
    boolean var = false;
    try {
        em.merge(rol);
        var = true;
    } catch (Exception e) {
        msg = e.getMessage();
    }
    return var;
}
    
    @Override
    public List<CatRol> getCatRol(){
        Query r = em.createNamedQuery("CatRol.findAll");
        return r.getResultList();
    }

    public String getMsg() {
        return msg;
    }

    
}
