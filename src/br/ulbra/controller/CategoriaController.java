/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.controller;

import br.ulbra.DAO.CategoriaDAO;
import br.ulbra.model.Categoria;
import java.util.List;

/**
 *
 * @author Jeferson Leon
 */
public class CategoriaController {

    private final CategoriaDAO categoriaDAO = new CategoriaDAO();

    public int salvarCategoria(Categoria pcategoria) {
        return this.categoriaDAO.salvarCategoriaDAO(pcategoria);
    }

    public List<Categoria> getTodosClientesController() {
        return this.categoriaDAO.getTodosClientesDAO();
    }

    public boolean deleteController(Categoria pCategoria) {
        return this.categoriaDAO.deleteCategoriaDAO(pCategoria);
    }
}
