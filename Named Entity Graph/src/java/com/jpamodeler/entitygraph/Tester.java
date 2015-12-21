package com.jpamodeler.entitygraph;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Shiwani Gupta
 */
@Singleton
@LocalBean
@Startup
public class Tester {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    void init() {

        List list = em.createNamedQuery("Movie.findAll")
                .setHint("javax.persistence.fetchgraph", em.getEntityGraph("movieWithActorsAndAwards"))
                .getResultList();
        System.out.println("List -: " + list);

    }
}
