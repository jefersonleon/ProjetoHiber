/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;



/**
 *
 * @author Jeferson Leon
 */
public class Main {
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        String sql = "select version()";
//        String resultado = (String)session.createNativeQuery(sql).getSingleResult();
//        System.out.println(resultado);
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("Salvando o Cliente");
//        CategoriaController categoriaController = new CategoriaController();
//        Categoria categoria = new Categoria("Xurumelas");
//        int idCategoria = categoriaController.salvarCategoria(categoria);
//        System.out.println("Categoria id:"+idCategoria);
        new FrmCategoria(null, true).setVisible(true);
        
    }
    
}
