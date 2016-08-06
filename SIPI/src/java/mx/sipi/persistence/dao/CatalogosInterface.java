/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.persistence.dao;

import java.util.List;
import javax.ejb.Local;
import mx.sipi.persistence.entity.CatRol;

/**
 *
 * @author Demetrio
 */
@Local
public interface CatalogosInterface {

    boolean deleteRol(CatRol rol);

    boolean insertRol(CatRol rol);

    boolean updateRol(CatRol rol);
    
    List<CatRol> getCatRol();
    
}
