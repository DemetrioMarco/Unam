/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Demetrio
 */
@ManagedBean (name = "Ctrl")
@SessionScoped
public class ControlMenu implements Serializable{
    
    private boolean btnBancosAltas;
    private boolean btnBancosBajas;
    private boolean btnBancosCambios;
    private boolean btnReportes;
    private boolean btnTipOfApertura;
    private boolean btnTipOfCancelacion;
    private boolean btnTipOfActualizacion;
    private boolean btnTipOfEntChequera;
    private boolean btnModOfApertura;
    private boolean btnModOfCancelacion;
    private boolean btnModOfActualizacion;
    private boolean btnModOfEntChequera;
    private boolean btnImpOfApertura;
    private boolean btnImpOfCancelacion;
    private boolean btnImpOfActualizacion;
    private boolean btnImpOfEntChequera;

    private boolean btnUsuario;
    private boolean btnCatalogos;
    
    @PostConstruct
    public void init(){
        btnBancosAltas = false;
        btnBancosBajas = false;
        btnBancosCambios = false;
        btnReportes = false;
        btnTipOfApertura = false;
        btnTipOfCancelacion = false;
        btnTipOfActualizacion = false;
        btnTipOfEntChequera = false;
        btnModOfApertura = false;
        btnModOfCancelacion = false;
        btnModOfActualizacion = false;
        btnModOfEntChequera = false;
        btnImpOfApertura = false;
        btnImpOfCancelacion = false;
        btnImpOfActualizacion = false;
        btnImpOfEntChequera = false;
        
        btnUsuario = false;
        btnCatalogos = false;
    }
       
    public void altasBancos(){
        init();
        btnBancosAltas = true;
    }
    
    public void bajasBancos(){
        init();
        btnBancosBajas = true;
    }
    
    public void cambiosBancos(){
        init();
        btnBancosCambios = true;
    }
    
    public void reportes(){
        init();
        btnReportes = true;
    }
    
    public void aperturaTipOf(){
        init();
        btnTipOfApertura = true;
    }
    
    public void cancelacionTipOf(){
        init();
        btnTipOfCancelacion = true;
    }
    
    public void actualizacionTipOf(){
        init();
        btnTipOfActualizacion = true;
    }
    
    public void entregaChequeraTipOf(){
        init();
        btnTipOfEntChequera = true;
    }
    
    public void aperturaModOf(){
        init();
        btnModOfApertura = true;
    }
    
    public void cancelacionModOf(){
        init();
        btnModOfCancelacion = true;
    }
    
    public void actualizacionModOf(){
        init();
        btnModOfActualizacion = true;
    }
    
    public void entregaChequeraModOf(){
        init();
        btnModOfEntChequera = true;
    }
    
    public void aperturaImpOf(){
        init();
        btnImpOfApertura = true;
    }
    
    public void cancelacionImpOf(){
        init();
        btnImpOfCancelacion = true;
    }
    
    public void actualizacionImpOf(){
        init();
        btnImpOfActualizacion = true;
    }
    
    public void entregaChequeraImpOf(){
        init();
        btnImpOfEntChequera = true;
    }
    
    public void usuariosAdmin(){
        init();
        btnUsuario = true;
    }
    
    public void catalogoAdmin(){
        init();
        btnCatalogos = true;
    }
    
    //Get and Set
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

    public boolean isBtnReportes() {
        return btnReportes;
    }

    public void setBtnReportes(boolean btnReportes) {
        this.btnReportes = btnReportes;
    }

    public boolean isBtnTipOfApertura() {
        return btnTipOfApertura;
    }

    public void setBtnTipOfApertura(boolean btnTipOfApertura) {
        this.btnTipOfApertura = btnTipOfApertura;
    }

    public boolean isBtnTipOfCancelacion() {
        return btnTipOfCancelacion;
    }

    public void setBtnTipOfCancelacion(boolean btnTipOfCancelacion) {
        this.btnTipOfCancelacion = btnTipOfCancelacion;
    }

    public boolean isBtnTipOfActualizacion() {
        return btnTipOfActualizacion;
    }

    public void setBtnTipOfActualizacion(boolean btnTipOfActualizacion) {
        this.btnTipOfActualizacion = btnTipOfActualizacion;
    }

    public boolean isBtnTipOfEntChequera() {
        return btnTipOfEntChequera;
    }

    public void setBtnTipOfEntChequera(boolean btnTipOfEntChequera) {
        this.btnTipOfEntChequera = btnTipOfEntChequera;
    }

    public boolean isBtnModOfApertura() {
        return btnModOfApertura;
    }

    public void setBtnModOfApertura(boolean btnModOfApertura) {
        this.btnModOfApertura = btnModOfApertura;
    }

    public boolean isBtnModOfCancelacion() {
        return btnModOfCancelacion;
    }

    public void setBtnModOfCancelacion(boolean btnModOfCancelacion) {
        this.btnModOfCancelacion = btnModOfCancelacion;
    }

    public boolean isBtnModOfActualizacion() {
        return btnModOfActualizacion;
    }

    public void setBtnModOfActualizacion(boolean btnModOfActualizacion) {
        this.btnModOfActualizacion = btnModOfActualizacion;
    }

    public boolean isBtnModOfEntChequera() {
        return btnModOfEntChequera;
    }

    public void setBtnModOfEntChequera(boolean btnModOfEntChequera) {
        this.btnModOfEntChequera = btnModOfEntChequera;
    }

    public boolean isBtnImpOfApertura() {
        return btnImpOfApertura;
    }

    public void setBtnImpOfApertura(boolean btnImpOfApertura) {
        this.btnImpOfApertura = btnImpOfApertura;
    }

    public boolean isBtnImpOfCancelacion() {
        return btnImpOfCancelacion;
    }

    public void setBtnImpOfCancelacion(boolean btnImpOfCancelacion) {
        this.btnImpOfCancelacion = btnImpOfCancelacion;
    }

    public boolean isBtnImpOfActualizacion() {
        return btnImpOfActualizacion;
    }

    public void setBtnImpOfActualizacion(boolean btnImpOfActualizacion) {
        this.btnImpOfActualizacion = btnImpOfActualizacion;
    }

    public boolean isBtnImpOfEntChequera() {
        return btnImpOfEntChequera;
    }

    public void setBtnImpOfEntChequera(boolean btnImpOfEntChequera) {
        this.btnImpOfEntChequera = btnImpOfEntChequera;
    }

    public boolean isBtnUsuario() {
        return btnUsuario;
    }

    public void setBtnUsuario(boolean btnUsuario) {
        this.btnUsuario = btnUsuario;
    }

    public boolean isBtnCatalogos() {
        return btnCatalogos;
    }

    public void setBtnCatalogos(boolean btnCatalogos) {
        this.btnCatalogos = btnCatalogos;
    }
    
}
