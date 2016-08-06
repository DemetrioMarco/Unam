/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.persistence.dao;

import mx.sipi.persistence.entity.UsersGroups;

/**
 *
 * @author Demetrio
 */
public interface UsersGroupsInterface {

    boolean deleteUsuario(UsersGroups ug);

    boolean insertUsuario(UsersGroups ug);

    boolean updateUsuario(UsersGroups ug);
    
}
