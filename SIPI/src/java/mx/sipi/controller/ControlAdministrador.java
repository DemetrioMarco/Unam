/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import mx.sipi.persistence.dao.CatalogosInterface;
import mx.sipi.persistence.dao.UsersGroupsInterface;
import mx.sipi.persistence.dao.UsuariosInterface;
import mx.sipi.persistence.entity.CatRol;
import mx.sipi.persistence.entity.Users;
import mx.sipi.persistence.entity.UsersGroups;
import mx.sipi.properties.Constants;


/**
 *
 * @author Demetrio
 */
@ManagedBean (name = "CtrAdm")
@RequestScoped
public class ControlAdministrador implements Serializable{
    
    @EJB
    private CatalogosInterface catalogos;
    @EJB
    private UsuariosInterface usuarios;
    @EJB
    private UsersGroupsInterface grupoUsuarios;
    
    private CatRol catRol;
    private Users opUsuarios;
    private UsersGroups opGrupoUsuarios;
    
    private List<CatRol> listRol;
    private List<Users> listUser;
    
    private String msg; 
    
    private Integer idrol;
    
    private FacesContext context;
    
    @PostConstruct
    public void init(){
       catRol = new CatRol();
       opUsuarios = new Users();
       opGrupoUsuarios = new UsersGroups();
       listRol = catalogos.getCatRol();
       listUser = usuarios.getUsuarios();
       context = FacesContext.getCurrentInstance();
    }

    
    public void altaCatalogo(){
        try {
            if(!catRol.getRol().isEmpty()){
                catRol.setStatus(Constants.ACTIVO);
                catRol.setFechaIngreso(new Date());
                catRol.setUsuarioIngreso("Marco Demetrio");
                catalogos.insertRol(catRol);
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", catRol.getRol() + " guardado con exito!"));
                init();
            } else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "No ha ingresado ROL"));
            }          
        } catch (Exception e) {
            msg = e.getMessage();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", msg));
        }    
    }
    
    public void altaUsuario(){
        try {
            if(!opUsuarios.getName().isEmpty() || !opUsuarios.getUsername().isEmpty() || !opUsuarios.getPassword().isEmpty()){
                
                opGrupoUsuarios.setIdrol(idrol);
                opGrupoUsuarios.setIduser(opUsuarios.getIduser());
                usuarios.insertUsuario(opUsuarios);
                grupoUsuarios.insertUsuario(opGrupoUsuarios);
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", opUsuarios.getName() + " guardado con exito!"));
                init();
            }
            else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "No ha ingresado un dato"));
            }  
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public CatalogosInterface getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(CatalogosInterface catalogos) {
        this.catalogos = catalogos;
    }

    public CatRol getCatRol() {
        return catRol;
    }

    public void setCatRol(CatRol catRol) {
        this.catRol = catRol;
    }
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CatRol> getListRol() {
        return listRol;
    }

    public void setListRol(List<CatRol> listRol) {
        this.listRol = listRol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public UsuariosInterface getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuariosInterface usuarios) {
        this.usuarios = usuarios;
    }

    public Users getOpUsuarios() {
        return opUsuarios;
    }

    public void setOpUsuarios(Users opUsuarios) {
        this.opUsuarios = opUsuarios;
    }

    public List<Users> getListUser() {
        return listUser;
    }

    public void setListUser(List<Users> listUser) {
        this.listUser = listUser;
    }

    public UsersGroupsInterface getGrupoUsuarios() {
        return grupoUsuarios;
    }

    public void setGrupoUsuarios(UsersGroupsInterface grupoUsuarios) {
        this.grupoUsuarios = grupoUsuarios;
    }

    public UsersGroups getOpGrupoUsuarios() {
        return opGrupoUsuarios;
    }

    public void setOpGrupoUsuarios(UsersGroups opGrupoUsuarios) {
        this.opGrupoUsuarios = opGrupoUsuarios;
    }
    
    
}
