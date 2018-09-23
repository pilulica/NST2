/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.NstPrijava.domen;

import com.nst.NstPrijava.domen.Nastavnik;
import com.nst.NstPrijava.domen.RadnikSS;
import com.nst.NstPrijava.domen.Student;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ivan
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    ,
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u where u.username = :username")
    ,
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u where u.password=:password")
    ,
    @NamedQuery(name = "User.findByImeUsera", query = "SELECT u FROM User u where u.imeUsera=:imeUsera")
    ,
    @NamedQuery(name = "User.findByPrezimeUsera", query = "SELECT u FROM User u where u.prezimeUsera=:prezimeUsera")
    ,
    @NamedQuery(name = "User.findByTipUsera", query = "SELECT u FROM User u where u.tipUsera=:tipUsera")})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username")
    @NotNull
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @Column(name = "imeUsera")
    private String imeUsera;

    @Column(name = "prezimeUsera")
    private String prezimeUsera;

    @Column(name = "mailUsera")
    private String mailUsera;

    @Column(name = "passwordMailUsera")
    private String passwordMailUsera;

    @Column(name = "tipUsera")
    private String tipUsera;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "username")
    private Student student;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "username")
    private RadnikSS radnik;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "username")
    private Nastavnik nastavnik;

    public User(String username, String password, String imeUsera, String prezimeUsera, String mailUsera, String passwordMailUsera, String tipUsera, Student student, RadnikSS radnik, Nastavnik nastavnik) {
        this.username = username;
        this.password = password;
        this.imeUsera = imeUsera;
        this.prezimeUsera = prezimeUsera;
        this.mailUsera = mailUsera;
        this.passwordMailUsera = passwordMailUsera;
        this.tipUsera = tipUsera;
        this.student = student;
        this.radnik = radnik;
        this.nastavnik = nastavnik;
    }

    public User() {
    }

    public User(String username) {
        this.username = username;
    }
    
    

    public Nastavnik getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(Nastavnik nastavnik) {
        this.nastavnik = nastavnik;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public RadnikSS getRadnik() {
        return radnik;
    }

    public void setRadnik(RadnikSS radnik) {
        this.radnik = radnik;
    }

    @Override
    public String toString() {
        return imeUsera + " " + prezimeUsera;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImeUsera() {
        return imeUsera;
    }

    public void setImeUsera(String imeUsera) {
        this.imeUsera = imeUsera;
    }

    public String getPrezimeUsera() {
        return prezimeUsera;
    }

    public void setPrezimeUsera(String prezimeUsera) {
        this.prezimeUsera = prezimeUsera;
    }

    public String getMailUsera() {
        return mailUsera;
    }

    public void setMailUsera(String mailUsera) {
        this.mailUsera = mailUsera;
    }

    public String getPasswordMailUsera() {
        return passwordMailUsera;
    }

    public void setPasswordMailUsera(String passwordMailUsera) {
        this.passwordMailUsera = passwordMailUsera;
    }

    public String getTipUsera() {
        return tipUsera;
    }

    public void setTipUsera(String tipUsera) {
        this.tipUsera = tipUsera;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.username);
        hash = 67 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

}
