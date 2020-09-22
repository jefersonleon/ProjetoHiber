/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.conection.HibernateUtil;
import br.ulbra.model.Categoria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jeferson Leon
 */
public class CategoriaDAO {

    public int salvarCategoriaDAO(Categoria pcategoria) {
        Session session = null;
        Integer id_categoriaInserida = 0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id_categoriaInserida = (Integer)session.save(pcategoria);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id_categoriaInserida;
    }

}
