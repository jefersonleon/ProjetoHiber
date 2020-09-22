/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jeferson Leon
 */

@Entity (name="Categoria")
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id_categoria;
    @Column(name = "descricao")
    private String descricao;

    public Categoria() {
    }

    public Categoria(Integer id_categoria, String descricao) {
        this.id_categoria = id_categoria;
        this.descricao = descricao;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id_categoria=" + id_categoria + ", descricao=" + descricao + '}';
    }
    
    
    
}
