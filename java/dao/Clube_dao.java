/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import model.Clube;

/**
 *
 * @author kevin
 */
@Entity
public class Clube_dao implements Serializable, Dao<Clube> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

        return null;

    }

    @Override
    public List<Clube> getAll() {

        return null;

    }

    @Override
    public void save(Clube t) {

    }

    @Override
    public void update(Clube t, String[] params) {

    }

    @Override
    public void delete(Clube t) {

    }

}
