package com.jpamodeler.entitygraph;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_AWARDS_ENTITY_GRAPH")

public class MovieAward implements Serializable {

    @Basic
    private String award;

    @Id
    private Integer id;

    public MovieAward() {

    }

    public String getAward() {
        return this.award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
