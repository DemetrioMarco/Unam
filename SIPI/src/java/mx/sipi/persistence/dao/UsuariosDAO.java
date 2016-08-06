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
import mx.sipi.persistence.entity.Users;

/**
 *
 * @author Demetrio
 */
@Stateless
public class UsuariosDAO implements UsuariosInterface  {

    @PersistenceContext
    private EntityManager em;
    
    private String msg;
    
    @Override
    public boolean insertUsuario(Users usuario){
        boolean var = false;
        try {
            em.persist(usuario);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }
    
    @Override
    public boolean updateUsuario(Users usuario){
        boolean var = false;
        try {
            em.merge(usuario);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }
    
    @Override
    public boolean deleteUsuario(Users usuario){
        boolean var = false;
        try {
            em.merge(usuario);
            var = true;
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return var;
    }
    
    @Override
    public List<Users> getUsuarios(){
        Query q = em.createNamedQuery("Users.findAll");
        return q.getResultList();
    }

    public String getMsg() {
        return msg;
    }
    
    
}
