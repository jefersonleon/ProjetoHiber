/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.conection.HibernateUtil;
import br.ulbra.model.Categoria;
import br.ulbra.model.Cliente;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jeferson Leon
 */
public class ClienteDAO {
     public int salvarClienteDAO(Cliente pcliente) {
        Session session = null;
        Integer idClienteInserido = 0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try {

            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            idClienteInserido = (Integer) session.save(pcliente);
            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return idClienteInserido;
    }

    public boolean atualizarClienteDAO(Cliente pcliente) {
        Session session = null;

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(pcliente);
            transaction.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return true;
    }

    public List<Cliente> getTodosClienteDAO() {
        List<Cliente> listaClientes = null;
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try {

            session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Cliente> criteriaQuery = builder.createQuery(Cliente.class
            );
            criteriaQuery
                    .from(Categoria.class
                    );
            listaClientes = session.createQuery(criteriaQuery).getResultList();

        } catch (HibernateException e) {

            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return listaClientes;
    }

    public boolean deleteClienteDAO(Cliente pCliente) {
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try {

            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.delete(pCliente);

            transaction.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return true;
    }

    public Cliente getClienteDAO(int idCliente) {
        Cliente cliente = null;
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            cliente
                    = (Cliente) session.get(Cliente.class,
                             idCliente);
            transaction.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return cliente;
    }
}
