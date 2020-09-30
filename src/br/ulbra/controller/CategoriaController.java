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

    private final CategoriaDAO CategoriaDAO = new CategoriaDAO();

    public int salvarCategoriaController(Categoria pCategoria) {

        Categoria filmeExistente = this.getFilmeController(pCategoria.getId_categoria());

        if (filmeExistente == null) {
            return this.CategoriaDAO.salvarCategoriaDAO(pCategoria);
        } else {
            if (this.CategoriaDAO.atualizarCategoriaDAO(pCategoria)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public List<Categoria> getTodosCategoriaController() {
        return this.CategoriaDAO.getTodosCategoriasDAO();
    }

    public boolean deleteCategoriaController(Categoria pCategoria) {
        return this.CategoriaDAO.deleteCategoriaDAO(pCategoria);
    }

    public Categoria getFilmeController(int idCategoria) {
        return this.CategoriaDAO.getCategoriaDAO(idCategoria);
    }

}
