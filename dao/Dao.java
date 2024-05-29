/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kevin
 */
public abstract class Dao<T> {
    protected EntityManagerFactory emf;
    protected EntityManager em;
    
    public abstract Optional<T> get(long id);
    
    public abstract List<T> getAll();
    
    public abstract void save(T t);
    
    public abstract void update(T t, String[] params);
    
    public abstract void delete(T t);
    
    public Dao(){
        this.emf = Persistence.createEntityManagerFactory("TrabalhoProg_IIPU");
        this.em = emf.createEntityManager();
    }
    
}
