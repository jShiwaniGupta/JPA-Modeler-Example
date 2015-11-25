/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpamodeler.nsp;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author Shiwani Gupta <jShiwaniGupta@gmail.com>
 */
@Singleton
@LocalBean
@Startup
public class Tester {

    @PersistenceContext
    private EntityManager em;
    
    @PostConstruct
    void init(){
       
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("FindStudentByBatch");
        query.setParameter("BATCH_NO", 2012);
        
        List<Student> students = query.getResultList();
        
        System.out.println("Executing Stored Procedure Query ................");
        for(Student student : students){
            System.out.println("Student : " + student.getFname() +" "+ student.getLname());
        }
        
        
    }
}
