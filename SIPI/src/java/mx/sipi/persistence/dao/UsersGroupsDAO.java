/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.persistence.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.sipi.persistence.entity.UsersGroups;

/**
 *
 * @author Demetrio
 */
@Stateless
public class UsersGroupsDAO implements UsersGroupsInterface {

    @PersistenceContext
    private EntityManager em;
    
    private String msg;
    
    @Override
      public boolean insertUsuario(UsersGroups ug){
        boolean var = false;
        try {
            em.persist(ug);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }
    
    @Override
    public boolean updateUsuario(UsersGroups ug){
        boolean var = false;
        try {
            em.merge(ug);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }
    
    @Override
    public boolean deleteUsuario(UsersGroups ug){
        boolean var = false;
        try {
            em.merge(ug);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }

    public String getMsg() {
        return msg;
    }
    
    
}
