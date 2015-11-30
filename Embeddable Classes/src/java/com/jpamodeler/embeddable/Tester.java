package com.jpamodeler.embeddable;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    void init() {

        System.out.println("Person : " + em.find(Person.class, 1L));

    }
}
