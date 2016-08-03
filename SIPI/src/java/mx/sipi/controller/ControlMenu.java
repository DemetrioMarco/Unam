/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Demetrio
 */
@ManagedBean (name = "Ctrl")
@SessionScoped
public class ControlMenu {
    
    private boolean btnBancosAltas;
    private boolean btnBancosBajas;
    private boolean btnBancosCambios;
    
    @PostConstruct
    public void init(){
        btnBancosAltas = false;
        btnBancosBajas = false;
        btnBancosCambios = false;
    }
    
    public void altasBancos(){
        btnBancosAltas = true;
        btnBancosBajas = false;
        btnBancosCambios = false;
    }
    
    public void bajasBancos(){
        btnBancosAltas = false;
        btnBancosBajas = true;
        btnBancosCambios = false;
    }
    
    public void cambiosBancos(){
        btnBancosAltas = false;
        btnBancosBajas = false;
        btnBancosCambios = true;
    }

    public boolean isBtnBancosAltas() {
        return btnBancosAltas;
    }

    public void setBtnBancosAltas(boolean btnBancosAltas) {
        this.btnBancosAltas = btnBancosAltas;
    }

    public boolean isBtnBancosBajas() {
        return btnBancosBajas;
    }

    public void setBtnBancosBajas(boolean btnBancosBajas) {
        this.btnBancosBajas = btnBancosBajas;
    }

    public boolean isBtnBancosCambios() {
        return btnBancosCambios;
    }

    public void setBtnBancosCambios(boolean btnBancosCambios) {
        this.btnBancosCambios = btnBancosCambios;
    }
    
    

}
