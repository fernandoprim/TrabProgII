/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.internal.jpa.EntityManagerFactoryProvider;

public class Gerenciador {
    
    public static EntityManager getEntityManager(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoProg_IIPU");
        EntityManager em = emf.createEntityManager();
        
        return em;
    }
    
}
