/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sipi.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Demetrio
 */
@Entity
@Table(name = "CatRol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatRol.findAll", query = "SELECT c FROM CatRol c"),
    @NamedQuery(name = "CatRol.findByIdrol", query = "SELECT c FROM CatRol c WHERE c.idrol = :idrol"),
    @NamedQuery(name = "CatRol.findByRol", query = "SELECT c FROM CatRol c WHERE c.rol = :rol"),
    @NamedQuery(name = "CatRol.findByStatus", query = "SELECT c FROM CatRol c WHERE c.status = :status"),
    @NamedQuery(name = "CatRol.findByFechaIngreso", query = "SELECT c FROM CatRol c WHERE c.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "CatRol.findByFechaModificacion", query = "SELECT c FROM CatRol c WHERE c.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "CatRol.findByUsuarioIngreso", query = "SELECT c FROM CatRol c WHERE c.usuarioIngreso = :usuarioIngreso"),
    @NamedQuery(name = "CatRol.findByUsuarioModificacion", query = "SELECT c FROM CatRol c WHERE c.usuarioModificacion = :usuarioModificacion")})
public class CatRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrol")
    private Integer idrol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol")
    private String rol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_ingreso")
    private String usuarioIngreso;
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;

    public CatRol() {
    }

    public CatRol(Integer idrol) {
        this.idrol = idrol;
    }

    public CatRol(Integer idrol, String rol, Character status, Date fechaIngreso, String usuarioIngreso) {
        this.idrol = idrol;
        this.rol = rol;
        this.status = status;
        this.fechaIngreso = fechaIngreso;
        this.usuarioIngreso = usuarioIngreso;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatRol)) {
            return false;
        }
        CatRol other = (CatRol) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.sipi.persistence.entity.CatRol[ idrol=" + idrol + " ]";
    }
    
}
