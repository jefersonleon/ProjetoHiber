/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.controller;

import br.ulbra.DAO.CategoriaDAO;
import br.ulbra.model.Categoria;

/**
 *
 * @author Jeferson Leon
 */
public class CategoriaController {
    private final CategoriaDAO categoriaDAO = new CategoriaDAO();
    public int salvarCategoria(Categoria pcategoria){
        return this.categoriaDAO.salvarCategoriaDAO(pcategoria);
    }
}
