package com.jpamodeler.entitygraph.test;

import com.jpamodeler.entitygraph.Movie;
import com.jpamodeler.entitygraph.MovieActor;
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

        List<Movie> list = em.createNamedQuery("Movie.findAll", Movie.class)
                .setHint("javax.persistence.fetchgraph", em.getEntityGraph("movieWithActorsAndAwards"))
                .getResultList();
        System.out.println("List -: " + list);
        for (Movie movie : list) {
            System.out.println("Movie : " + movie.getName());
            for (MovieActor actor : movie.getMovieActors()) {
                System.out.println("Actor : " + actor.getActor());
            }
        }

    }
}
