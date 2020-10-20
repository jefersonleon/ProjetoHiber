/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jeferson Leon
 */
@Entity (name="Cliente")
@Table(name="tbCliente")
public class Cliente {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCli")
    private Integer idCli;
      @Column(name = "nomeCli")
    private String nomeCli;
       @Column(name = "telefoneCli")
    private String telefoneCli;
        @Column(name = "emailCli")
    private String emailCli;

    public Cliente() {
    }

    public Cliente(Integer idCli, String nomeCli, String telefoneCli, String emailCli) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.telefoneCli = telefoneCli;
        this.emailCli = emailCli;
    }

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getTelefoneCli() {
        return telefoneCli;
    }

    public void setTelefoneCli(String telefoneCli) {
        this.telefoneCli = telefoneCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCli=" + idCli + ", nomeCli=" + nomeCli 
                + ", telefoneCli=" + telefoneCli + ", emailCli=" + emailCli + '}';
    }
    
        
        
}
