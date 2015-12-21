package com.jpamodeler.entitygraph;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EG_MOVIE_DIRECTOR")

public class MovieDirector implements Serializable {

    @Basic
    private String director;

    @Id
    private Integer id;

    public MovieDirector() {

    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
