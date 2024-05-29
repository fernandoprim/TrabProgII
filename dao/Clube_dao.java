/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import model.Clube;

public class Clube_dao extends Dao<Clube> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Clube_dao() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "dao.Clube_dao[ id=" + id + " ]";
    }

    @Override
    public Optional<Clube> get(long id) {
        return Optional.ofNullable(em.find(Clube.class, id));
    }

    //TERMINAR 
    @Override
    public List<Clube> getAll() {
        // REVISAR O c DA QUERY
        Query query = em.createQuery("SELECT c FROM Clube c");
        return query.getResultList();
    }

    @Override
    public void save(Clube t) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(t);
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.close();
        }
    }

    @Override
    public void update(Clube t, String[] params) {
        try {
            this.em.getTransaction().begin();
            this.em.merge(t);
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.close();
        }
    }

    @Override
    public void delete(Clube t) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(t);
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.close();
        }
    }

}
